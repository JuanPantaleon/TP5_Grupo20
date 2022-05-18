package ar.edu.fi.unju.aplicacion.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.fi.unju.aplicacion.lista.ListaCurso;
import ar.edu.fi.unju.aplicacion.lista.ListaDocente;
import ar.edu.fi.unju.aplicacion.model.Curso;

@Controller
@RequestMapping("/curso")
public class CursoController {
	
	Log LOGGER = LogFactory.getLog(CursoController.class);
	
	@GetMapping("/cargar")
	public String getCargarCursoPage(Model model) {
		model.addAttribute("cursoAlias", new Curso());
		model.addAttribute("docentesAlias", new ListaDocente().getDocentes());
		return "nuevo_curso";
	}
	
	@PostMapping("")
	ModelAndView getListaDocentesPage(@Validated @ModelAttribute("cursoAlias") Curso curso, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			ModelAndView modeloVista = new ModelAndView("nuevo_curso");
			modeloVista.addObject("cursoAlias", curso);
			modeloVista.addObject("docentesAlias", new ListaDocente().getDocentes());
			return modeloVista;
		}
		ModelAndView modeloVista = new ModelAndView("lista_curso");
		ListaCurso listaCurso = new ListaCurso();
		if(listaCurso.getCursos().add(curso)) {
			LOGGER.info("Se agregó un curso a la lista de cursos mediante el formulario");
		}
		modeloVista.addObject("curso", listaCurso.getCursos());
		return modeloVista;
	}
	
	@GetMapping("")
	ModelAndView mostrarListaDocentesPage() {
		ModelAndView modeloVista = new ModelAndView("lista_curso");
		ListaCurso listaCurso = new ListaCurso();
		modeloVista.addObject("curso", listaCurso.getCursos());
		return modeloVista;
	}

}
