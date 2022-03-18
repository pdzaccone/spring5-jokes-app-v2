package spring.example.chucknorrisjokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.example.chucknorrisjokes.services.JokesService;

@Controller
public class JokesController {

	private final JokesService service;

	public JokesController(JokesService service) {
		this.service = service;
	}

	@RequestMapping({"/", ""})
	public String getJoke(Model model) {
		model.addAttribute("jokes", this.service.getJoke());
		return "index";
	}
}
