package ms.user.repository;

import org.springframework.data.repository.CrudRepository;

import ms.user.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
