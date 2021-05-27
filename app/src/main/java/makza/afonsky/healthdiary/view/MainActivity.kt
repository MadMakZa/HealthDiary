package makza.afonsky.healthdiary.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.databinding.ActivityMainBinding
import makza.afonsky.healthdiary.model.data.Note
import makza.afonsky.healthdiary.view.fragments.EditNoteFragment
import makza.afonsky.healthdiary.viewModel.MainViewModel
import makza.afonsky.healthdiary.viewModel.adapters.NoteAdapter
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private var items = ArrayList<Note>()

    private lateinit var noteAdapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        initRecyclerView()
        createNewNote()



    }

    override fun onStart() {
        super.onStart()
        viewModel.liveData.observe(this, Observer {
            items.addAll(it)
        })
    }

    fun initRecyclerView(){
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerview.layoutManager = linearLayoutManager
        noteAdapter = NoteAdapter(items)
        binding.recyclerview.adapter = noteAdapter

    }

    fun createNewNote(){
        binding.idBottomsheet.btnCreateNewNote.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                val fragmentEditNote = EditNoteFragment()
                replace(R.id.container_fragment, fragmentEditNote)
                addToBackStack(null)
                commit()
            }
        }
    }




}

