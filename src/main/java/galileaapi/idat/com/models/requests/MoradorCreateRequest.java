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
public class MoradorCreateRequest {
    
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String numeroDocumento;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String direccion;
    @NotBlank
    private String tipoMorador;
    @NotBlank
    private double eliminado;

}
