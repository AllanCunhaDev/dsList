package com.example.dsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dsList.dto.GameDTO;
import com.example.dsList.dto.GameMinDTO;
import com.example.dsList.entites.Game;
import com.example.dsList.repositories.GameRepository;

@Service
public class GameService {
    

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true) //Assegura o não bloqueio no banco de dados para escrita. 
    public List<GameMinDTO> findAll(){
        
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(arg -> new GameMinDTO(arg)).toList();
        return dto;
    }


    @Transactional(readOnly = true) //Assegura o não bloqueio no banco de dados para escrita. 
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
}
