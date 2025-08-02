package dev.java10x.MusicRadarAI.controller;

import dev.java10x.MusicRadarAI.service.GenerateMusicSuggestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/")
public class GenerateMusicSuggestionController {
    private GenerateMusicSuggestionService Recipeservice;

    public GenerateMusicSuggestionController(GenerateMusicSuggestionService Recipeservice) {
        this.Recipeservice = Recipeservice;
    }

    @GetMapping
    public Mono<ResponseEntity<String>> generateMusic(){
        return Recipeservice.generateMusic();
    }
}
