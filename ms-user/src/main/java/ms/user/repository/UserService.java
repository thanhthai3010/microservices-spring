package ms.user.repository;

import ms.user.model.User;

public interface UserService {
    User registerUser(User input);

    Iterable<User> findAll();
}
