package com.appecommerce.ecommerce.core.usecase.port.out;
import com.appecommerce.ecommerce.core.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findById(UUID id);
    List<User> findAll();
}
