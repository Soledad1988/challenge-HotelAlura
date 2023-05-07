package challenge.alura.hotelAlura.modelos;

import challenge.alura.hotelAlura.service.DatosRegistroHuesped;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="huespedes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")
public class Huesped {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String fecha_Nacimiento;
	private String nacionalidad;
	private String telefono;
	@ManyToOne
	//@Embedded
	private Reserva numero_reserva;

	public Huesped(DatosRegistroHuesped datosRegistroHuesped) {
		this.nombre = datosRegistroHuesped.nombre();
		this.apellido = datosRegistroHuesped.apellido();
		this.fecha_Nacimiento = datosRegistroHuesped.fecha_Nacimiento();
		this.nacionalidad = datosRegistroHuesped.nacionalidad();
		this.telefono = datosRegistroHuesped.telefono();
		this.numero_reserva = new Reserva(datosRegistroHuesped.numero_reserva());
		
	}
}
