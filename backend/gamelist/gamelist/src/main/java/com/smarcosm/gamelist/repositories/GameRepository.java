package com.smarcosm.gamelist.repositories;

import com.smarcosm.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
