package makza.afonsky.healthdiary.view.fragments

import android.app.Application
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.floatingactionbutton.FloatingActionButton
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.model.db.Priority
import makza.afonsky.healthdiary.model.db.ToDoData
import makza.afonsky.healthdiary.viewModel.MainViewModel
import makza.afonsky.healthdiary.viewModel.MainViewModelFactory
import makza.afonsky.healthdiary.viewModel.ToDoViewModel

class EditNoteFragment: Fragment() {

    private lateinit var mToDoViewModel: ToDoViewModel
//    private lateinit var viewModel: MainViewModel

    lateinit var btnSaveNote: FloatingActionButton
    lateinit var title: EditText
    lateinit var description: EditText
    lateinit var spinner: Spinner

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        viewModel = MainViewModel()
        mToDoViewModel = ViewModelProvider(this, MainViewModelFactory(application = Application())).get(ToDoViewModel::class.java)

        val v: View = inflater.inflate(R.layout.editnote_fragment, container, false)
        return v
    }
    override fun onStart() {
        super.onStart()

        title = activity?.findViewById(R.id.et_title)!!
        description = activity?.findViewById(R.id.et_description)!!
        btnSaveNote = activity?.findViewById(R.id.btnSaveNote)!!
        spinner = activity?.findViewById(R.id.spinner)!!

        saveNote()


    }



    private fun saveNote(){
        //сохранить данные
        insertDataToDb()
        //переход на мейн экран
        val mainFragment = MainFragment()
        btnSaveNote.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.apply {
                setCustomAnimations(R.anim.enter_anim, R.anim.exit_anim)
                replace(R.id.container_fragment, mainFragment)
                addToBackStack(null)
                commit()
            }
        }
    }

    private fun insertDataToDb() {
        val mTitle = title.text.toString()
        val mPriority = spinner.selectedItem.toString()
        val mDescription = description.text.toString()

        val validation = verifyDataFromUser(mTitle, mDescription)
        if (validation){
            val newData = ToDoData(
                0,
                mTitle,
                parsePriority(mPriority),
                mDescription
            )
            mToDoViewModel.insertData(newData)
            Toast.makeText(requireContext(), "Note Added", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireContext(), "empty", Toast.LENGTH_SHORT).show()
        }


    }

    private fun verifyDataFromUser(title: String, description: String): Boolean {
        return if (TextUtils.isEmpty(title) || TextUtils.isEmpty(description)) {
            false
        } else !(title.isEmpty() || description.isEmpty())
    }
    private fun parsePriority(priority: String): Priority {
        return when(priority){
            "High Priority" -> {Priority.HIGH}
            "Medium Priority" -> {Priority.MEDIUM}
            "Low Priority" -> {Priority.LOW}
            else -> Priority.LOW
        }
    }

}