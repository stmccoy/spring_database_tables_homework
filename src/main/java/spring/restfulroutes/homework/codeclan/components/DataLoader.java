package spring.restfulroutes.homework.codeclan.components;

import org.springframework.stereotype.Component;
import spring.restfulroutes.homework.codeclan.models.File;
import spring.restfulroutes.homework.codeclan.models.Folder;
import spring.restfulroutes.homework.codeclan.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import spring.restfulroutes.homework.codeclan.repositories.FileRepository;
import spring.restfulroutes.homework.codeclan.repositories.FolderRepository;
import spring.restfulroutes.homework.codeclan.repositories.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public void run(ApplicationArguments args){
        User user = new User("Fred");
        userRepository.save(user);
        Folder folder = new Folder("Pics", user);
        folderRepository.save(folder);
        File file = new File("Picture", ".jpeg", 20, folder);
        fileRepository.save(file);

    }

}
