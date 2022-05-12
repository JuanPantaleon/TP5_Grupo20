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
import ar.edu.fi.unju.aplicacion.model.Curso;

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
		arrayBecas.add(new Beca(1, new Curso(1, "Ingles I", null, null, null, 0, null, null), "12-08-2022", "12-12-2022", "Activo"));
		beca.setCurso(new Curso(2, "Frances I", null, null, null, 0, null, null));
		arrayBecas.add(beca);
		modeloVista.addObject("becas", arrayBecas);
		return modeloVista;
	}
	
	@GetMapping("")
	ModelAndView mostrarListaBecaPage() {
		ModelAndView modeloVista = new ModelAndView("lista_beca");
		ArrayList<Beca> arrayBecas = new ArrayList<Beca>();
		arrayBecas.add(new Beca(1, new Curso(1, "Ingles I", null, null, null, 0, null, null), "12-08-2022", "12-12-2022", "Activo"));
		modeloVista.addObject("becas", arrayBecas);
		return modeloVista;
	}
}
