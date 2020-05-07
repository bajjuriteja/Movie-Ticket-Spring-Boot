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

import com.example.demo.Screen;
import com.example.demo.Theater;
import com.example.demo.dao.ScreenRepo;



@Controller
@CrossOrigin("http://localhost:4200")
public class ScreenController {

	@Autowired
	ScreenRepo srep;
	
	
@RequestMapping("screenAdd")
	
	public String addScreen()
	{
		
		
		return "Iscreen";
		
	}
	
	@RequestMapping("addScreen")
	
	public String add(Screen screen,@RequestParam("theater_theaterid") int id)
	{
		
		
		
		System.out.println(screen+""+id);
		
		Theater theater = new Theater();
		
		theater.setTheaterid(id);
		
		screen.setTheater(theater);
		
		srep.save(screen);
		
		System.out.println("screen added");
		return "home";
		
		
		
	}
	

	@RequestMapping("/screenDelete")
	
	public String deleteScreen()
	{
		
		
		return "Dscreen";
		
	}
	
@RequestMapping("deleteScreen")
	
	public String delete(@RequestParam("id") int id)
	{
		
		System.out.println(id);
		
		srep.deleteById(id);

		
		
		System.out.println("screen deleted");
		return "home";
		
		
		
	}

	
		@RequestMapping("/restScreen")
		
		@ResponseBody
		
		public List<Screen> getTheater()
		{
			
			
			return srep.findAll();
			
		}


		@PostMapping("addRestScreen/{id}")
		
		public Screen addScreen(@RequestBody Screen screen,@PathVariable int id)
		{
			
			System.out.println(screen);
		
			Theater theater = new Theater();
			
			theater.setTheaterid(id);
			
			screen.setTheater(theater);
			
			
			
			srep.save(screen);

			
			
			System.out.println("screen added");
			
			return screen;
			
			
			
			
		}

		@DeleteMapping("deleteRestScreen/{id}")
		
		public void deleteScreen(@PathVariable  int id)
		{
			Screen screen =srep.getOne(id);
			
			srep.delete(screen);
			
			
		}









}
