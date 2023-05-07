package challenge.alura.hotelAlura.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.alura.hotelAlura.service.DatosRegistroReseva;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
	
	@PostMapping
	public void registrarReserva(@RequestBody DatosRegistroReseva datosRegistroReserva) {
		System.out.println("request Recibido");
		System.out.println(datosRegistroReserva);
	}

}
