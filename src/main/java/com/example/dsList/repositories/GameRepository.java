package com.example.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dsList.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
