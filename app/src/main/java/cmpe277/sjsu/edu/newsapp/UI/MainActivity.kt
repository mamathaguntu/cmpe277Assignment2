package cmpe277.sjsu.edu.newsapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import cmpe277.sjsu.edu.newsapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val newsNavHostFragment: NavHostFragment = findViewById(R.id.newsNavHostFragment)
        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}