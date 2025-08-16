package dev.java10x.MusicRadarAI.controller;

import dev.java10x.MusicRadarAI.DTO.MusicItemDTO;
import dev.java10x.MusicRadarAI.service.GenerateMusicSuggestionService;
import dev.java10x.MusicRadarAI.service.MusicItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/musics")
public class GenerateMusicSuggestionController {
    private GenerateMusicSuggestionService generateMusicSuggestionService;
    private MusicItemService musicItemService;

    public GenerateMusicSuggestionController(GenerateMusicSuggestionService generateMusicSuggestionService, MusicItemService musicItemService) {
        this.generateMusicSuggestionService = generateMusicSuggestionService;
        this.musicItemService = musicItemService;
    }

    @GetMapping("/generate")
    public Mono<ResponseEntity<String>> generateMusicSuggestion(){
        List<MusicItemDTO> musicItemDTOList = musicItemService.getAllMusic();

        return generateMusicSuggestionService.generateMusic(musicItemDTOList)
                .defaultIfEmpty(ResponseEntity.noContent().build());
    }
}
