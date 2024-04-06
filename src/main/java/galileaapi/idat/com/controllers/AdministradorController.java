package galileaapi.idat.com.controllers;

import galileaapi.idat.com.models.requests.AdministradorCreateRequest;
import galileaapi.idat.com.services.AdministradorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    @GetMapping(value = "/{administradorId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> administradorById(@PathVariable String administradorId) {
        return ResponseEntity.ok(administradorService.getById(administradorId));
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> administradorCreate(@Valid @RequestBody AdministradorCreateRequest request) {
        return ResponseEntity.ok(administradorService.create(request));
    }
}
