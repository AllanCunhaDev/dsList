package com.example.dsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsList.dto.GameMinDTO;
import com.example.dsList.entites.Game;
import com.example.dsList.repositories.GameRepository;

@Service
public class GameService {
    

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDTO> findAll(){
        
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(arg -> new GameMinDTO(arg)).toList();
        return dto;
    }
}
