package study.sem_6.ports;

import java.util.List;

import study.sem_6.domain.MovieReview;
import study.sem_6.domain.MovieSearchRequest;

public interface IFetchMovieReviews {
	public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
