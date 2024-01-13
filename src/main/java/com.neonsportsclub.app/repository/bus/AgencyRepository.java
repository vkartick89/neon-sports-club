package com.neonsportsclub.app.repository.bus;

import com.neonsportsclub.app.model.bus.Agency;
import com.neonsportsclub.app.model.user.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kartick Vijayakumar.
 */
public interface AgencyRepository extends CrudRepository<Agency, Long> {
    Agency findByCode(String agencyCode);

    Agency findByOwner(User owner);

    Agency findByName(String name);
}
