package com.rafael.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.rafael.dslist.dto.GameDTO;
import com.rafael.dslist.dto.GameMinDTO;
import com.rafael.dslist.entities.Game;
import com.rafael.dslist.repositories.GameRepository;

@Service 
public class GameService {
		
		@Autowired
		private GameRepository gameRepository;
		
		@Transactional(readOnly = true)
		public GameDTO findById(@PathVariable Long id) {
			Game result = gameRepository.findById(id).get();
			GameDTO dto = new GameDTO(result);
			return dto;
		}

		@Transactional(readOnly = true)
		public List<GameMinDTO> findAll() {
			List<Game> result = gameRepository.findAll();
			return result.stream().map(x -> new GameMinDTO(x)).toList();
			
		}
	}


