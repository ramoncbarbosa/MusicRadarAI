package dev.java10x.MusicRadarAI.controller;

import dev.java10x.MusicRadarAI.DTO.MusicItemDTO;
import dev.java10x.MusicRadarAI.repository.MusicItemRepository;
import dev.java10x.MusicRadarAI.service.MusicItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/musics")
public class MusicItemController {
    private final MusicItemService musicItemService;
    private final MusicItemRepository musicItemRepository;

    public MusicItemController(MusicItemService musicItemService,
                               MusicItemRepository musicItemRepository) {
        this.musicItemService = musicItemService;
        this.musicItemRepository = musicItemRepository;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createMusic(@RequestBody MusicItemDTO musicItemDTO){
        MusicItemDTO newMusic = musicItemService.createMusic(musicItemDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Música adicionada com sucesso!");
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<MusicItemDTO>> getAllMusic(){
        List<MusicItemDTO> musics = musicItemService.getAllMusic();
        if(musics != null){
            return ResponseEntity.ok(musics);
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<?> getMusic(@PathVariable UUID id){
        MusicItemDTO musicLocation = musicItemService.getMusic(id);
        if(musicLocation != null){
            return ResponseEntity.ok(musicLocation);
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID music: " + id + " not found");
        }
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<MusicItemDTO> updateMusic(@PathVariable UUID id, @RequestBody MusicItemDTO music) {
        return musicItemService.updateMusic(id, music)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> removeMusic(@PathVariable UUID id){
        musicItemService.removeMusic(id);
        return ResponseEntity.noContent().build();
    }



    //Listar todas as músicas de um genero especifico
}
