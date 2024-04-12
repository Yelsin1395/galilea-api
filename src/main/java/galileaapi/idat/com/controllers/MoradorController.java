package galileaapi.idat.com.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import galileaapi.idat.com.models.requests.MoradorCreateRequest;
import galileaapi.idat.com.services.MoradorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@AllArgsConstructor
@RequestMapping("/v1/moradores")
public class MoradorController {
    
    @Autowired
    private MoradorService moradorService;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object>moradorList(){
        return ResponseEntity.ok(moradorService.getAll());
    }

    @GetMapping(value = "/{moradorId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> moradorById(@PathVariable String moradorId) {
        return ResponseEntity.ok(moradorService.getById(moradorId));
    }
    
    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> moradorCreate(@Valid @RequestBody MoradorCreateRequest request) {
        return ResponseEntity.ok(moradorService.create(request));
    }
    
}
