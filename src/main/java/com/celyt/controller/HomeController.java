package com.celyt.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@RestController
public class HomeController {
	@GetMapping("/")
	Map<String, Object> home(){
		return Map.of(
			"status", "ok",
		       	"app", "Celyt"
			);
	}

	@GetMapping("/about")
	Map<String, Object> about(){
		return Map.of(
				"status", "ok",
				"app", "Celyt",
				"page", "about"
			     );
	}
}
