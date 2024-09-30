package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GameService {

	static ArrayList<Game> games = new ArrayList<Game>();

	public GameService() {
		games.add(new Game("SnowBird", "Danny", 300));
		games.add(new Game("FreshFood", "Ram", 450));
		games.add(new Game("Batsman", "Kate", 400));
		games.add(new Game("Pokiman", "Steeve", 600));
		games.add(new Game("YammyTommy", "Narayan", 350));
	}
	
	public List<Game> viewAll(){  //this method should return  list of games with the above data
		return games.stream().collect(Collectors.toList());
	}


    public String authorSearch(String author) {
    	
    	String author1 = author.toLowerCase();
    	Optional<Game> first = games.stream().filter(e->e.getAuthorName().toLowerCase().equals(author1)).findFirst();
    	if(first.isPresent()) {
    		return first.get().getGameName();
    	}
    	else
    		return "NOT FOUND";
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {	
		GameService gs = new GameService();
		gs.viewAll().stream().forEach(e->System.out.println(e));
		
		System.out.println(gs.authorSearch("Ram"));
		System.out.println(gs.authorSearch("Ramaaa"));
	}


}
