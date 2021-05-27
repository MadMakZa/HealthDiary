package makza.afonsky.healthdiary.view.fragments

import android.widget.EditText
import androidx.fragment.app.Fragment
import makza.afonsky.healthdiary.R

class EditNoteFragment: Fragment(R.layout.editnote_fragment) {

    override fun onStart() {
        super.onStart()

        val title: EditText? = activity?.findViewById(R.id.et_title)
        val description: EditText? = activity?.findViewById(R.id.et_description)



    }
}