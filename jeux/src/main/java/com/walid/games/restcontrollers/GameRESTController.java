package com.walid.games.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.walid.games.entities.game;
import com.walid.games.service.Gameservice;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class GameRESTController {
@Autowired
Gameservice Gameservice;
@RequestMapping(method = RequestMethod.GET)
public List<game> getAllGames() {
return Gameservice.getAllgames();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public game getgameById(@PathVariable("id") Long id) {
return Gameservice.getGame(id);
 }
@RequestMapping(method = RequestMethod.POST)
public game createGame(@RequestBody game game) {
return Gameservice.saveGame(game);
}

}