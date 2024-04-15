package galileaapi.idat.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import galileaapi.idat.com.models.entities.Visita;
import galileaapi.idat.com.models.requests.VisitaCreateRequest;

@Service
public interface VisitaService {
    public List<Visita> getAll();
    public Optional<Visita>getById(String id);
    public Object create(VisitaCreateRequest entry);
}
