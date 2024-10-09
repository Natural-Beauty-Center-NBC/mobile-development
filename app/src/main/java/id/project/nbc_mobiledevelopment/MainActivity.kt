package id.project.nbc_mobiledevelopment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.project.nbc_mobiledevelopment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}