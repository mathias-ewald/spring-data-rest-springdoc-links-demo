
```
$ curl localhost:8080/greetings/1                         
{
  "message" : "Hello world",
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/greetings/1"
    },
    "greeting" : {
      "href" : "http://localhost:8080/greetings/1"
    }
  }
}%  
```

`_links` is not an array but an object
