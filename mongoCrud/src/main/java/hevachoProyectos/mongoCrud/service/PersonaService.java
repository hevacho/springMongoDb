package hevachoProyectos.mongoCrud.service;

import java.util.List;

import hevachoProyectos.mongoCrud.dto.PersonaDto;

public interface PersonaService {

	List<PersonaDto> getAllPersonas();

	PersonaDto saveOrCreatePersona(PersonaDto persona);

	PersonaDto getPersona(String name);

	List<PersonaDto> getPersonaByNombreApellido(String nombre, String apellido);

}
