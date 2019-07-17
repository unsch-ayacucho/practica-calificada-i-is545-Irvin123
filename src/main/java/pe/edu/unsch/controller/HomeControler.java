package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeControler {
	
	@GetMapping({"/", "/home"})
	
	public String index() {
		return "views/public/home/index";
	}
	

}
