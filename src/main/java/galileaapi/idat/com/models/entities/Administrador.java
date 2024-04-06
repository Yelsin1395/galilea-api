package galileaapi.idat.com.models.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "administrador", uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario"})})
public class Administrador {
    @Id
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
}
