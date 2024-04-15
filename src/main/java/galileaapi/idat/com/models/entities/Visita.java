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
@Table(name = "visita")
 public class Visita {

    @Id
    @Column(nullable=false)
    private String visitaId;
    @Column(nullable=false)
    private String administradorId;
    @Column(nullable=false)
    private String tipoDocumento;
    @Column(nullable=false)
    private String numeroDocumento;
    @Column(nullable=false)
    private String nombre;
    @Column(nullable=false)
    private String apellido;
    @Column(nullable=false)
    private String tipoVehiculo;
    @Column(nullable=false)
    private String fechaHoraIngreso;
    @Column(nullable=false)
    private String fechahoraSalida;
    @Column(nullable=false)
    private String direccion;
    @Column(nullable=false)
    private boolean direccionValida;
    @Column(nullable=false)
    private boolean eliminado;

}