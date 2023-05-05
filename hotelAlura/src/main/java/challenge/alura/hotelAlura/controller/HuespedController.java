package challenge.alura.hotelAlura.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/huespedes")
public class HuespedController {

	@PostMapping
	public void registrarHuesped() {
		System.out.println("probando request");
	}
}
