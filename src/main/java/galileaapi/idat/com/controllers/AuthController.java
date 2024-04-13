package galileaapi.idat.com.controllers;

import galileaapi.idat.com.models.requests.AdministradorCreateRequest;
import galileaapi.idat.com.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping(value = "/login/{username}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> login(@PathVariable String username, @PathVariable String password) {
        return ResponseEntity.ok(authService.login(username, password));
    }

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> register(@Valid @RequestBody AdministradorCreateRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }
}
