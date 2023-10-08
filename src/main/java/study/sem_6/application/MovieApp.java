package study.sem_6.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import study.sem_6.domain.MovieReview;
import study.sem_6.domain.MovieSearchRequest;
import study.sem_6.ports.IFetchMovieReviews;
import study.sem_6.ports.IPrintMovieReview;

public class MovieApp {

	private IFetchMovieReviews fetchMovieReviews;
	private IPrintMovieReview printMovieReviews;
	private static Random rand = new Random();
	
	public MovieApp(
			IFetchMovieReviews fetchMovieReviews, 
			IPrintMovieReview printMovieReviews) {
		this.fetchMovieReviews = fetchMovieReviews;
		this.printMovieReviews = printMovieReviews;
	}
	
	private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
		List<MovieReview> result = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			if (movieReviewList.size() < 1) {
				break;
			}
			int randomIndex = getRandomElement(movieReviewList.size());
			MovieReview movieReview = movieReviewList.get(randomIndex);
			movieReviewList.remove(movieReview);
			result.add(movieReview);
		}
		return result;
	}

	private int getRandomElement(int size) {
		return rand.nextInt(size);
	}

	public void accept(MovieSearchRequest movieSearchRequest) {
		List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
		List<MovieReview> randomReviews = filterRandomReviews(movieReviewList);
		printMovieReviews.writeMovieReviews(randomReviews);
	}
	
}
