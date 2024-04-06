package galileaapi.idat.com.services.impl;

import galileaapi.idat.com.models.entities.Administrador;
import galileaapi.idat.com.repository.AdministradorRepository;
import galileaapi.idat.com.services.AdministradorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AdministradorServiceImpl implements AdministradorService {
    @Autowired
    AdministradorRepository administradorRepository;

    @Override
    public List<Administrador> getAll() {
        return (List<Administrador>) administradorRepository.findAll();
    }

    @Override
    public Optional<Administrador> getById(String id) {
        return administradorRepository.findById(id);
    }
}
