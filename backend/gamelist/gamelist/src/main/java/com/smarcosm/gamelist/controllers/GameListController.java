package com.smarcosm.gamelist.controllers;

import com.smarcosm.gamelist.dto.GameDTO;
import com.smarcosm.gamelist.dto.GameListDTO;
import com.smarcosm.gamelist.dto.GameMinDTO;
import com.smarcosm.gamelist.services.GameListService;
import com.smarcosm.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findall(){
        List<GameListDTO> result = gameListService.findall();
        return result;
    }
}
