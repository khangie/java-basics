package com.polymorphism;

public class PolymorphismMain {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + " Plot: " + movie.plot());
		}
		
	}
	
	public static Movie randomMovie() {
		
		// Returns a number between 1 and 5
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number: " + randomNumber);
		
		switch (randomNumber) {
		
			case 1: return new Jaws();
			case 2: return new IndependenceDay();
			case 3: return new MazeRunner();
			case 4: return new StarWars();
			case 5: return new ForgettableMovie();
		
		}
		
		return null;
		
	}
	
}

class Movie {
	
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Jaws extends Movie {
	
	public Jaws() {
		super("Jaws");
	}
	
	@Override
	public String plot() {
		return "Jaws plot";
	}
	
}

class IndependenceDay extends Movie {
	
	public IndependenceDay() {
		super("Independence Day");
	}
	
	@Override
	public String plot() {
		return "Independence Day plot";
	}
	
}

class MazeRunner extends Movie {
	
	public MazeRunner() {
		super("Maze Runner");
	}
	
	@Override
	public String plot() {
		return "Maze Runner plot";
	}
	
}

class StarWars extends Movie {
	
	public StarWars() {
		super("Star Wars");
	}
	
	@Override
	public String plot() {
		return "Star Wars plot";
	}
	
}

class ForgettableMovie extends Movie {
	
	public ForgettableMovie() {
		super("Forgettable Movie");
	}
	
	// No plot method
	
}


