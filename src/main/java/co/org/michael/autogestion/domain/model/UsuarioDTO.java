package co.org.michael.autogestion.domain.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @Email(message = "El correo electrónico no es válido")
    @NotBlank(message = "El email no puede estar vacío")
    private String email;

    @NotBlank(message = "El número de cuenta no puede estar vacío")
    private String numCuenta;

    @NotBlank(message = "El número de identificación no puede estar vacío")
    private String numIdentificacion;

    @NotBlank(message = "El número de teléfono no puede estar vacío")
    private String numTelefono;

    @NotNull(message = "La fecha de creación es obligatoria")
    private LocalDateTime creadoEn;

}
