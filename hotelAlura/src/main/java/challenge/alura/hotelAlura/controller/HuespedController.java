package challenge.alura.hotelAlura.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.alura.hotelAlura.modelos.DatosRegistroHuesped;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/huespedes")
public class HuespedController {

	@PostMapping
	public void registrarHuesped(@RequestBody @Valid DatosRegistroHuesped datosRegistroHuesped) {
		System.out.println("probando request");
		System.out.println(datosRegistroHuesped);
	}
}
