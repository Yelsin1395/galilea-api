package galileaapi.idat.com.repository;

import galileaapi.idat.com.models.entities.Administrador;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdministradorRepository extends CrudRepository<Administrador, String> {
}
