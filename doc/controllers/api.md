# API

```java
APIController aPIController = client.getAPIController();
```

## Class Name

`APIController`


# Fundamental Response

```java
CompletableFuture<FundamentalResponse> fundamentalResponseAsync()
```

## Response Type

[`FundamentalResponse`](../../doc/models/fundamental-response.md)

## Example Usage

```java
aPIController.fundamentalResponseAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

