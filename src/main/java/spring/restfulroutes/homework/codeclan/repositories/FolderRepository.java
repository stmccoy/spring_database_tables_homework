package spring.restfulroutes.homework.codeclan.repositories;

import spring.restfulroutes.homework.codeclan.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {

}
