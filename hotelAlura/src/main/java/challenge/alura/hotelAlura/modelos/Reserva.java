package challenge.alura.hotelAlura.modelos;

import java.time.LocalDate;

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
	private LocalDate fecha_ingreso;
	private LocalDate fecha_salida;
	Integer valor;
	@Enumerated(EnumType.STRING)
	FormaDePago formaPago;
	
	public Reserva(DatosRegistroReseva datosRegistroReserva) {
		this.fecha_ingreso = datosRegistroReserva.fecha_ingreso();
		this.fecha_salida = datosRegistroReserva.fecha_salida();
		this.valor = datosRegistroReserva.valor();
		this.formaPago = datosRegistroReserva.formaPago();
	}

	public Reserva(Reserva numero_reserva) {
		this.id = numero_reserva.id;
	}
}
