package com.codeclan.example.filetracker.component;

import com.codeclan.example.filetracker.models.File;
import com.codeclan.example.filetracker.models.Folder;
import com.codeclan.example.filetracker.models.User;
import com.codeclan.example.filetracker.repositories.FileRepository;
import com.codeclan.example.filetracker.repositories.FolderRepository;
import com.codeclan.example.filetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;
    public DataLoader(){
    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Robert");
        userRepository.save(user1);

        Folder folder1 = new Folder("Python project", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Java project", user1);
        folderRepository.save(folder2);

        File file1 = new File("runner", ".py", 200, folder1);
        fileRepository.save(file1);

        User user2 = new User("Leroy");
        userRepository.save(user2);

    }
}
