package cmpe277.sjsu.edu.newsapp.UI

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import cmpe277.sjsu.edu.newsapp.R
import cmpe277.sjsu.edu.newsapp.database.ArticleDatabase
import cmpe277.sjsu.edu.newsapp.repo.NewsRepo
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: NewsView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val newsRepo = NewsRepo(ArticleDatabase(this))
        val viewModelFactory = NewsViewModelProviderFactory(newsRepo)
        viewModel = ViewModelProvider(this, viewModelFactory).get(NewsView::class.java)

        bottomNavigationView.setupWithNavController(Navigation.findNavController(this, R.id.newsNavHostFragment))
    }
}