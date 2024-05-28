package com.app.milkbank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.milkbank.models.ERole;
import com.app.milkbank.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
