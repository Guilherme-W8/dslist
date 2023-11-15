package com.guilhermew8.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermew8.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
