package makza.afonsky.healthdiary.viewModel.adapters

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import makza.afonsky.healthdiary.R

class NoteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val _name: TextView = itemView.findViewById(R.id.notetext) as TextView
    val _checkBox: CheckBox = itemView.findViewById(R.id.checkBox) as CheckBox

}