package io.datajek.springbootdemo.recommenderapi;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationsController {
	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		 return Arrays.asList(new Movie(12, "Ice Age", 7.5),   
		                      new Movie(2, "Happy Feet", 6.4), 
		                      new Movie(3, "Shark Tales", 6.0) );
		}
}
