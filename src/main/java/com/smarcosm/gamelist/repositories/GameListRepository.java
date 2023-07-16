package com.smarcosm.gamelist.repositories;

import com.smarcosm.gamelist.entities.Game;
import com.smarcosm.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
