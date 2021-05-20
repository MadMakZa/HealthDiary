package makza.afonsky.healthdiary.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import makza.afonsky.healthdiary.databinding.ActivityMainBinding
import makza.afonsky.healthdiary.model.data.Note
import makza.afonsky.healthdiary.viewModel.MainViewModel
import makza.afonsky.healthdiary.viewModel.adapters.NoteAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var viewModel = MainViewModel()

    private lateinit var noteAdapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()


    }

    fun initRecyclerView(){
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerview.layoutManager = linearLayoutManager
        val items = ArrayList<Note>()
        items.add(Note("Max",10))
        items.add(Note("Jacks",11))
        items.add(Note("Musk",12))
        noteAdapter = NoteAdapter(items)
        binding.recyclerview.adapter = noteAdapter


    }




}

