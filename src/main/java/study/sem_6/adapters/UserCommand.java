package study.sem_6.adapters;

import study.sem_6.application.MovieApp;
import study.sem_6.domain.Model;
import study.sem_6.domain.MovieSearchRequest;
import study.sem_6.ports.IFetchMovieReviews;
import study.sem_6.ports.IPrintMovieReview;
import study.sem_6.ports.IUserInput;

public class UserCommand implements IUserInput {
	
	private Model model;
	
	public UserCommand(
			IFetchMovieReviews fetchMovieReviews, 
			IPrintMovieReview printMovieReviews) {
		MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
		this.model = new Model(movieApp);
	}

	@Override
	public void handleUserInput(Object userCommand) {
		model.run((MovieSearchRequest)userCommand);
	}

}
