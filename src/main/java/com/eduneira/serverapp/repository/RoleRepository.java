package com.eduneira.serverapp.repository;

import com.eduneira.serverapp.model.role.Role;
import com.eduneira.serverapp.model.role.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, String> {
    Optional<Role> findByName(RoleName name);
}
