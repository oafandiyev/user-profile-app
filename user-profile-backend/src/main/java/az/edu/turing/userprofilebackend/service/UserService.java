package az.edu.turing.userprofilebackend.service;

import az.edu.turing.userprofilebackend.dao.entity.User;
import az.edu.turing.userprofilebackend.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
