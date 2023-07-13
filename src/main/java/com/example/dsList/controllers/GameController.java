package com.example.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsList.dto.GameMinDTO;
import com.example.dsList.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    public List<GameMinDTO> findAll(){

        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}