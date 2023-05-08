package challenge.alura.hotelAlura.service;

import java.time.LocalTime;

import challenge.alura.hotelAlura.modelos.Huesped;
import challenge.alura.hotelAlura.modelos.Reserva;

public record ListadoHuesped(
		Long id,
		String nombre,
		String apellido,
		LocalTime fecha_nacimiento,
		String nacionalidad,
		String telefono) {

	public ListadoHuesped(Huesped huesped) {
		this(huesped.getId(), huesped.getNombre(), huesped.getApellido(),
				huesped.getFecha_nacimiento(), huesped.getNacionalidad(),
				huesped.getTelefono());
	}
}
