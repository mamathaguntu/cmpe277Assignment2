package cmpe277.sjsu.edu.newsapp.repo

import cmpe277.sjsu.edu.newsapp.API.RetrofitInstance
import cmpe277.sjsu.edu.newsapp.database.ArticleDatabase

class NewsRepo(val db: ArticleDatabase) {
    suspend fun getNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchCategory(searchQuery, pageNumber)
}