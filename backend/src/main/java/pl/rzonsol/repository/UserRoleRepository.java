package pl.rzonsol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.rzonsol.entity.security.UserRole;

/**
 * Created by rzonsol on 16.01.2017.
 */
public interface UserRoleRepository extends MongoRepository<UserRole, String> {
}
