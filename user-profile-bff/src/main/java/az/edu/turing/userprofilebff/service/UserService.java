package az.edu.turing.userprofilebff.service;

import az.edu.turing.userprofilebff.client.UserRestTemplateClient;
import az.edu.turing.userprofilebff.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRestTemplateClient userRestTemplateClient;

    public List<UserDto> getAllUsers() {
        return userRestTemplateClient.getAllUsers();
    }
}
