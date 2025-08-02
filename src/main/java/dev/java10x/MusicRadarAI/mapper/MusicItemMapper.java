package dev.java10x.MusicRadarAI.mapper;

import dev.java10x.MusicRadarAI.DTO.MusicItemDTO;
import dev.java10x.MusicRadarAI.model.MusicItemModel;
import org.springframework.stereotype.Component;

@Component
public class MusicItemMapper {
    public MusicItemModel map(MusicItemDTO musicItemDTO){

        MusicItemModel musicItemModel = new MusicItemModel();

        musicItemModel.setId(musicItemDTO.getId());
        musicItemModel.setName(musicItemDTO.getName());
        musicItemModel.setArtist(musicItemDTO.getArtist());
        musicItemModel.setReleaseDate(musicItemDTO.getReleaseDate());
        musicItemModel.setGenre(musicItemDTO.getGenre());

        return musicItemModel;
    }

    public MusicItemDTO map(MusicItemModel musicItemModel){

        MusicItemDTO musicItemDTO = new MusicItemDTO();

        musicItemDTO.setId(musicItemModel.getId());
        musicItemDTO.setName(musicItemModel.getName());
        musicItemDTO.setArtist(musicItemModel.getArtist());
        musicItemDTO.setReleaseDate(musicItemModel.getReleaseDate());
        musicItemDTO.setGenre(musicItemModel.getGenre());

        return musicItemDTO;
    }
}
