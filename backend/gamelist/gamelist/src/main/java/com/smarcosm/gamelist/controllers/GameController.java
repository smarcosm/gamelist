package com.smarcosm.gamelist.controllers;

import com.smarcosm.gamelist.dto.GameMinDTO;
import com.smarcosm.gamelist.entities.Game;
import com.smarcosm.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameMinDTO> findall(){
        List<GameMinDTO> result = gameService.findall();
        return result;
    }
}
