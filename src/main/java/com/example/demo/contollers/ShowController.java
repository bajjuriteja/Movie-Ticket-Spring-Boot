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
import com.example.demo.Show;
import com.example.demo.Theater;
import com.example.demo.dao.ShowRepo;

@Controller
@CrossOrigin("http://localhost:4200")
public class ShowController {
	
	@Autowired
	ShowRepo shrep;
	
	
	@RequestMapping("showAdd")
	public String addShow()
	{
		
		
		return "Ishow";
		
	}
	
	@RequestMapping("addShow")
	
	public String add(Show show,@RequestParam("screen_screenid") int id)
	{
		
		
		
		System.out.println(show+""+id);
		
		Screen screen = new Screen();
		
		screen.setScreenid(id);
		
		show.setScreen(screen);
		
		shrep.save(show);
		
		System.out.println("show added");
		
		return "home";
		
		
		
	}
	
	
@RequestMapping("/showDelete")
	
	public String deleteScreen()
	{
		
		
		return "Dshow";
		
	}
	
@RequestMapping("deleteShow")
	
	public String delete(@RequestParam("id") int id)
	{
		
		System.out.println(id);
		
		shrep.deleteById(id);

		
		
		System.out.println("show deleted");
		return "home";
		
		
		
	}

		@RequestMapping("/restShow")
		
		@ResponseBody
		
		public List<Show> getTheater()
		{
			
			
			return shrep.findAll();
			
		}
	
	
		@PostMapping("addRestShow/{id}")
		
		public Show addTheater(@RequestBody Show show,@PathVariable int id)
		{
			
			System.out.println(show);
			
			Screen screen = new Screen();
			
			screen.setScreenid(id);
			
			show.setScreen(screen);
			
			shrep.save(show);

			
			
			System.out.println("Show added");
			
			return show;
			
			
			
			
		}
		

		@DeleteMapping("deleteRestShow/{id}")
		
		public void deleteShow(@PathVariable  int id)
		{
			Show show = shrep.getOne(id);
			
			shrep.delete(show);
			
			
		}
	
	
	
	
	
	

}
