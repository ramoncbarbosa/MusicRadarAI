package dev.java10x.MusicRadarAI.controller;

import dev.java10x.MusicRadarAI.service.MusicItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/musics")
public class MusicItemController {
    private final MusicItemService musicItemService;

    public MusicItemController(MusicItemService musicItemService) {
        this.musicItemService = musicItemService;
    }

//    @PostMapping("/create")
//    public ResponseBody<MusicItem> createMusics(@RequestBody MusicItem musicItem){
//
//    }
//
    //Listar uma musica
//    @GetMapping("/list{id}")
//
    //Listar todas as musicas
//    @GetMapping("/listAll")

    //Listar um genero
    //@GetMapping("/genres")
//
//    @PutMapping("/update/{id}")
//
//    @DeleteMapping("/remove/{id}")
}
