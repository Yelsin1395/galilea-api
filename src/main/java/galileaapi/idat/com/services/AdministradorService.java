package galileaapi.idat.com.services;

import galileaapi.idat.com.models.entities.Administrador;
import galileaapi.idat.com.models.requests.AdministradorCreateRequest;

import java.util.List;
import java.util.Optional;

public interface AdministradorService {
    public List<Administrador> getAll();
    public Optional<Administrador> getById(String id);
    public Object create(AdministradorCreateRequest entry);
}
