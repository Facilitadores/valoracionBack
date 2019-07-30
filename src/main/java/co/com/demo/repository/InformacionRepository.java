package co.com.demo.repository;

import co.com.demo.model.Informacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InformacionRepository extends JpaRepository<Informacion,String> {


}
