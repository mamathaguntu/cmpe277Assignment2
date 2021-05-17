package cmpe277.sjsu.edu.newsapp.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import cmpe277.sjsu.edu.newsapp.Adapter.NewsAdapter
import cmpe277.sjsu.edu.newsapp.R
import cmpe277.sjsu.edu.newsapp.UI.MainActivity
import cmpe277.sjsu.edu.newsapp.UI.NewsView

class NewsArticles: Fragment(R.layout.fragment_news_articles) {

    lateinit var viewModel: NewsView
    lateinit var newsAdapter: NewsAdapter

    val TAG = "NewsArticlesFragment"
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        setupRecyclerView()

        newsAdapter.setOnItemClickListener {
            val bundle = Bundle().apply {
                putSerializable("article", it)
            }
            findNavController().navigate(
                R.id.action_newsArticles_to_detailedNews,
                bundle
            )
        }


    }

    private fun setupRecyclerView() {
        newsAdapter = NewsAdapter()
        R.id.rvNewsArticles.apply {
            val adapter = newsAdapter
            val layoutManager = LinearLayoutManager(activity)
        }
    }
}

