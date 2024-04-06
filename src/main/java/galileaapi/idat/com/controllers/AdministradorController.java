package galileaapi.idat.com.controllers;

import galileaapi.idat.com.services.AdministradorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/administradores")
public class AdministradorController {
    @Autowired
    private AdministradorService administradorService;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> administradorList() {
        return ResponseEntity.ok(administradorService.getAll());
    }
}
