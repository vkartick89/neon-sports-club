package com.neonsportsclub.app.repository.user;

import com.neonsportsclub.app.model.user.Role;
import com.neonsportsclub.app.model.user.UserRoles;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kartick Vijayakumar.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(UserRoles role);

}
