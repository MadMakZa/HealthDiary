package makza.afonsky.healthdiary.viewModel


import android.util.Log
import androidx.lifecycle.ViewModel


class MainViewModel: ViewModel() {

    fun onClickAddNote(){
        Log.d("test", "clicked Add NOTE")
        println("NOTE ADDED!!!!!!!!!!!!!")
    }

}