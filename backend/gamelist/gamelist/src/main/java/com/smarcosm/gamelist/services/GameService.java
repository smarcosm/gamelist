package com.smarcosm.gamelist.services;

import com.smarcosm.gamelist.dto.GameMinDTO;
import com.smarcosm.gamelist.entities.Game;
import com.smarcosm.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findall(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
