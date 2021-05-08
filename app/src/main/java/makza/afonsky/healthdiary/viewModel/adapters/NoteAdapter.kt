package makza.afonsky.healthdiary.viewModel.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.model.Note

class NoteAdapter(items: ArrayList<Note>) : RecyclerView.Adapter<NoteViewHolder>() {

    //лист с заметками
    private val noteList = mutableListOf<Note>()

    //наполняет лист заметками
    fun addNote(note: Note){
        noteList.add(note)
        notifyDataSetChanged() //обновляет данные в адаптере (на экране)
    }


    //вызывается для создания каждой ячейки
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.cardview_fragment, parent, false)
        return NoteViewHolder(itemView)
    }

    //вернуть количество элементов в списке
    override fun getItemCount(): Int {
        return noteList.size
    }

    //заполняет экран видимыми ячейками и обновляет данные (при скроллинге)
    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.bind(noteList[position])
    }



}