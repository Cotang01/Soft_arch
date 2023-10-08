package study.sem_6.domain;

public class MovieSearchRequest {
	
	String request;
	
	public MovieSearchRequest(String name) {
		this.request = name;
	}
	
	public String getMovieName() {
		return request;
	}
} 
