package dev.java10x.MusicRadarAI.service;

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

    public Mono<String> generateMusic(){
        String prompt = "Agora você é um especialista em música e vai me sugerir músicas com base nas músicas que irei te passar, ok?";
        Map<String, Objects> requestBody = Map.of(
                "model", "gpt-4o-mini",
                "messages", List.of(
                        Map.of("role", "system", "content", "Você é um assistente"),
                        Map.of("role", "user", "content", prompt)
                )
        );

        return "";
    }
}
