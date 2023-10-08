package study.sem_6.adapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import study.sem_6.domain.MovieReview;
import study.sem_6.domain.MovieSearchRequest;
import study.sem_6.ports.IFetchMovieReviews;

public class MovieReviewsRepository implements IFetchMovieReviews {
	
	private Map<String, List<MovieReview>> movieReviewMap;
	
	public MovieReviewsRepository() {
		initialise();
	}
	
	private void initialise() {
		this.movieReviewMap = new HashMap<>();
		movieReviewMap.put(
				"StarWars", 
				Collections.singletonList(
						new MovieReview("1", 7.5, "Good")));
		movieReviewMap.put(
				"StarTreck", 
				Arrays.asList(
						new MovieReview("1", 9.5, "Excellent"), 
						new MovieReview("1", 8.5, "Good")));
	}

	public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {
		return Optional.ofNullable(
				movieReviewMap
				.get(movieSearchRequest.getMovieName()))
				.orElse(new ArrayList<>());
	}

}
