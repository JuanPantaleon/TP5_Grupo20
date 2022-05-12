package ar.edu.fi.unju.aplicacion.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.fi.unju.aplicacion.model.Curso;
import ar.edu.fi.unju.aplicacion.model.Docente;

@Controller
@RequestMapping("/curso")
public class CursoController {
	
	@GetMapping("/cargar")
	public String getCargarCursoPage(Model model) {
		model.addAttribute("cursoAlias", new Curso());
		return "nuevo_curso";
	}
	
	
	@PostMapping("")
	ModelAndView getListaDocentesPage(@ModelAttribute("cursoAlias") Curso curso) {
		ModelAndView modeloVista = new ModelAndView("lista_curso");
		ArrayList<Curso> arrayCurso = new ArrayList<Curso>();
		arrayCurso.add(new Curso(1, "Ingles I", "Idiomas", "26-06-2022", "18-12-2022", 144, "Virtual", new Docente(100,"Alejandro","Ysya","ysya@mail.com","3884789562")));
		arrayCurso.add(new Curso(2, "Frances I", "Idiomas", "26-06-2022", "18-12-2022", 144, "Presencial", new Docente(102,"Lionel","Messi","l10m@mail.com","3884987462")));
		curso.setDocente(new Docente(3, "David", "Quint", "davooxeneize@gmail.com", "3885729987"));
		arrayCurso.add(curso);
		modeloVista.addObject("curso", arrayCurso);
		return modeloVista;
	}
	
	@GetMapping("")
	ModelAndView mostrarListaDocentesPage() {
		ModelAndView modeloVista = new ModelAndView("lista_curso");
		ArrayList<Curso> arrayCurso = new ArrayList<Curso>();
		arrayCurso.add(new Curso(1, "Ingles I", "Idiomas", "26-06-2022", "18-12-2022", 144, "Virtual", new Docente(100,"Alejandro","Ysya","ysya@mail.com","3884789562")));
		arrayCurso.add(new Curso(2, "Frances I", "Idiomas", "26-06-2022", "18-12-2022", 144, "Presencial", new Docente(102,"Lionel","Messi","l10m@mail.com","3884987462")));
		modeloVista.addObject("curso", arrayCurso);
		return modeloVista;
	}

}
