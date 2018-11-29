package ms.user.repository;

import org.springframework.data.repository.CrudRepository;

import ms.user.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}