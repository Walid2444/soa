package com.walid.games.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Genre {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idGen;
private String nomGen;
private String descriptionGen;
@JsonIgnore
@OneToMany(mappedBy = "Genre")
private List<game> Games;
public Genre(String nomGen, String descriptionGen, List<game> Games)
{
super();
this.nomGen = nomGen;
this.descriptionGen = descriptionGen;
this.Games = Games;
}
public Long getidGen() {
return idGen;
}
public void setidGen(Long idGen) {
this.idGen = idGen;
}


public String getNomGen() {
	return nomGen;
}
public void setNomGen(String nomGen) {
	this.nomGen = nomGen;
}
public String getDescriptionGen() {
	return descriptionGen;
}
public void setDescriptionGen(String descriptionGen) {
	this.descriptionGen = descriptionGen;
}
public List<game> getgame() {
return Games;
}
public void setGames(List<game> Games) {
this.Games = Games;
}
}

