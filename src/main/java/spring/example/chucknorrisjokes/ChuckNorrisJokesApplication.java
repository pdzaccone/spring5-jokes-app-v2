package spring.example.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {
		/*ApplicationContext context = */SpringApplication.run(ChuckNorrisJokesApplication.class, args);
//		JokesController jokesController = (JokesController) context.getBean("jokesController");
//		System.out.println(jokesController.getNextJoke());
	}
}
