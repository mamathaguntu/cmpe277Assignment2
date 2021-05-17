# cmpe277Assignment2 - Cloud Connected App

- Selected Topic - 5 Android: Display the news from news/twitter apis via Retrofit, Moshi, livedata and binding. 
 
This News App is developed in Kotlin with MVVM architecture.

Display all the news articles from the api, with 2 options at the bottom navigation 
 1. list all the news articles 
 2. search news based on the keywords provided.

<img src ="https://user-images.githubusercontent.com/2658837/118466100-65e97080-b6b7-11eb-9d09-d11531147640.png" width="300" height="600"/>

<img src ="https://user-images.githubusercontent.com/2658837/118466513-c7a9da80-b6b7-11eb-90a6-757f1a2b5b1e.png" width="300" height="600"/>

Click on a news article to get the detailed view 

<img src ="https://user-images.githubusercontent.com/2658837/118466429-b3fe7400-b6b7-11eb-958a-559aa56a32ae.png" width="300" height="600"/>

click on the search and specify a kweyword( example - stock or covid)

<img src ="https://user-images.githubusercontent.com/2658837/118466842-16f00b00-b6b8-11eb-8340-3ecf390a6c7d.png" width="300" height="600"/>

<img src ="https://user-images.githubusercontent.com/2658837/118466931-2ec78f00-b6b8-11eb-8c6e-c31cca7f58aa.png" width="300" height="600"/>

<img src ="https://user-images.githubusercontent.com/2658837/118467015-4868d680-b6b8-11eb-9cdc-dac5ad3416a5.png" width="300" height="600"/>

- Components
-- Created 3 fragments - listing the news , detailed view and search news 
-- Created response class using retrofit for the response of api 
-- Created data entity class for the news articles details
-- Used live data to get and search the news articles

All the news articles are retrived from NEWSAPI.org

