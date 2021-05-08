package makza.afonsky.healthdiary.viewModel.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.model.Note
import makza.afonsky.healthdiary.R.layout.cardview_fragment
import makza.afonsky.healthdiary.R.layout.activity_main

class NoteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val _name: TextView = itemView.findViewById(R.id.notename) as TextView
    val _surname: TextView = itemView.findViewById(R.id.notesurname) as TextView

    //заполнение ячейки данными
    fun bind(note: Note){
        with(itemView){
            note.run {
                _name.text = name
                _surname.text = surname
            }
        }
    }
}