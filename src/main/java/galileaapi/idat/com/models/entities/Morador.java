package galileaapi.idat.com.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "morador")
public class Morador {

    @Id
    private String moradorId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "administradorId", nullable = false)
    private Administrador administrador;

    @Column(nullable = false)
    private String tipoDocumento;
    @Column(nullable = false)
    private String numeroDocumento;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String tipoMorador;
    @Column(nullable = false)
    private boolean eliminado; 
}
