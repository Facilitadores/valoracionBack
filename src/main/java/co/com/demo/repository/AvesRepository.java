package co.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.com.demo.model.Aves;

public interface AvesRepository extends JpaRepository<Aves,String>{

	@Query("select a from Aves a "
			+ "join AvesPaises ap "
			+ "join Paises pa "
			+ "join Zonas zo "
			+ "where a.dsnombreCientifico = ?1")
	Aves findAvesByParams(String nombreCientifico);
}
