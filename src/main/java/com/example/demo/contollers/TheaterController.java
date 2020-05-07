package com.example.demo.contollers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Theater;
import com.example.demo.dao.TheaterRepo;

@Controller
@CrossOrigin("http://localhost:4200")
public class TheaterController {

	@Autowired
	TheaterRepo trep;
	
	
	@RequestMapping("/")
	
	public String addTheater()
	{
		
		
		return "Itheater";
		
	}
	
	@RequestMapping("add")
	
	public String add(Theater theater)
	{
		
		System.out.println(theater);
		
		trep.save(theater);

		
		
		System.out.println("theater added");
		return "home";
		
		
		
	}
	

	@RequestMapping("/theaterDelete")
	
	public String deleteTheater()
	{
		
		
		return "Dtheater";
		
	}
	
@RequestMapping("delete")
	
	public String delete(@RequestParam("id") int id)
	{
		
		System.out.println(id);
		
		trep.deleteById(id);

		
		
		System.out.println("theater deleted");
		return "home";
		
		
		
	}

	@GetMapping("/restTheater")
	
	@ResponseBody
	
	public List<Theater> getTheater()
	{
		
		
		return trep.findAll();
		
	}
	
	@PostMapping("addTheater")
	
	public Theater addTheater(@RequestBody Theater theater)
	{
		
		System.out.println(theater);
		
		trep.save(theater);

		
		
		System.out.println("theater added");
		
		return theater;
			
	}
	
	@DeleteMapping("deleteRestTheater/{id}")
	
	public void deleteTheater(@PathVariable  int id)
	{
		Theater theater=trep.getOne(id);
		
		trep.delete(theater);
		
		
	}
	
	
	
}
