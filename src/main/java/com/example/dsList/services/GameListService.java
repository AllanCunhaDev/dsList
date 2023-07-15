package com.example.dsList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dsList.dto.GameListDTO;
import com.example.dsList.entites.GameList;
import com.example.dsList.repositories.GameListRepository;

@Service
public class GameListService {
    

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true) //Assegura o não bloqueio no banco de dados para escrita. 
    public List<GameListDTO> findAll(){
        
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(all -> new GameListDTO(all)).toList();
        return dto;
    }

}
