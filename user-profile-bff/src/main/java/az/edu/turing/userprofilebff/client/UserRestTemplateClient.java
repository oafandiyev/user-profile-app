package az.edu.turing.userprofilebff.client;

import az.edu.turing.userprofilebff.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserRestTemplateClient {

    private final RestTemplate restTemplate;

    public List<UserDto> getAllUsers() {
        String url = "http://localhost:9090/api/v1/backend/user";
        var userArray =  restTemplate.getForObject(url, UserDto[].class);
        return Arrays.asList(userArray);
    }
}
