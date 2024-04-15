package galileaapi.idat.com.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import galileaapi.idat.com.models.requests.HabitanteCreateRequest;
import galileaapi.idat.com.services.HabitanteService;
import lombok.AllArgsConstructor;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@AllArgsConstructor
@RequestMapping("/v1/habitantes")
public class HabitanteController {

    @Autowired
    private HabitanteService habitanteService;

    @GetMapping(value="/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object>habitanteList() {
        return ResponseEntity.ok(habitanteService.getAll());
    }
    
    @GetMapping(value = "/{habitanteId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object>habitanteById(@PathVariable String habitanteId) {
        return ResponseEntity.ok(habitanteService.getById(habitanteId));
    }
    
    @PostMapping(value="/create",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object>habitanteCreate(@Valid @RequestBody HabitanteCreateRequest request){
        return ResponseEntity.ok(habitanteService.create(request));
    }
}
    
    

