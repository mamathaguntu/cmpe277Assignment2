package cmpe277.sjsu.edu.newsapp.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cmpe277.sjsu.edu.newsapp.repo.NewsRepo


class NewsViewModelProviderFactory(
    val newsRepository: NewsRepo
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsView(newsRepository) as T
    }
}