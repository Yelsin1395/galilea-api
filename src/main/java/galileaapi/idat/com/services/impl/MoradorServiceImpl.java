package galileaapi.idat.com.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import galileaapi.idat.com.models.entities.Morador;
import galileaapi.idat.com.models.requests.MoradorCreateRequest;
import galileaapi.idat.com.models.responses.MoradorCreateResponse;
import galileaapi.idat.com.repository.MoradorRepository;
import galileaapi.idat.com.services.MoradorService;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class MoradorServiceImpl implements  MoradorService {

    @Autowired
    MoradorRepository moradorRepository;

    public List<Morador>getAll(){
        return (List<Morador>) moradorRepository.findAll();
    }

    @Override
    public Optional<Morador> getById(String id) {
        return moradorRepository.findById(id);
    }

    @Override
    public Object create(MoradorCreateRequest entry) {

        Morador entity = new Morador();
        MoradorCreateResponse response = new MoradorCreateResponse();

        String id = UUID.randomUUID().toString();

        entity.setMoradorId(id);

        entity.setTipoDocumento(entry.getTipoDocumento());
        entity.setTipoDocumento(entry.getTipoDocumento());
        entity.setNumeroDocumento(entry.getNumeroDocumento());
        entity.setNombre(entry.getNombre());
        entity.setApellido(entry.getApellido());
        entity.setDireccion(entry.getDireccion());
        entity.setTipoMorador(entry.getTipoMorador());
        entity.setEliminado(false);

        moradorRepository.save(entity);
        response.setId(id);
        return response;
    }
}
