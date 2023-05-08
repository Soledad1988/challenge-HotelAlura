package challenge.alura.hotelAlura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.alura.hotelAlura.service.DatosAutenticacionUsuario;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

	@Autowired
	private AuthenticationManager autenticationManager;
	
	@PostMapping
	public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {//datosAutenticacionUsuario esto es el DTO
		Authentication token = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(), 
				datosAutenticacionUsuario.clave());
		autenticationManager.authenticate(token);
		return ResponseEntity.ok().build();
	}
}
