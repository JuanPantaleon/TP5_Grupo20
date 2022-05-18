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

import ar.edu.fi.unju.aplicacion.lista.ListaBeca;
import ar.edu.fi.unju.aplicacion.model.Beca;

@Controller
@RequestMapping("/beca")
public class BecaController {
	
	Log LOGGER = LogFactory.getLog(BecaController.class);
	
	@GetMapping("/cargar")
	public String getCargarBecaPage(Model model) {
		model.addAttribute("becaAlias", new Beca());
		return "nueva_beca";
	}
	
	@PostMapping("")
	ModelAndView getListaBecaPage(@Validated @ModelAttribute("becaAlias") Beca beca, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			ModelAndView modeloVista = new ModelAndView("nueva_beca");
			modeloVista.addObject("becaAlias", beca);
			return modeloVista;
		}
		ModelAndView modeloVista = new ModelAndView("lista_beca");
		ListaBeca listaBeca = new ListaBeca();
		if(listaBeca.getBecas().add(beca)) {
			LOGGER.info("Se agregó una beca a la lista de becas mediante el formulario");
		}
		modeloVista.addObject("becas", listaBeca.getBecas());
		return modeloVista;
	}
	
	@GetMapping("")
	ModelAndView mostrarListaBecaPage() {
		ModelAndView modeloVista = new ModelAndView("lista_beca");
		ListaBeca listaBeca = new ListaBeca();
		modeloVista.addObject("becas", listaBeca.getBecas());
		return modeloVista;
	}
}
