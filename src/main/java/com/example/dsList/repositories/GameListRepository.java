package com.example.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dsList.entites.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
