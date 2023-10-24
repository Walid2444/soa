package com.walid.games.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class game {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idGame;
private String nomGame;
private Double prixGame ;
private Date dateCreation;
@ManyToOne
private Genre Genre;

public game() {
super();
}
public game(String nomGame, Double prixGame, Date dateCreation) {
super();
this.setNomGame(nomGame);
this.setPrixGame(prixGame);
this.setDateCreation(dateCreation);

	}
     public Long getidGame() {
     return idGame;
}
    public void setidGame(Long idGame) {
     this.idGame = idGame;
}

	public String getNomGame() {
		return nomGame;
	}
	public void setNomGame(String nomGame) {
		this.nomGame = nomGame;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Double getPrixGame() {
		return prixGame;
	}
	public void setPrixGame(Double prixGame) {
		this.prixGame = prixGame;
	}
	@Override
	public String toString() {
	return "game [idGame=" + idGame + ", nomGame=" +
			nomGame + ", prixGame=" + prixGame
	+ ", dateCreation=" + dateCreation + "]";
	}
	public Genre getGenre() {
		return Genre;
		}
		public void setGenre(Genre genre) {
		this.Genre = genre;
		}

	}
