package com.rafael.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
