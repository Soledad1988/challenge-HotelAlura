package challenge.alura.hotelAlura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.alura.hotelAlura.modelos.Huesped;
import challenge.alura.hotelAlura.repository.HuespedRepository;
import challenge.alura.hotelAlura.service.DatosRegistroHuesped;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/huespedes")
public class HuespedController {
	
	@Autowired
	private HuespedRepository huespedRepository;

	@PostMapping
	public void registrarHuesped(@RequestBody @Valid DatosRegistroHuesped datosRegistroHuesped) {
		System.out.println("probando request");
		System.out.println(datosRegistroHuesped);
		huespedRepository.save(new Huesped(datosRegistroHuesped));
	}
}
