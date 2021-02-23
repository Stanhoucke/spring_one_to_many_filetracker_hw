package com.codeclan.example.filetracker.repositories;

import com.codeclan.example.filetracker.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
