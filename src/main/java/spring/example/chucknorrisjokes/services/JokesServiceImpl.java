package spring.example.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

	private final ChuckNorrisQuotes jokeSource;

	public JokesServiceImpl() {
		this.jokeSource = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return this.jokeSource.getRandomQuote();
	}
}