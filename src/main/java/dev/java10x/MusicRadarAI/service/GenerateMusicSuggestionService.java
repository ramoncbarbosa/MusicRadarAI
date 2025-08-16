package dev.java10x.MusicRadarAI.service;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class GenerateMusicSuggestionService {

    private final WebClient webClient;
    private String apiKey = System.getenv("API_KEY");

    public GenerateMusicSuggestionService(WebClient webClient) {
        this.webClient = webClient;
    }

    /*
    *
        curl https://api.openai.com/v1/responses \
        -H "Content-Type: application/json" \
        -H "Authorization: Bearer $OPENAI_API_KEY" \
        -d '{
            "model": "gpt-4o-mini",
            "input": "Write a one-sentence bedtime story about a unicorn."
        }'
    *
    * */

    public Mono<ResponseEntity<String>> generateMusic(){
        String prompt = "Agora você é um audiofilo e especialista em música de diversos generos e vai me sugerir músicas com base nas músicas que irei te passar, ok?";
        Map<String, Object> requestBody = Map.of(
                "model", "gpt-4o-mini",
                "input", List.of(
                        Map.of("role", "system", "content", "Você é um assistente"),
                        Map.of("role", "user", "content", prompt)
                )
        );

        return webClient.post()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + apiKey)
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(Map.class)
                .map(response -> {
                    List<Map<String, Object>> choices = (List<Map<String, Object>>) response.get("choices");
                    if (choices != null && !choices.isEmpty()) {
                        Map<String, Object> firstChoice = choices.get(0);
                        Map<String, Object> message = (Map<String, Object>) firstChoice.get("message");
                        String content = (String) message.get("content");
                        return ResponseEntity.ok().body(content);
                    }
                    return ResponseEntity.ok().body("Nenhuma música gerada.");
                })
                .doOnError(throwable -> System.err.println("Erro na requisição: " + throwable.getMessage()));
    }
}
