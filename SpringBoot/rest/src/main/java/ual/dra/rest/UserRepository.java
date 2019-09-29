package ual.dra.rest;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface UserRepository extends CrudRepository<User, Long> {

	User findByLastName(@Param("last_name") String last_name);
}
