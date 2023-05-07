package challenge.alura.hotelAlura.service;

import challenge.alura.hotelAlura.modelos.Reserva;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

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
		String telefono,
		Reserva numero_reserva) {

}
