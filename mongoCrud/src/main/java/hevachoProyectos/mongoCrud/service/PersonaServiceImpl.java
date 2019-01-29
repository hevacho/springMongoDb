package hevachoProyectos.mongoCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import helpers.PersonaHelper;
import hevachoProyectos.mongoCrud.dto.PersonaDto;
import hevachoProyectos.mongoCrud.repository.PersonaRepository;
import hevachoProyectos.mongoCrud.repository.entity.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public List<PersonaDto> getAllPersonas() {
		List<Persona> personas = personaRepository.findAll();
		return PersonaHelper.personaListToPersonaDtoList(personas);
	}

	@Override
	@Transactional // just in mongo4
	public PersonaDto saveOrCreatePersona(PersonaDto persona) {
		Persona pers = PersonaHelper.personaDtoToPersona(persona);
		if (pers != null) {
			pers = personaRepository.save(pers);
		}

		return PersonaHelper.personaToPersonaDto(pers);
	}

	@Override
	public PersonaDto getPersona(String name) {
		PersonaDto aux = null;

		if (name != null) {

			Persona per = personaRepository.firstPersonByName(name);
			aux = PersonaHelper.personaToPersonaDto(per);

		}

		return aux;

	}

	@Override
	public List<PersonaDto> getPersonaByNombreApellido(String nombre, String apellido) {

		List<PersonaDto> personasToRet = null;

		if (nombre != null && apellido != null) {
			List<Persona> personas = personaRepository.getByNombreApellido(nombre, apellido);

			personasToRet = PersonaHelper.personaListToPersonaDtoList(personas);
		}

		return personasToRet;

	}

}
