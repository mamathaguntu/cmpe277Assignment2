package cmpe277.sjsu.edu.newsapp.Fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.fragment.app.Fragment
import cmpe277.sjsu.edu.newsapp.R
import cmpe277.sjsu.edu.newsapp.UI.NewsView
import androidx.navigation.fragment.navArgs
import cmpe277.sjsu.edu.newsapp.UI.MainActivity

import android.webkit.WebViewClient

class DetailedNews: Fragment(R.layout.fragment_detailed_news) {
    lateinit var viewModel: NewsView
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        val article = args.article

        R.id.webView.apply {
            val webViewClient = WebViewClient()
            loadUrl(article.url)
        }
    }
}