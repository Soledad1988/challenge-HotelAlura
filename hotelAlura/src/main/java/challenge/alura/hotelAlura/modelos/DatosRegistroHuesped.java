package challenge.alura.hotelAlura.modelos;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroHuesped(
		@NotBlank
		String nombre,
		@NotBlank
		String apellido,
		@NotBlank
		String fecha_Nacimiento,
		@NotBlank
		String nacionalidad,
		@NotBlank
		String telefono) {

}
