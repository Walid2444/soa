package com.walid.games;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.walid.games.entities.game;
import com.walid.games.entities.Genre;
import com.walid.games.repos.Gamerepository;
@SpringBootTest
class ProduitsApplicationTests {
@Autowired
private Gamerepository gameRepository;

@Test
public void testFindByNomProduit()
{
List<game> gam = gameRepository.findByNomGame("PC Dell");
for (game p : gam)
{
System.out.println(p);
}
}
@Test
public void findByNomgameContains()
{
List<game> gam = gameRepository.findByNomGameContains("PC");
for (game p : gam)
{
System.out.println(p);
}
}
}

