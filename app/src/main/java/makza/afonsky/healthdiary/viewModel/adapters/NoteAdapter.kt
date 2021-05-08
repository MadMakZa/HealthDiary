package makza.afonsky.healthdiary.viewModel.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import makza.afonsky.healthdiary.model.Note

class NoteAdapter: RecyclerView.Adapter<NoteViewHolder>() {

    //лист с заметками
    private val noteList = mutableListOf<Note>()

    //наполняет лист заметками
    fun addNote(note: Note){
        noteList.add(note)
        notifyDataSetChanged() //обновляет данные в адаптере (на экране)
    }


    //вызывается для создания каждой ячейки
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}