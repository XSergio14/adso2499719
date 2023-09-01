package Inplementations;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import adso2499719.adso2499719.entities.Especialidad;
import adso2499719.adso2499719.interfaces.IEspecialidadservice;
import adso2499719.adso2499719.repositories.EspecialidadRepository;

public class EspecialidadService implements IEspecialidadservice {

	@Autowired
	private EspecialidadRepository repository;
	
	@Override
	public List<Especialidad> getAll() {
		return null;
	}
	

	@Override
	public Optional<Especialidad> getByid(Long id) {
		return Optional.empty();
	}

	@Override
	public Especialidad save(Especialidad especialidad) {
	  especialidad.setCreatedAt(LocalDateTime.now());
		return repository.save(especialidad);
	}

	@Override
	public void update(Long id, Especialidad especialidad) {
		Optional<Especialidad>especialidadDBOpt = repository.findById(id);
		if (especialidadDBOpt.isEmpty()) {
			return;
		}
			Especialidad especialidadDB = especialidadDBOpt.get();
			especialidadDB.setNombre(Especialidad.getNombre());
			especialidadDB.setUpdatedAt(LocalDateTime.now());
		}
		
	

	@Override
	public void delete(Long id) {
    repository.deleteById(id);

		
	}

}
