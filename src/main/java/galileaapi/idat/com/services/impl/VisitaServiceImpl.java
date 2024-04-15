package galileaapi.idat.com.services.impl;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import galileaapi.idat.com.models.entities.Visita;
import galileaapi.idat.com.models.requests.VisitaCreateRequest;
import galileaapi.idat.com.models.responses.VisitanteCreateResponse;
import galileaapi.idat.com.repository.VisitaRepository;
import galileaapi.idat.com.services.VisitaService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VisitaServiceImpl implements VisitaService{

    @Autowired
    VisitaRepository visitaRepository;

    public List<Visita>getAll(){
        return (List<Visita>)visitaRepository.findAll();
    }

    public Optional<Visita> getById(String id){
         return  visitaRepository.findById(id);
    } 

    public Object create(VisitaCreateRequest entry){
        Visita entity=new Visita();

        VisitanteCreateResponse response= new VisitanteCreateResponse();

        String id = UUID.randomUUID().toString();

        entity.setVisitaId(id);
        entity.setAdministradorId(entry.getAdministradorId());
        entity.setTipoDocumento(entry.getTipoDocumento());
        entity.setNumeroDocumento(entry.getNumeroDocumento());
        entity.setNombre(entry.getNombre());
        entity.setApellido(entry.getApellido());
        entity.setTipoVehiculo(entry.getTipoVehiculo());
        entity.setFechaHoraIngreso(entry.getFechaHoraIngreso());
        entity.setFechahoraSalida(entry.getFechaHoraSalida());
        entity.setDireccion(entry.getDireccion());
        entity.setDireccionValida(false);
        entity.setEliminado(false);

        visitaRepository.save(entity);
        response.setId(id);

        return response;
    }
}
