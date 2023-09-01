package adso2499719.adso2499719.interfaces;


import java.util.List;
import java.util.Optional;

import adso2499719.adso2499719.entities.Especialidad;

public interface IEspecialidadservice {

	List<Especialidad> getAll();
	
	Optional<Especialidad> getByid (Long id);
	
	Especialidad save (Especialidad especialidad);
	
	void update (Long id, Especialidad especialidad);
	
	void delete (Long id);
	
}
