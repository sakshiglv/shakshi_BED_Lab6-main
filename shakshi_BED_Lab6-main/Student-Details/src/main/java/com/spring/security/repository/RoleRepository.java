package com.spring.security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.security.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(String name);
}
