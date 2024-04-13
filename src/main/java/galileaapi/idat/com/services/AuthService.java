package galileaapi.idat.com.services;

import galileaapi.idat.com.models.requests.AdministradorCreateRequest;

public interface AuthService {
    public Object login(String usuario, String password);
    public Object register(AdministradorCreateRequest entry);
}
