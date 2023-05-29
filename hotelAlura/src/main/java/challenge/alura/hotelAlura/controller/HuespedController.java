package challenge.alura.hotelAlura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.alura.hotelAlura.modelos.Huesped;
import challenge.alura.hotelAlura.repository.HuespedRepository;
import challenge.alura.hotelAlura.service.DatosRegistroHuesped;
import challenge.alura.hotelAlura.service.ListadoHuesped;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/huespedes")
public class HuespedController {
	
	@Autowired
	private HuespedRepository huespedRepository;

	@PostMapping
	public void registrarHuesped(@RequestBody @Valid DatosRegistroHuesped datosRegistroHuesped) {
		//System.out.println("probando request");
		//System.out.println(datosRegistroHuesped);
		huespedRepository.save(new Huesped(datosRegistroHuesped));
	}
	
	@GetMapping
	public Page<ListadoHuesped>listadoEmpleado(@PageableDefault(size = 10) Pageable paginacion){ 
		return huespedRepository.findAll(paginacion).map(ListadoHuesped::new);	
	}
	
	@PutMapping
	@Transactional
	public void actualizarMedico(@RequestBody @Valid ListadoHuesped listadoHuesped) {
		Huesped huesped = huespedRepository.getReferenceById(listadoHuesped.id());
		huesped.actualizarDatos(listadoHuesped);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void desactivarEmpleado(@PathVariable Long id) {
			Huesped empleado = huespedRepository.getReferenceById(id);
			huespedRepository.delete(empleado);
	}

}
