package dev.java10x.MusicRadarAI.DTO;


import dev.java10x.MusicRadarAI.enums.MusicItemEnum;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
public class MusicItemDTO {
    private UUID id;
    private String name;
    private String artist;
    private Integer releaseDate;
    private MusicItemEnum genres;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MusicItemEnum getGenres() {
        return genres;
    }

    public void setGenres(MusicItemEnum genres) {
        this.genres = genres;
    }
}
