package makza.afonsky.healthdiary.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.databinding.ActivityMainBinding
import makza.afonsky.healthdiary.databinding.BottomsheetFragmentBinding
import makza.afonsky.healthdiary.model.Note
import makza.afonsky.healthdiary.viewModel.MainViewModel
import makza.afonsky.healthdiary.viewModel.adapters.NoteAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingBottomSheet: BottomsheetFragmentBinding
    private var viewModel = MainViewModel()

    private lateinit var noteAdapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        bindingBottomSheet = binding.idBottomsheet
        binding.executePendingBindings()

        initRecyclerView()


    }

    fun initRecyclerView(){
        val linearLayoutManager = LinearLayoutManager(applicationContext)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recyclerview.layoutManager = linearLayoutManager
        val items = ArrayList<Note>()
        items.add(Note("Max","Attacks"))
        items.add(Note("Jacks","Hacks"))
        items.add(Note("Musk","Go to Mars"))
        noteAdapter = NoteAdapter(items)
        binding.recyclerview.adapter = noteAdapter


    }




}

