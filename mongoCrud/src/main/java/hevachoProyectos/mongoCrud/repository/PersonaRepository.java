package hevachoProyectos.mongoCrud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import hevachoProyectos.mongoCrud.repository.entity.Persona;

public interface PersonaRepository extends MongoRepository<Persona, String>, PersonaRepositoryCustom {

	@Query("{nombre: ?0 , apellido: ?1}")
	public List<Persona> getByNombreApellido(String nombre, String apellido);
}
