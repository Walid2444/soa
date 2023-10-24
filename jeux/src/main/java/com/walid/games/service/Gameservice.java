package com.walid.games.service;

import java.util.List;
import com.walid.games.entities.game;
public interface Gameservice {
game saveGame(game g);
game updateGame(game g);
void deleteGame(game g);
 void deleteGameById(Long id);
 game getGame(Long id);
List<game> getAllProduits();
List<game> getAllgames();
}