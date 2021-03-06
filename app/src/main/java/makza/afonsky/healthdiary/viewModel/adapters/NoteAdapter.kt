package makza.afonsky.healthdiary.viewModel.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.model.data.Note
import kotlin.time.days

class NoteAdapter(private val noteList: MutableList<Note>) : RecyclerView.Adapter<NoteViewHolder>() {



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
        val curNote = noteList[position]
        holder._dateCreated.text = curNote.dateCreated.toString()
        holder._textNote.text = curNote.textNote
    }



}