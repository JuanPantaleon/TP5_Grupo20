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

import ar.edu.fi.unju.aplicacion.lista.ListaAlumno;
import ar.edu.fi.unju.aplicacion.model.Alumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	Log LOGGER = LogFactory.getLog(AlumnoController.class);
	
	@GetMapping("/cargar")
	public String getAlumnoCargarPage(Model model) {
		model.addAttribute("aliasAlumno",new Alumno());
		return "nuevo_alumno";
	}
	
	@PostMapping("")
	public ModelAndView getMostrarAlumnoPage(@Validated @ModelAttribute("aliasAlumno") Alumno alumno, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			ModelAndView modeloVista= new ModelAndView("nuevo_alumno");
			modeloVista.addObject("aliasAlumno",alumno);
			return modeloVista;
		}
		ModelAndView modeloVista= new ModelAndView("lista_alumno");
		ListaAlumno listaAlumno = new ListaAlumno();
		listaAlumno.getAlumnos().add(alumno);
		LOGGER.info("Se agregó un alumno a la lista de alumnos mediante el formulario");
		modeloVista.addObject("alumnos", listaAlumno.getAlumnos());
		return modeloVista;
	}
	
	@GetMapping("")
	public ModelAndView getMostrarAlumnosPage(){
		ModelAndView modeloVista= new ModelAndView("lista_alumno");
		ListaAlumno listaAlumno = new ListaAlumno();
		modeloVista.addObject("alumnos", listaAlumno.getAlumnos());
		return modeloVista;
	}
	
	
}
