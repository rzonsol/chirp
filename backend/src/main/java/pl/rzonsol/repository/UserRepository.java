package pl.rzonsol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.rzonsol.entity.User;

/**
 * Created by rzonsol on 13.01.2017.
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(@Param("username") String name);

    User findByEmail(@Param("email") String email);
}
