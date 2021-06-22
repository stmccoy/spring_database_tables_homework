package components;

import models.File;
import models.Folder;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import repositories.FileRepository;
import repositories.FolderRepository;
import repositories.UserRepository;


public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user = new User("Fred");
        userRepository.save(user);
        Folder folder = new Folder("Pics", user);
        folderRepository.save(folder);
        File file = new File("Picture", ".jpeg", 20, folder);
        fileRepository.save(file);
    }

}
