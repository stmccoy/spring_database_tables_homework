package spring.restfulroutes.homework.codeclan.controllers;

import spring.restfulroutes.homework.codeclan.models.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.restfulroutes.homework.codeclan.repositories.FileRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public List<File> getAllFiles(){
        return fileRepository.findAll();
    }

    @GetMapping(value = "/files/{id}")
    public Optional<File> getFile(@PathVariable Long id){
        return fileRepository.findById(id);
    }

}
