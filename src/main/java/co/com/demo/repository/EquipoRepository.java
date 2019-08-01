package co.com.demo.repository;

import co.com.demo.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo,String> {

    @Query(value = "select distinct direccion from equipos_facilitadores", nativeQuery = true)
    List<Object> findDistinctdireccionby();

    @Query(value = "select distinct componente_mayor from equipos_facilitadores where direccion=:direccion", nativeQuery = true)
    List<Object> findDistinctcompomayorby(@Param("direccion") String direccion);

    @Query(value = "select distinct componente_menor from equipos_facilitadores where componente_mayor=:componente_mayor", nativeQuery = true)
    List<Object> findDistinctcompomenorby(@Param("componente_mayor") String componente_mayor);

    @Query(value = "select distinct fullstack from equipos_facilitadores where componente_menor=:componente_menor", nativeQuery = true)
    List<Object> findDistinctfullstackby(@Param("componente_menor") String componente_menor);

    @Query(value = "select distinct celula from equipos_facilitadores where fullstack=:fullstack", nativeQuery = true)
    List<Object> findDistinctcelulaby(@Param("fullstack") String fullstack);

    @Query(value = "SELECT a.celula, a.nivel_madurez, a.facilitador, b.* FROM valoracionequipos.equipos_facilitadores a, valoracionequipos.preguntas b where a.celula=:celula and a.tipo_celula = b.tipocelula", nativeQuery = true)
    List<Object> findDistinctfacilitadorby(@Param("celula") String celula);
}
