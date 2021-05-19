package makza.afonsky.healthdiary.viewModel.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import makza.afonsky.healthdiary.R

class NoteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val _name: TextView = itemView.findViewById(R.id.notename) as TextView
    val _surname: TextView = itemView.findViewById(R.id.notesurname) as TextView

}