package galileaapi.idat.com.models.requests;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class VisitaCreateRequest {
    
    @NotBlank
    private String administradorId;
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String numeroDocumento;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String tipoVehiculo;
    @NotBlank
    private String fechaHoraIngreso;
    @NotBlank
    private String fechaHoraSalida;
    @NotBlank
    private String direccion;
    @NotBlank
    private boolean direccionValida;
    @NotBlank
    private boolean eliminado;
}
