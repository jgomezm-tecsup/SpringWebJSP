package pe.edu.tecsup.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author jgomezm
 *
 *  Crear una form, donde se ingresan dos
 *  valores (considerar enteros) y que realice la 
 *  suma de los numeros ( el resultado se muesta en
 *  otra pagina)
 *
 */

@Controller
public class CalculatorController {

	@GetMapping("/form_calc")
	String form_cal() {
		return "form_calc";
	}
	
	@PostMapping("/calcular")
	public String calcular(Model model,
			@RequestParam("ope_1") String ope_1,
			@RequestParam("ope_2") String ope_2) {
		
		int suma = Integer.parseInt(ope_1) + 
				Integer.parseInt(ope_2);
		
		model.addAttribute("var_suma", suma);
		return "mostrar_resultado";
	}
}
