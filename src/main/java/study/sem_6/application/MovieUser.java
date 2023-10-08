package study.sem_6.application;

import study.sem_6.domain.MovieSearchRequest;
import study.sem_6.ports.IUserInput;

public class MovieUser {
	
	private IUserInput userInputDriverPort;
	
	public MovieUser(IUserInput userInputDriverPort) {
		this.userInputDriverPort = userInputDriverPort;
	}
	
	public void processInput(MovieSearchRequest movieSearchRequest) {
		userInputDriverPort.handleUserInput(movieSearchRequest);
	}

}
