package makza.afonsky.healthdiary.viewModel.adapters

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import makza.afonsky.healthdiary.R

class NoteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val _textNote: TextView = itemView.findViewById(R.id.tvText) as TextView
    val _dateCreated: TextView = itemView.findViewById(R.id.tvDate) as TextView

}