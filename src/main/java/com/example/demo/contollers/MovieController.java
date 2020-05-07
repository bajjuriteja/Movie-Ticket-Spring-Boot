package com.example.demo.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Movie;
import com.example.demo.Theater;
import com.example.demo.dao.MovieRepo;

@Controller
@CrossOrigin("http://localhost:4200")
public class MovieController {

	@Autowired
	MovieRepo mrep;
	
	
@RequestMapping("movieAdd")
	
	public String addMovie()
	{
		
		
		return "Imovie";
		
	}
	
	@RequestMapping("addMovie")
	
	public String add(Movie movie)
	{
		
		System.out.println(movie);
		
		mrep.save(movie);
		
		System.out.println("movie added");
		return "home";
		
		
		
	}
	
	@RequestMapping("/movieDelete")
	
	public String deleteScreen()
	{
		
		
		return "Dmovie";
		
	}
	
@RequestMapping("deleteMovie")
	
	public String delete(@RequestParam("id") int id)
	{
		
		System.out.println(id);
		
		mrep.deleteById(id);

		
		
		System.out.println("movie deleted");
		return "home";
		
		
		
	}

		@RequestMapping("/restMovie")
		
		@ResponseBody
		
		public List<Movie> getTheater()
		{
			
			
			return mrep.findAll();
			
		}

		
		@PostMapping("addRestMovie")
		
		public Movie addTheater(@RequestBody Movie movie)
		{
			
			System.out.println(movie);
			
			mrep.save(movie);

			
			
			System.out.println("movie added");
			
			return movie;
			
			
			
			
		}

		@DeleteMapping("deleteRestMovie/{id}")
		
		public void deleteMovie(@PathVariable  int id)
		{
			Movie movie=mrep.getOne(id);
			
			mrep.delete(movie);
			
			
		}
		
		
		
		
		
		
		
		
		
	
}
