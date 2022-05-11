package ar.edu.fi.unju.aplicacion.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.fi.unju.aplicacion.model.Docente;

@Controller
@RequestMapping("/docente")
public class DocenteController {

	@GetMapping("/cargar") //URL para Cargar un Docente
	public String getDocentePage(Model model) { //Tenemos como parametro model de tipo Model
		model.addAttribute("docenteAlias", new Docente()); //a model le agregamos un objeto Docente con el alias docente
		return "nuevo_docente"; //Devolvemos la siguiente pagina con el modelo asociado "docente"
	}
	
	@PostMapping("")
	ModelAndView getListaDocentePage(@ModelAttribute("docenteAlias") Docente docente) {
		ModelAndView modeloVista = new ModelAndView("lista_docente");
		ArrayList<Docente> arrayDocentes = new ArrayList<Docente>();
		arrayDocentes.add(new Docente(100,"Alejandro","Ysya","ysya@mail.com","3884789562"));
		arrayDocentes.add(new Docente(102,"Lionel","Messi","l10m@mail.com","3884987462"));
		arrayDocentes.add(new Docente(103,"Carlos","Tevez","apache@mail.com","3881539562"));
		arrayDocentes.add(docente);
		modeloVista.addObject("docentes", arrayDocentes);
		return modeloVista;
	}
	
	@GetMapping("")
	ModelAndView mostrarListaDocentesPage() {
		ModelAndView modeloVista = new ModelAndView("lista_docente");
		ArrayList<Docente> arrayDocentes = new ArrayList<Docente>();
		arrayDocentes.add(new Docente(100,"Alejandro","Ysya","ysya@mail.com","3884789562"));
		arrayDocentes.add(new Docente(102,"Lionel","Messi","l10m@mail.com","3884987462"));
		arrayDocentes.add(new Docente(103,"Carlos","Tevez","apache@mail.com","3881539562"));
		modeloVista.addObject("docentes", arrayDocentes);
		return modeloVista;
	}
	
}
