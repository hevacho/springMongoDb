package hevachoProyectos.mongoCrud.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import hevachoProyectos.mongoCrud.repository.entity.Persona;

@Repository
public class PersonaRepositoryCustomImpl implements PersonaRepositoryCustom {

	private final MongoTemplate mongoTemplate;

	@Autowired
	public PersonaRepositoryCustomImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public Persona firstPersonByName(String name) {

		Query query = new Query();
		query.addCriteria(Criteria.where("nombre").is(name));

		return mongoTemplate.findOne(query, Persona.class);
	}

}
