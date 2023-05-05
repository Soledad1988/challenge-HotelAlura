package challenge.alura.hotelAlura;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebas")
public class PruebaController {

	@GetMapping
	public String prubasConexion() {
		return "preuba Conexion";
	}
}
