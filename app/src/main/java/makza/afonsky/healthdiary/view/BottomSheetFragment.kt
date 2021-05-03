package makza.afonsky.healthdiary.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import makza.afonsky.healthdiary.R

class BottomSheetFragment: BottomSheetDialogFragment(){

//    private val viewModel by viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.bottomsheet_fragment, container, false)
        return rootView
    }


}