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

import ar.edu.fi.unju.aplicacion.lista.ListaDocente;
import ar.edu.fi.unju.aplicacion.model.Docente;

@Controller
@RequestMapping("/docente")
public class DocenteController {
	
	Log LOGGER = LogFactory.getLog(DocenteController.class);

	@GetMapping("/cargar") //URL para Cargar un Docente
	public String getDocentePage(Model model) { //Tenemos como parametro model de tipo Model
		model.addAttribute("docenteAlias", new Docente()); //a model le agregamos un objeto Docente con el alias docente
		return "nuevo_docente"; //Devolvemos la siguiente pagina con el modelo asociado "docente"
	}
	
	@PostMapping("")
	ModelAndView getListaDocentePage(@Validated @ModelAttribute("docenteAlias") Docente docente, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			ModelAndView modeloVista = new ModelAndView("nuevo_docente");
			modeloVista.addObject("docenteAlias", docente);
			return modeloVista;
		}
		ModelAndView modeloVista = new ModelAndView("lista_docente");
		ListaDocente listaDocente = new ListaDocente();
		listaDocente.getDocentes().add(docente);
		LOGGER.info("Se agregó un docente a la lista de docentes mediante el formulario");
		modeloVista.addObject("docentes", listaDocente.getDocentes());
		return modeloVista;
	}
	
	@GetMapping("")
	ModelAndView mostrarListaDocentesPage() {
		ModelAndView modeloVista = new ModelAndView("lista_docente");
		ListaDocente listaDocente = new ListaDocente();
		modeloVista.addObject("docentes", listaDocente.getDocentes());
		return modeloVista;
	}
	
}
