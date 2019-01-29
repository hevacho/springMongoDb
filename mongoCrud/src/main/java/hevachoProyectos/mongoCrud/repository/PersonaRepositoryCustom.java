package hevachoProyectos.mongoCrud.repository;

import hevachoProyectos.mongoCrud.repository.entity.Persona;

public interface PersonaRepositoryCustom {

	Persona firstPersonByName(String name);
}
