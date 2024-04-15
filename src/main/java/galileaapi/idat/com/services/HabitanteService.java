package galileaapi.idat.com.services;

import java.util.List;
import java.util.Optional;

import galileaapi.idat.com.models.entities.Habitante;
import galileaapi.idat.com.models.requests.HabitanteCreateRequest;

public interface HabitanteService {
    public List<Habitante>getAll();
    public Optional<Habitante> getById(String id);
    public Object create(HabitanteCreateRequest entry);
}
