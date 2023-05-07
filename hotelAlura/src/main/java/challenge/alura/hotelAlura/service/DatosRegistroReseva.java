package challenge.alura.hotelAlura.service;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import challenge.alura.hotelAlura.modelos.FormaDePago;

public record DatosRegistroReseva(
		@JsonFormat(pattern = "dd/MM/yyyy")
		LocalDate entrada,
		@JsonFormat(pattern = "dd/MM/yyyy")
		LocalDate salida,
		Integer valor,
		FormaDePago forma_pago) {

}
