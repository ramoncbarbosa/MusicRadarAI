package dev.java10x.MusicRadarAI.controller;

import dev.java10x.MusicRadarAI.service.GenerateMusicSuggestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/music")
public class GenerateMusicSuggestionController {
    private GenerateMusicSuggestionService generateMusicSuggestionService;

    public GenerateMusicSuggestionController(GenerateMusicSuggestionService generateMusicSuggestionService) {
        this.generateMusicSuggestionService = generateMusicSuggestionService;
    }

    @GetMapping("/generate")
    public Mono<ResponseEntity<String>> generateMusicSuggestion(){
        return generateMusicSuggestionService.generateMusic()
                .defaultIfEmpty(ResponseEntity.noContent().build());
    }
}
