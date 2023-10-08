package study.sem_6.ports;

import java.util.List;

import study.sem_6.domain.MovieReview;

public interface IPrintMovieReview {
	public void writeMovieReviews(List<MovieReview> movieReviewList);
}
