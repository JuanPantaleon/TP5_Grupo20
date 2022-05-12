package ar.edu.fi.unju.aplicacion.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.fi.unju.aplicacion.model.Beca;

@Controller
@RequestMapping("/beca")
public class BecaController {
	
	@GetMapping("/cargar")
	public String getCargarBecaPage(Model model) {
		model.addAttribute("becaAlias", new Beca());
		return "nueva_beca";
	}
	
	@PostMapping("")
	ModelAndView getListaBecaPage(@ModelAttribute("becaAlias") Beca beca) {
		ModelAndView modeloVista = new ModelAndView("lista_beca");
		ArrayList<Beca> arrayBecas = new ArrayList<Beca>();
		arrayBecas.add(new Beca(1, null, null, null, null));
		arrayBecas.add(beca);
		modeloVista.addObject("docentes", arrayBecas);
		return modeloVista;
	}
}
