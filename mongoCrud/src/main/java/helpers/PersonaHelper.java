package helpers;

import java.util.ArrayList;
import java.util.List;

import hevachoProyectos.mongoCrud.dto.PersonaDto;
import hevachoProyectos.mongoCrud.repository.entity.Persona;

public class PersonaHelper {

	public static PersonaDto personaToPersonaDto(Persona p) {
		PersonaDto personaToRet = null;

		if (p != null) {
			personaToRet = new PersonaDto();
			personaToRet.setId(p.getId());
			personaToRet.setNombre(p.getNombre());
			personaToRet.setApellido(p.getApellido());
		}

		return personaToRet;
	}

	public static List<PersonaDto> personaListToPersonaDtoList(List<Persona> ps) {
		List<PersonaDto> listaToRet = null;

		if (ps != null) {
			listaToRet = new ArrayList<PersonaDto>(ps.size());

			for (Persona persona : ps) {
				listaToRet.add(personaToPersonaDto(persona));
			}

		}
		return listaToRet;

	}
	
	public static Persona personaDtoToPersona(PersonaDto p) {
		Persona personaToRet = null;

		if (p != null) {
			personaToRet = new Persona();
			personaToRet.setId(p.getId());
			personaToRet.setNombre(p.getNombre());
			personaToRet.setApellido(p.getApellido());
		}

		return personaToRet;
	}

}
