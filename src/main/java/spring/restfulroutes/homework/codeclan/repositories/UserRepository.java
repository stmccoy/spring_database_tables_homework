package spring.restfulroutes.homework.codeclan.repositories;

import spring.restfulroutes.homework.codeclan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
