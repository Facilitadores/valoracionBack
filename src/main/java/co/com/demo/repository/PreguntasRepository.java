package co.com.demo.repository;

import co.com.demo.model.Facilitador;
import co.com.demo.model.Preguntas;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PreguntasRepository extends JpaRepository<Preguntas,String> {

    Preguntas findByUsuario(String usuario);

}
