package challenge.alura.hotelAlura.service;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import challenge.alura.hotelAlura.modelos.FormaDePago;

public record DatosRegistroReseva(
		@JsonFormat(pattern = "MM/dd/yyyy")
		LocalDate fecha_ingreso,
		@JsonFormat(pattern = "MM/dd/yyyy")
		LocalDate fecha_salida,
		Integer valor,
		FormaDePago formaPago) {

}
