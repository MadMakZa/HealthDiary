package makza.afonsky.healthdiary.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.databinding.BottomsheetFragmentBinding

open class BottomSheetFragment: BottomSheetDialogFragment(){

    private lateinit var binding: BottomsheetFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.bottomsheet_fragment, container, false)
        return binding.root
    }



}