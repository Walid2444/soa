package com.walid.games.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.walid.games.entities.game;



public interface Gamerepository extends JpaRepository<game, Long> {
	List<game> findByNomGame(String nom);
	List<game> findByNomGameContains(String nom);
	@Query("select p from game p where p.nomGame like %:nom and p.prixGame > :prix")
	List<game> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

}
