package com.codeclan.example.folderservice.components;

import com.codeclan.example.folderservice.models.File;
import com.codeclan.example.folderservice.models.Folder;
import com.codeclan.example.folderservice.models.User;
import com.codeclan.example.folderservice.repositories.FileRepository;
import com.codeclan.example.folderservice.repositories.FolderRepository;
import com.codeclan.example.folderservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User Bob = new User("Bob");
        userRepository.save(Bob);
        Folder personal = new Folder("shopping", Bob);
        folderRepository.save(personal);
        File homeShopping = new File("shopping", "txt", 10, personal);
        fileRepository.save(homeShopping);
    }
}
