package challenge.alura.hotelAlura.modelos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import challenge.alura.hotelAlura.service.DatosRegistroReseva;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="reservas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate entrada;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate salida;
	Integer valor;
	@Enumerated(EnumType.STRING)
	FormaDePago forma_pago;
	
	public Reserva(DatosRegistroReseva datosRegistroReserva) {
		this.entrada = datosRegistroReserva.entrada();
		this.salida = datosRegistroReserva.salida();
		this.valor = datosRegistroReserva.valor();
		this.forma_pago = datosRegistroReserva.forma_pago();
	}

	public Reserva(Reserva numero_reserva) {
		this.id = numero_reserva.id;
	}
}
