package galileaapi.idat.com.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @Column(nullable = false)
    private String administradorId;

    @Column(nullable = false)
    private String tipoDocumento;
    @Column(nullable = false)
    private String numeroDocumento;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String usuario;
    @Column(nullable = false)
    private String contrasena;
    @Column(nullable = false)
    private Boolean eliminado;
}
