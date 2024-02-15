package com.crick.aps.CrickInformerBackend.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.aps.CrickInformerBackend.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer> {

	//match fetch krni chahti hoo
	//provide kar de--> teamHeading
	
	Optional<Match> findByTeamHeading(String teamHeading);
	
}
