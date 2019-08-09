package co.com.demo.repository;

import co.com.demo.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico,String> {

    Tecnico findByCelula(String celula);
}

