package pl.rzonsol.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.rzonsol.entity.Message;

/**
 * Created by rzonsol on 11.01.2017.
 */
@RepositoryRestResource(collectionResourceRel = "message", path = "message")
public interface MessageRepository extends MongoRepository<Message, String> {
}
