package ms.user.service;

import ms.user.entity.User;

public interface UserService {

    User registerUser(User input);

    Iterable<User> findAll();
}
