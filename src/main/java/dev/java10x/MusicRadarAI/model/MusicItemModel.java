package dev.java10x.MusicRadarAI.model;

import dev.java10x.MusicRadarAI.enums.MusicItemEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity
@Table(name = "tb_musics")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusicItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String artist;

    @Column(name = "release_date")
    private Integer releaseDate;

    @Enumerated(EnumType.STRING)
    private MusicItemEnum genre;

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

    public MusicItemEnum getGenre() {
        return genre;
    }

    public void setGenre(MusicItemEnum genre) {
        this.genre = genre;
    }
}
