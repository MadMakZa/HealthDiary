package makza.afonsky.healthdiary.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import makza.afonsky.healthdiary.R
import makza.afonsky.healthdiary.databinding.ActivityMainBinding
import makza.afonsky.healthdiary.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.executePendingBindings()

        binding.btnShowSheet.setOnClickListener {
//            showBottomSheetFragment()
        }

    }

//    //показать нижний диалог
//    fun showBottomSheetFragment() {
//        val bottomSheetFragment = BottomSheetFragment()
//        bottomSheetFragment.show(supportFragmentManager, "bottomSheetFragment")
//    }




}