package galileaapi.idat.com.repository;

import org.springframework.data.repository.CrudRepository;

import galileaapi.idat.com.models.entities.Morador;

public interface MoradorRepository extends CrudRepository<Morador, String>{
    
}
