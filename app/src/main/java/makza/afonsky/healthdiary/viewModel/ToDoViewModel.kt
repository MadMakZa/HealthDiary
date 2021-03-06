package makza.afonsky.healthdiary.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import makza.afonsky.healthdiary.model.db.ToDoData
import makza.afonsky.healthdiary.model.db.ToDoDatabase
import makza.afonsky.healthdiary.model.db.ToDoRepository

open class ToDoViewModel(application: Application): AndroidViewModel(application) {

    private var toDoDao = ToDoDatabase.getDatabase(application).toDoDao()
    private val repository: ToDoRepository

    private val getAllData: LiveData<List<ToDoData>>

    init {
        repository = ToDoRepository(toDoDao)
        getAllData = repository.getAllData
    }

    fun insertData(toDoData: ToDoData){
        viewModelScope.launch(Dispatchers.IO) {
            repository.insertData(toDoData)
        }
    }

}