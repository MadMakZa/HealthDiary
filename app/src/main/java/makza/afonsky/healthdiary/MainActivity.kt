package makza.afonsky.healthdiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import makza.afonsky.healthdiary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.executePendingBindings()

        val bottomSheetFragment = BottomSheetFragment()

        binding.btnShowSheet.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager, "ButtonSheetDialog")
        }
    }
}