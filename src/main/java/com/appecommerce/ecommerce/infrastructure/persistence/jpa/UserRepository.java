package com.appecommerce.ecommerce.infrastructure.persistence.jpa;

import com.appecommerce.ecommerce.infrastructure.persistence.entity.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserJpaEntity, UUID> {

}
