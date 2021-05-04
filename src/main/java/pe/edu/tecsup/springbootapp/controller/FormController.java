package pe.edu.tecsup.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@GetMapping("/form")
	public String form() {
		return "form"; // /WEB-INF/jsp/form.jsp
	}

//	spring.mvc.view.prefix: /WEB-INF/jsp/
//	spring.mvc.view.suffix: .jsp

	@PostMapping("/sendform")
	public String sendform(Model model,
			@RequestParam("nombre") String nombre) {
		String saludo = "Bienvenido: " + nombre;
		model.addAttribute("var_saludo", saludo);
		return "sendform";
	}
}
