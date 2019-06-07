package co.com.demo.repository;

import co.com.demo.model.Facilitador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilitadorRepository extends JpaRepository<Facilitador,String> {

    Facilitador findAllByCelula(String celula);
}
