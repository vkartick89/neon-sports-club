package com.neonsportsclub.app.repository.user;

import com.neonsportsclub.app.model.user.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kartick Vijayakumar.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

}
