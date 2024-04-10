package galileaapi.idat.com.services;

import java.util.List;
import java.util.Optional;

import galileaapi.idat.com.models.entities.Morador;
import galileaapi.idat.com.models.requests.MoradorCreateRequest;

public interface MoradorService {
    public List<Morador> getAll();
    public Optional<Morador> getById(String id);
    public Object create(MoradorCreateRequest entry);
}
