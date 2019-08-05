package co.com.demo.repository;

import co.com.demo.model.Agilismo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AgilismoRepository extends JpaRepository<Agilismo,String> {

    @Query(value = "select * from (select resultpilar3 from negocioy_proceso where celula=:celula) n, (select agilismonum from agilismo where  celula=:celula) a,(select resultpilar2 from tecnico where  celula=:celula) t, (select comportamientonum from comportamiento where  celula=:celula) c", nativeQuery = true)
    List<Object> finddistinctallby(@Param("celula") String celula);

 }
