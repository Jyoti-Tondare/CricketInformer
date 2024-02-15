package com.crick.aps.CrickInformerBackend.controller;

import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.aps.CrickInformerBackend.entities.Match;
import com.crick.aps.CrickInformerBackend.services.MatchServices;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

	
	private MatchServices matchService;

	public MatchController(MatchServices matchService) {
		this.matchService = matchService;
	}
	
	//get live matches
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<>(this.matchService.getLiveMatches(),HttpStatus.OK);
		
	}
	
	// get point table
	@GetMapping("/point-table")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
	}
	
	
}
