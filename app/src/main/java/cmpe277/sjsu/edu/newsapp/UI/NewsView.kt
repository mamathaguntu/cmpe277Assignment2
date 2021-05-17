package cmpe277.sjsu.edu.newsapp.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cmpe277.sjsu.edu.newsapp.models.NewsResponse
import cmpe277.sjsu.edu.newsapp.repo.NewsRepo
import cmpe277.sjsu.edu.newsapp.util.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsView(  val newsRepository: NewsRepo
) : ViewModel() {

    val newsArticles: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var newsPage = 1

    val searchNews: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var searchNewsPage = 1

    init {
        getNews("us")
    }

    fun getNews(countryCode: String) = viewModelScope.launch {
        newsArticles.postValue(Resource.Loading())
        val response = newsRepository.getNews(countryCode, newsPage)
        newsArticles.postValue(handleNewsArticles(response))
    }

    fun searchNews(searchQuery: String) = viewModelScope.launch {
        searchNews.postValue(Resource.Loading())
        val response = newsRepository.searchNews(searchQuery, searchNewsPage)
        searchNews.postValue(handleSearchNewsResponse(response))
    }

    private fun handleNewsArticles(response: Response<NewsResponse>) : Resource<NewsResponse> {
        if(response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }

    private fun handleSearchNewsResponse(response: Response<NewsResponse>) : Resource<NewsResponse> {
        if(response.isSuccessful) {
            response.body()?.let { resultResponse ->
                return Resource.Success(resultResponse)
            }
        }
        return Resource.Error(response.message())
    }
}

