package galileaapi.idat.com.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class AppValidationError extends AppSubError {
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    AppValidationError(String object, String message) {
        this.object = object;
        this.message = message;
    }
}
