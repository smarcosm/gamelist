package com.smarcosm.gamelist.services;

import com.smarcosm.gamelist.dto.GameDTO;
import com.smarcosm.gamelist.dto.GameListDTO;
import com.smarcosm.gamelist.dto.GameMinDTO;
import com.smarcosm.gamelist.entities.Game;
import com.smarcosm.gamelist.entities.GameList;
import com.smarcosm.gamelist.repositories.GameListRepository;
import com.smarcosm.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findall(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
