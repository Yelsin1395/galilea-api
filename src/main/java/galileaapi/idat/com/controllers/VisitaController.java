package galileaapi.idat.com.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import galileaapi.idat.com.models.requests.VisitaCreateRequest;
import galileaapi.idat.com.services.VisitaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@AllArgsConstructor
@RequestMapping("/v1/visitas")
public class VisitaController {
    @Autowired
    private VisitaService visitaService;

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> visitaList() {
        return ResponseEntity.ok(visitaService.getAll());
    }

    @GetMapping(value="/{visitaId}", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object>visitaById(@PathVariable String visitaId){
        return ResponseEntity.ok(visitaService.getById(visitaId));
    }

    @GetMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> visitaCreate(@Valid @RequestBody VisitaCreateRequest request) {
        return ResponseEntity.ok(visitaService.create(request));
    }
    



}
