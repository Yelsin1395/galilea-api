package galileaapi.idat.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import galileaapi.idat.com.services.MoradorService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/moradores")
public class MoradorController {
    
    @Autowired
    private MoradorService moradorService;
}
