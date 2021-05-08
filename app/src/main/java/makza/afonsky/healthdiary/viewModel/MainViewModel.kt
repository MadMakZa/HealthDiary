package makza.afonsky.healthdiary.viewModel


import androidx.lifecycle.ViewModel
import makza.afonsky.healthdiary.viewModel.adapters.NoteAdapter


open class MainViewModel: ViewModel() {

    fun onClickAddNote(){
        println("NOTE ADDED!!!!!!!!!!!!!")
    }



}