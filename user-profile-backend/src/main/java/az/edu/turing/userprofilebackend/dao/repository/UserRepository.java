package az.edu.turing.userprofilebackend.dao.repository;

import az.edu.turing.userprofilebackend.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
