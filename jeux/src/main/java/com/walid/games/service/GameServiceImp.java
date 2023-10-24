package com.walid.games.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walid.games.entities.game;
import com.walid.games.repos.Gamerepository;
@Service
public class GameServiceImp implements Gameservice {
@Autowired
Gamerepository gameRepository;
@Override
public game saveGame(game p) { 
	return gameRepository.save(p);
	}
	@Override
	public game updateGame(game p) {
	return gameRepository.save(p);
	}
	@Override
	public void deleteGame(game p) {
		gameRepository.delete(p);
	}
	 @Override
	public void deleteGameById(Long id) {
		 gameRepository.deleteById(id);
	}
	@Override
	public game getGame(Long id) {
	return gameRepository.findById(id).get();
	}
	@Override
	public List<game> getAllgames() {
	return gameRepository.findAll();
	}
	@Override
	public List<game> getAllProduits() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}