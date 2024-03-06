package src.Interview_practice;

public class RestConsumeWebSocket {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity("http://api.example.com/data", String.class);
    String responseBody = response.getBody();
    WebSocketClient client = new ReactorNettyWebSocketClient();
client.execute(URI.create("ws://example.com/socket"), session ->
        session.send(Mono.just(session.textMessage("Hello")))
        .thenMany(session.receive()
        .map(WebSocketMessage::getPayloadAsText)
        .log())
        .then())
        .block(Duration.ofSeconds(50));
}