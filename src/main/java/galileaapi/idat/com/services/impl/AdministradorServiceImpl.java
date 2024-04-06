package galileaapi.idat.com.services.impl;

import galileaapi.idat.com.models.entities.Administrador;
import galileaapi.idat.com.models.requests.AdministradorCreateRequest;
import galileaapi.idat.com.models.responses.AdministradorCreateResponse;
import galileaapi.idat.com.repository.AdministradorRepository;
import galileaapi.idat.com.services.AdministradorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @Override
    public Object create(AdministradorCreateRequest entry) {
        Administrador entity = new Administrador();
        AdministradorCreateResponse response = new AdministradorCreateResponse();

        UUID uuid = UUID.randomUUID();

        entity.setAdministradorId(uuid.toString());
        entity.setTipoDocumento(entry.getTipoDocumento());
        entity.setNumeroDocumento(entry.getTipoDocumento());
        entity.setNombre(entry.getNombre());
        entity.setApellido(entry.getApellido());
        entity.setUsuario(entry.getUsuario());

        administradorRepository.save(entity);

        response.setId(uuid.toString());

        return response;
    }
}
