package com.onlinelibrary.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinelibrary.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
