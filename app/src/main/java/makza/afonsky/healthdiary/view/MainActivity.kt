package makza.afonsky.healthdiary.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.databinding.ActivityMainBinding
import makza.afonsky.healthdiary.model.data.Note
import makza.afonsky.healthdiary.view.fragments.EditNoteFragment
import makza.afonsky.healthdiary.view.fragments.MainFragment
import makza.afonsky.healthdiary.viewModel.MainViewModel
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private var items = ArrayList<Note>()

//    private lateinit var noteAdapter: NoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

//        initRecyclerView()
        setFragments()



    }

    override fun onStart() {
        super.onStart()
//        viewModel.liveData.observe(this, Observer {
//            items.addAll(it)
//        })
    }

//    fun initRecyclerView(){
//        val linearLayoutManager = LinearLayoutManager(applicationContext)
//        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
//        binding.recyclerview.layoutManager = linearLayoutManager
//        noteAdapter = NoteAdapter(items)
//        binding.recyclerview.adapter = noteAdapter
//
//    }

    private fun setFragments() {
        val mainFragment = MainFragment()
        val fragmentEditNote = EditNoteFragment()
        //установить по умолчанию фрагмент
        supportFragmentManager.beginTransaction().apply {
            setCustomAnimations(R.anim.enter_anim, R.anim.exit_anim)
            replace(R.id.container_fragment, mainFragment)
            commit()
        }

        binding.idBottomsheet.btnCreateNewNote.setOnClickListener {
//            binding.idBottomsheet.bottomSheet.visibility = View.INVISIBLE

            supportFragmentManager.beginTransaction().apply {
                setCustomAnimations(R.anim.enter_anim, R.anim.exit_anim)
                replace(R.id.container_fragment, fragmentEditNote)
                addToBackStack(null)
                commit()
            }
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        binding.idBottomsheet.bottomSheet.visibility = View.VISIBLE

    }
}

