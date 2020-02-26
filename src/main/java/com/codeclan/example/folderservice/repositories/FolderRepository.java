package com.codeclan.example.folderservice.repositories;

import com.codeclan.example.folderservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository <Folder, Long> {
}
