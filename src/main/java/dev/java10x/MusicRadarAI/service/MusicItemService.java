package dev.java10x.MusicRadarAI.service;

import dev.java10x.MusicRadarAI.DTO.MusicItemDTO;
import dev.java10x.MusicRadarAI.mapper.MusicItemMapper;
import dev.java10x.MusicRadarAI.model.MusicItemModel;
import dev.java10x.MusicRadarAI.repository.MusicItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class MusicItemService {
    private final MusicItemRepository musicItemRepository;
    private final MusicItemMapper musicItemMapper;

    public MusicItemService(MusicItemRepository musicItemRepository, MusicItemMapper musicItemMapper) {
        this.musicItemRepository = musicItemRepository;
        this.musicItemMapper = musicItemMapper;
    }

    public MusicItemDTO createMusic(MusicItemDTO music){
        MusicItemModel newMusic = musicItemMapper.map(music);
        newMusic = musicItemRepository.save(newMusic);

        return musicItemMapper.map(newMusic);
    }

    public List<MusicItemDTO> getAllMusic(){
        List<MusicItemModel> music = musicItemRepository.findAll();
        return music.stream()
                .map(musicItemMapper::map)
                .collect(Collectors.toList());
    }

    public MusicItemDTO getMusic(UUID id){
        Optional<MusicItemModel> musicExist = musicItemRepository.findById(id);
        return musicExist.map(musicItemMapper::map)
                .orElse(null);
    }

    public MusicItemDTO updateMusic(UUID id, MusicItemDTO music){
        Optional<MusicItemModel> musicExist = musicItemRepository.findById(id);
        if(musicExist.isPresent()){
            MusicItemModel specificMusic = musicExist.get();

            if(music.getName() != null){
                music.setName(music.getName());
            }

            if(music.getArtist() != null){
                music.setArtist(music.getArtist());
            }

            if(music.getReleaseDate() != null){
                music.setReleaseDate(music.getReleaseDate());
            }

            if(music.getGenres() != null){
                music.setGenres(music.getGenres());
            }

            MusicItemModel savingMusic = musicItemRepository.save(specificMusic);
            return musicItemMapper.map(savingMusic);
        }

        return null;
    }


    public void removeMusic(UUID id){
        Optional<MusicItemModel> music = musicItemRepository.findById(id);
        if(music.isPresent()){
            musicItemRepository.deleteById(id);
        }
    }


}
