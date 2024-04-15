package galileaapi.idat.com.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "habitante")
public class Habitante {
    @Id
    @Column(nullable=false)
    private String habitanteId;
    @Column(nullable = false)
    private String moradorId;
    @Column(nullable=false)
    private String tipoDocumento;
    @Column(nullable=false)
    private String numeroDocumento;
    @Column(nullable=false)
    private String nombre;
    @Column(nullable=false)
    private String apellido;
    @Column(nullable=false)
    private String parentezco;
    @Column(nullable=false)
    private boolean eliminado;
}
