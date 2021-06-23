package spring.restfulroutes.homework.codeclan.repositories;

import spring.restfulroutes.homework.codeclan.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
