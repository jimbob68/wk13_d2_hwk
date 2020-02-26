package com.codeclan.example.folderservice.repositories;

import com.codeclan.example.folderservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository <File, Long> {

}
