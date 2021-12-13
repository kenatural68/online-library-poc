package com.onlinelibrary.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinelibrary.entities.FileDb;



@Repository
public interface FileDbRepository extends JpaRepository<FileDb, String> {
	Optional<FileDb> findByName(String name);

}
