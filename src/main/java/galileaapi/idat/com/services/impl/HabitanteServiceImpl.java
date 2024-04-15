package galileaapi.idat.com.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import galileaapi.idat.com.models.entities.Habitante;
import galileaapi.idat.com.models.requests.HabitanteCreateRequest;
import galileaapi.idat.com.models.responses.AdministradorCreateResponse;
import galileaapi.idat.com.repository.HabitanteRepository;
import galileaapi.idat.com.services.HabitanteService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HabitanteServiceImpl implements HabitanteService{

    @Autowired
    HabitanteRepository  habitanteRepository;

    @Override
    public List<Habitante>getAll(){
        return (List<Habitante>) habitanteRepository.findAll();
    }

    @Override
    public Optional<Habitante> getById(String id){
        return habitanteRepository.findById(id);
    }

    public Object create(HabitanteCreateRequest entry){
        Habitante entity = new Habitante();
        AdministradorCreateResponse response = new AdministradorCreateResponse();

        String id = UUID.randomUUID().toString();

        entity.setHabitanteId(id);
        entity.setMoradorId(entry.getMoradorId());
        entity.setTipoDocumento(entry.getTipoDocumento());
        entity.setNumeroDocumento(entry.getNumeroDocumento());
        entity.setNombre(entry.getNombre());
        entity.setApellido(entry.getApellido());
        entity.setParentezco(entry.getParentezco());
        entity.setEliminado(false);

        habitanteRepository.save(entity);
        response.setId(id);

        return response;
    }
    
}
