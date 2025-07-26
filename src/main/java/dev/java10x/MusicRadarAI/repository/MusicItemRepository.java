package dev.java10x.MusicRadarAI.repository;

import dev.java10x.MusicRadarAI.model.MusicItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MusicItemRepository extends JpaRepository<MusicItemModel, UUID> {

}
