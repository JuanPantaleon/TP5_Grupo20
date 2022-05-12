package ar.edu.fi.unju.aplicacion.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.fi.unju.aplicacion.model.Alumno;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@GetMapping("/cargar")
	public String getAlumnoCargarPage(Model model) {
		model.addAttribute("aliasAlumno",new Alumno());
		return "nuevo_alumno";
	}
	
	@PostMapping("")
	public ModelAndView getMostrarAlumnoPage(Alumno alumno){
		ModelAndView modeloVista= new ModelAndView("lista_alumno");
		ArrayList <Alumno> listaAlumno = new ArrayList<Alumno>();
		listaAlumno.add(new Alumno(43634761, "Martin", "Palermo", "Mar9Paler@gmail.com", "3885727635"));
		listaAlumno.add(new Alumno(41904264, "Jazmin", "Gualdoni", "Jazchu@gmail.com", "3880987635"));
		listaAlumno.add(new Alumno(44545872, "Maximo", "Cocetti", "MaximoCocetti03@gmail.com", "3885836783"));
		listaAlumno.add(alumno);
		modeloVista.addObject("alumnos", listaAlumno);
		return modeloVista;
	}
	
	@GetMapping("")
	public ModelAndView getMostrarAlumnosPage(){
		ModelAndView modeloVista= new ModelAndView("lista_alumno");
		ArrayList <Alumno> listaAlumno = new ArrayList<Alumno>();
		listaAlumno.add(new Alumno(43634761, "Martin", "Palermo", "Mar9Paler@gmail.com", "3885727635"));
		listaAlumno.add(new Alumno(41904264, "Jazmin", "Gualdoni", "Jazchu@gmail.com", "3880987635"));
		listaAlumno.add(new Alumno(44545872, "Maximo", "Cocetti", "MaximoCocetti03@gmail.com", "3885836783"));
		modeloVista.addObject("alumnos", listaAlumno);
		return modeloVista;
	}
	
	
}
