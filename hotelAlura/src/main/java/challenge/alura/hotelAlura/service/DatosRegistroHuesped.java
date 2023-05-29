package challenge.alura.hotelAlura.service;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import challenge.alura.hotelAlura.modelos.Reserva;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroHuesped(
		@NotBlank
		String nombre,
		@NotBlank
		String apellido,
		//@NotBlank
		@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
		LocalTime fecha_nacimiento,
		@NotBlank
		String nacionalidad,
		@NotBlank
		String telefono,
		Reserva reserva) {
	




}
