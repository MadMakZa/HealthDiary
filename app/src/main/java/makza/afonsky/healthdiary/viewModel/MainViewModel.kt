package makza.afonsky.healthdiary.viewModel


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import makza.afonsky.healthdiary.model.data.Note


open class MainViewModel: ViewModel() {

    val liveData = MutableLiveData<ArrayList<Note>>()
    private val noteListItems = ArrayList<Note>()


    init {
            addItems()
            liveData.value = noteListItems
        }

        private fun addItems() {
            noteListItems.add(Note("Max", 2001))
            noteListItems.add(Note("Jacks", 2011))
            noteListItems.add(Note("Musk", 2012))
            noteListItems.add(Note("Bill", 2013))
            noteListItems.add(Note("Debil", 2014))
            noteListItems.add(Note("Latosy", 2015))
            noteListItems.add(Note("Artosis", 2016))
            noteListItems.add(Note("Max", 2001))
            noteListItems.add(Note("Jacks", 2011))
            noteListItems.add(Note("Musk", 2012))
            noteListItems.add(Note("Bill", 2013))
            noteListItems.add(Note("Debil", 2014))
            noteListItems.add(Note("Latosy", 2015))
            noteListItems.add(Note("Artosis", 2016))
            noteListItems.add(Note("Max", 2001))
            noteListItems.add(Note("Jacks", 2011))
            noteListItems.add(Note("Musk", 2012))
            noteListItems.add(Note("Bill", 2013))
            noteListItems.add(Note("Debil", 2014))
            noteListItems.add(Note("Latosy", 2015))
            noteListItems.add(Note("Artosis", 2016))
        }



}