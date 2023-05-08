package challenge.alura.hotelAlura.modelos;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import challenge.alura.hotelAlura.service.DatosRegistroHuesped;
import challenge.alura.hotelAlura.service.ListadoHuesped;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalTime fecha_nacimiento;
	private String nacionalidad;
	private String telefono;
	
	//@JsonIgnore //prueba
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo") //prueba
	private Reserva reserva;

	public Huesped(DatosRegistroHuesped datosRegistroHuesped) {
		this.nombre = datosRegistroHuesped.nombre();
		this.apellido = datosRegistroHuesped.apellido();
		this.fecha_nacimiento = datosRegistroHuesped.fecha_nacimiento();
		this.nacionalidad = datosRegistroHuesped.nacionalidad();
		this.telefono = datosRegistroHuesped.telefono();
		this.reserva = new Reserva(datosRegistroHuesped.reserva());
		
	}

	public void actualizarDatos(ListadoHuesped listadoHuesped) {
		if(listadoHuesped.nombre()!=null) {
			this.nombre = listadoHuesped.nombre();
		}
		if(listadoHuesped.apellido()!=null) {
			this.apellido = listadoHuesped.apellido();
		}
		
	}
}
