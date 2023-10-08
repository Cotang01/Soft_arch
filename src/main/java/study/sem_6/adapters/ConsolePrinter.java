package study.sem_6.adapters;

import java.util.List;

import study.sem_6.domain.MovieReview;
import study.sem_6.ports.IPrintMovieReview;

public class ConsolePrinter implements IPrintMovieReview{

	@Override
	public void writeMovieReviews(List<MovieReview> movieReviewList) {
		movieReviewList.forEach(movieReview -> 
			System.out.println(movieReview.toString())
		);
	}

}
