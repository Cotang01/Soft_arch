package study.sem_6.domain;

import study.sem_6.application.MovieApp;

public class Model {
	
	private MovieApp movieApp;
	
	public Model(MovieApp movieApp) {
		this.movieApp = movieApp;
	}
	
	public void run(MovieSearchRequest userCommand) {
		movieApp.accept(userCommand);
	}

}
