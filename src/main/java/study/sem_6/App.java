package study.sem_6;

import study.sem_6.adapters.ConsolePrinter;
import study.sem_6.adapters.MovieReviewsRepository;
import study.sem_6.adapters.UserCommand;
import study.sem_6.application.MovieUser;
import study.sem_6.domain.MovieSearchRequest;
import study.sem_6.ports.IFetchMovieReviews;
import study.sem_6.ports.IPrintMovieReview;
import study.sem_6.ports.IUserInput;

public class App {
	
	public static void main(String[] args) {
		
		IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepository();
		IPrintMovieReview printMovieReview = new ConsolePrinter();
		
		IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReview);
		
		MovieUser movieUser = new MovieUser(userCommand);
		
		MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
		MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");
		
		movieUser.processInput(starWarsRequest);
	}

}
