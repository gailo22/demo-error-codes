# demo-error-codes
Rest error codes response with Swagger2 ui

```
http://localhost:8080/swagger-ui.html#/

```

## call using jquery ajax

```
$.ajax({
  method: "GET",
  url: "http://localhost:8080/hello/403"
})
.done(function(data) {
    console.log( "success: ");
    console.log(JSON.stringify(data));
  })
.fail(function (xhr, status, error) {
    console.log(status);
    console.log(JSON.parse(xhr.responseText));
})

```
