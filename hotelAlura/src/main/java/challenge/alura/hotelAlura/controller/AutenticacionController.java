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

import challenge.alura.hotelAlura.modelos.Usuario;
import challenge.alura.hotelAlura.service.DatosAutenticacionUsuario;
import challenge.alura.hotelAlura.service.DatosJWTtoken;
import challenge.alura.hotelAlura.service.TokenService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class AutenticacionController {

	@Autowired
	private AuthenticationManager autenticationManager;
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping
	public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {//datosAutenticacionUsuario esto es el DTO
		Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(), 
				datosAutenticacionUsuario.clave());
		var usuarioAuthenticado = autenticationManager.authenticate(authToken);
		var JWTtoken = tokenService.generarToken((Usuario) usuarioAuthenticado.getPrincipal());
		return ResponseEntity.ok(new DatosJWTtoken(JWTtoken));
	}
}
