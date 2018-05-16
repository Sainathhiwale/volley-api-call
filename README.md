# volley-api-call
### What is Volley ?
Android volley is a networking library was introduced to make networking calls much easier, faster without writing tons of code. By default all the volley network calls works asynchronously, so we don't have to worry about using asynctask anymore

### Why Volley ?
* Avoid HttpUrlConnection and HttpClient
* Avoid AsyncTask
* It's Much Faster
* It Caches Everything
* Small Metadata Operations

### Add Volley dependencies inside build.gradle file (App level)
dependencies {
   
    implementation 'com.android.volley:volley:1.1.0'
    
}

### call github api users using volley



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringRequest request = new StringRequest(BASE_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("Code:",response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);

    }
}

### output 

[{"login":"mojombo","id":1,"avatar_url":"https://avatars0.githubusercontent.com/u/1?v=4","gravatar_id":"","url":"https://api.github.com/users/mojombo","html_url":"https://github.com/mojombo","followers_url":"https://api.github.com/users/mojombo/followers","following_url":"https://api.github.com/users/mojombo/following{/other_user}","gists_url":"https://api.github.com/users/mojombo/gists{/gist_id}","starred_url":"https://api.github.com/users/mojombo/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/mojombo/subscriptions","organizations_url":"https://api.github.com/users/mojombo/orgs","repos_url":"https://api.github.com/users/mojombo/repos","events_url":"https://api.github.com/users/mojombo/events{/privacy}","received_events_url":"https://api.github.com/users/mojombo/received_events","type":"User","site_admin":false},{"login":"defunkt","id":2,"avatar_url":"https://avatars0.githubusercontent.com/u/2?v=4","gravatar_id":"","url":"https://api.github.com/users/defunkt","html_url":"https://github.com/defunkt","followers_url":"https://api.github.com/users/defunkt/followers","following_url":"https://api.github.com/users/defunkt/following{/other_user}","gists_url":"https://api.github.com/users/defunkt/gists{/gist_id}","starred_url":"https://api.github.com/users/defunkt/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/defunkt/subscriptions","organizations_url":"https://api.github.com/users/defunkt/orgs","repos_url":"https://api.github.com/users/defunkt/repos","events_url":"https://api.github.com/users/defunkt/events{/privacy}","received_events_url":"https://api.github.com/users/defunkt/received_events","type":"User","site_admin":true},{"login":"pjhyett","id":3,"avatar_url":"https://avatars0.githubusercontent.com/u/3?v=4","gravatar_id":"","url":"https://api.github.com/users/pjhyett","html_url":"https://github.com/pjhyett","followers_url":"https://api.github.com/users/pjhyett/followers","following_url":"https://api.github.com/users/pjhyett/following{/other_user}","gists_url":"https://api.github.com/users/pjhyett/gists{/gist_id}","starred_url":"https://api.github.com/users/pjhyett/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/pjhyett/subscriptions","organizations_url":"https://api.github.com/users/pjhyett/orgs","repos_url":"https://api.github.com/users/pjhyett/repos","events_url":"https://api.github.com/users/pjhyett/events{/privacy}","received_events_url":"https://api.github.com/users/pjhyett/received_events","type":"User","site_admin":false},{"login":"wycats","id":4,"avatar_url":"https://avatars0.githubusercontent.com/u/4?v=4","gravatar_id":"","url":"https://api.github.com/users/wycats","html_url":"https://github.com/wycats","followers_url":"https://api.github.com/users/wycats/followers","following_url":"https://api.github.com/users/wycats/following{/other_user}","gists_url":"https://api.github.com/users/wycats/gists{/gist_id}","starred_url":"https://api.github.com/users/wycats/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/wycats/subscriptions","organizations_url":"https://api.github.com/users/wycats/orgs","repos_url":"https://api.github.com/users/wycats/repos","events_url":"https://api.github.com/users/wycats/events{/privacy}","received_events_url":"https://api.github.com/users/wycats/received_events","type":"User","site_admin":false},{"login":"ezmobius","id":5,"avatar_url":"https://avatars0.githubusercontent.com/u/5?v=4","gravatar_id":"","url":"https://api.github.com/users/ezmobius","html_url":"https://github.com/ezmobius","followers_url":"https://api.github.com/users/ezmobius/followers","following_url":"https://api.github.com/users/ezmobius/following{/other_user}","gists_url":"https://api.github.com/users/ezmobius/gists{/gist_id}","starred_url":"https://api.github.com/users/ezmobius/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/ezmobius/subscriptions","organizations_url":"https://api.github.com/users/ezmobius/orgs","repos_url":"https://api.github.com/users/ezmobius/repos",

using Log.d("Code:",response); get result on logcat.

### use Gson Library to serialization and deserialization

Gson is a Java library that can be used to convert Java Objects into their JSON representation. It can also be used to convert a JSON string to an equivalent Java object.

### what is serialization and deserialization

A serializer allows to convert a Json string to corresponding Java type and a deserializers allows to convert from Java to a JSON representation. 

### Create Gson Instance 
{
                GsonBuilder builder = new GsonBuilder();
                Gson gson = builder.create();
                User[] users= gson.fromJson(response,User[].class);
  }






