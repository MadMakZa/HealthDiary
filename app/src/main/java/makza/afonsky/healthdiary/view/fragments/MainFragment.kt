package makza.afonsky.healthdiary.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.model.data.Note
import makza.afonsky.healthdiary.viewModel.MainViewModel
import makza.afonsky.healthdiary.viewModel.adapters.NoteAdapter


class MainFragment: Fragment() {

    private lateinit var noteAdapter: NoteAdapter
    private lateinit var recyclerview: RecyclerView


    private lateinit var viewModel: MainViewModel
    private var items = ArrayList<Note>()



    override fun onStart() {
        super.onStart()

        viewModel.liveData.observe(this, Observer {
            items.addAll(it)
        })


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = MainViewModel()
        val v: View = inflater.inflate(R.layout.main_fragment, container, false)
        val linearLayoutManager = LinearLayoutManager(activity)
        recyclerview = v.findViewById(R.id.recyclerview)
        recyclerview.setHasFixedSize(true)

        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerview.layoutManager = linearLayoutManager

        noteAdapter = NoteAdapter(items)
        recyclerview.adapter = noteAdapter


        return v
    }



}