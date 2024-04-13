package galileaapi.idat.com.repository;

import galileaapi.idat.com.models.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface AuthRepository extends CrudRepository<User,String> {
    UserDetails findByUsername(String username);
}
