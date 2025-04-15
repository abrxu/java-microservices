package com.ms.user.repositories;

import com.ms.user.models.User.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserRepository extends SimpleJpaRepository<User, UUID> {

    @PersistenceContext
    private EntityManager em;

    public UserRepository(Class<User> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
    }
}
