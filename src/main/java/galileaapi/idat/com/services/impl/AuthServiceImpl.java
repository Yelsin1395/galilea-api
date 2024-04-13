package galileaapi.idat.com.services.impl;

import galileaapi.idat.com.jwt.JwtService;
import galileaapi.idat.com.models.requests.AdministradorCreateRequest;
import galileaapi.idat.com.models.responses.AuthResponse;
import galileaapi.idat.com.services.AdministradorService;
import galileaapi.idat.com.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final AuthenticationManager authenticationManager;
    private final AdministradorService administradorService;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public AuthResponse login(String usuario, String password) {
        //authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(usuario, password));
        UserDetails user = administradorService.getByUsername(usuario);
        String token = jwtService.getToken(user);
        return AuthResponse.builder().token(token).build();
    }

    @Override
    public Object register(AdministradorCreateRequest entry) {
        entry.setContrasena(passwordEncoder.encode(entry.getContrasena()));
        return administradorService.create(entry);
    }
}
