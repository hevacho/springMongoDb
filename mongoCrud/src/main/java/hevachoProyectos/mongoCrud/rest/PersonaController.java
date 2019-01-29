package hevachoProyectos.mongoCrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hevachoProyectos.mongoCrud.dto.PersonaDto;
import hevachoProyectos.mongoCrud.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	// here we must use other objects to manage response and request but is an
	// example

	@Autowired
	private PersonaService personaService;

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<PersonaDto> getAllPersonas() {

		return personaService.getAllPersonas();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/", produces = "application/json", consumes = "application/json")
	@ResponseBody
	PersonaDto registerStudent(@RequestBody PersonaDto persona) {

		return personaService.saveOrCreatePersona(persona);

	}

	@RequestMapping(value = "/nombre", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public PersonaDto getUna() {

		return personaService.getPersona("miNombre");
	}

	@RequestMapping(value = "/nombreApellido", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<PersonaDto> getVarias() {

		return personaService.getPersonaByNombreApellido("miNombre", "miApellido");
	}
}
