package com.guilhermew8.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermew8.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
