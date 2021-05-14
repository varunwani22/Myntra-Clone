<h1>Myntra (Clone of shopping app)</h1>
<p>E commers Application use widely for shopping clothes.</p>
<hr>
<h3>Used Technologies</h3>
<ul>
  <li>Java</li>
  <li>JSON assects</li>
  <li>API</li>
  <li>Recycler View</li>
  <li>Shared Preference</li>	
</ul>  
<hr>
<h3>Features</h3>
<p>Application shows various kinds of categories like men, women, kids (cloths), shoes, furniture, etc. User can view item he/she wants. check details about products. Buy them. </p>
<h3>Screenshort and description</h3>
<img src="WhatsApp Image 2021-02-09 at 10.38.30 AM.jpeg" width="500" height="333">
<p>Home screen where all categories are shown, various new items, list of special items,etc</p>

<img src="WhatsApp Image 2021-02-09 at 10.35.04 AM (6).jpeg" width="500" height="333">
<p>List of available item user seeking for and detail description.</p>

<img src="WhatsApp Image 2021-02-09 at 10.35.04 AM (7).jpeg" width="500" height="333">
<p>Details of item like price, size, rating, reviews user intrested in, and page of order where user can place order.</p>

<img src="WhatsApp Image 2021-02-09 at 10.35.04 AM (5).jpeg" width="500" height="333">
<p>Login is neccessary to place order.</p>
<img src="WhatsApp Image 2021-02-09 at 10.35.04 AM (3).jpeg" width="500" height="333">
<p>Studio page where user can share their experience with images. Even they can share those with persons which is intrested in similar.</p>
<img src="WhatsApp Image 2021-02-09 at 10.35.04 AM (1).jpeg" width="500" height="333">
<p>Categories and explore pages where user can find items they are intrested in with sorting by categories.</p>
<hr>
<h3>Dependencies</h3>
<hr>

    implementation 'com.github.bumptech.glide:glide:4.11.0'
    // Glide v4 uses this new annotation processor -- see https://bumptech.github.io/glide/doc/generatedapi.html
    annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
    // Retrofit & OkHttp
    implementation 'com.squareup.retrofit2:retrofit:2.5.0'
    // This library is used by retrofit internally to convert json-pojo and pojo-json
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
    //This library is used to observe the API logs, Http status code and the API response
    implementation 'com.squareup.okhttp3:logging-interceptor:3.8.0'
    
    implementation 'com.google.code.gson:gson:2.8.6'
    // This library is used by retrofit internally to convert pojo-gson
