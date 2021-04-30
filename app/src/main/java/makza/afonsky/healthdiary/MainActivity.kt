package makza.afonsky.healthdiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import makza.afonsky.healthdiary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val bottomSheetFragment = BottomSheetFragment()

        bindingClass.btnShowSheet.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager, "ButtonSheetDialog")
        }
    }
}