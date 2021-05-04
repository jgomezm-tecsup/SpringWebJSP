package pe.edu.tecsup.springbootapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("message")
	public @ResponseBody String hello() {
		return "Hola Mundo";
	}

	
	@GetMapping("list")
	public @ResponseBody List<String> listado() {
		List<String> listado = new ArrayList<String>();
		listado.add("Jaime");
		listado.add("Gomez");
		
		return listado;
	}

}

