package com.example.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsList.dto.GameDTO;
import com.example.dsList.dto.GameMinDTO;
import com.example.dsList.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping()
    public List<GameMinDTO> findAll(){

        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findByid(@PathVariable Long id ){
        GameDTO result = gameService.findById(id);
        return result;
    }
}
