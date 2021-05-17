package cmpe277.sjsu.edu.newsapp.API

import cmpe277.sjsu.edu.newsapp.NewsResponse
import cmpe277.sjsu.edu.newsapp.util.Keys
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    //get the news articles from the API , considering only the headlines for the assignment
    @GET("v2/top-headlines")
    suspend fun getNews(
        @Query("country")
        countryCode : String = "us",
        @Query("page")
        pageNoum:Int =1,
        @Query("apiKey")
        apiKey: String = Keys.API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchCategory(
            @Query("country")
            searchQuery : String,
            @Query("page")
            pageNoum:Int =1,
            @Query("apiKey")
            apiKey: String = Keys.API_KEY
    ): Response<NewsResponse>
}