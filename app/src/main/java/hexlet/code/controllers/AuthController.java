package hexlet.code.controllers;

import hexlet.code.dto.requests.CreateUserRequest;
import hexlet.code.dto.responses.UserResponse;
import hexlet.code.services.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody CreateUserRequest createUserRequest) {
        return ResponseEntity.ok().body(authService.createUser(createUserRequest));
    }
}
