package co.com.demo.controller;

import javax.validation.Valid;

import co.com.demo.model.Equipo;
import co.com.demo.repository.EquipoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/valoracion")
public class EquipoController {
    @Autowired
    EquipoRepository equipoRepository;


    @GetMapping("/direccion")
    public List<Object> findDistinctdireccionby() {
        return equipoRepository.findDistinctdireccionby();
    }

    @GetMapping("/componentemayor_direccion/{direccion}")
    public List<Object> findDistinctcompomayorby(@PathVariable(value="direccion") String direccion) {
        return equipoRepository.findDistinctcompomayorby(direccion);
    }

    @GetMapping("/componentemenor_compomayor/{componente_mayor}")
    public List<Object> findDistinctcompomenorby(@PathVariable(value="componente_mayor") String componente_mayor) {
        return equipoRepository.findDistinctcompomenorby(componente_mayor);
    }

    @GetMapping("/fullstack_compomenor/{componente_menor}")
    public List<Object> findDistinctfullstackby(@PathVariable(value="componente_menor") String componente_menor) {
        return equipoRepository.findDistinctfullstackby(componente_menor);
    }

    @GetMapping("/celula_fullstack/{fullstack}")
    public List<Object> findDistinctcelulaby(@PathVariable(value="fullstack") String fullstack) {
        return equipoRepository.findDistinctcelulaby(fullstack);
    }

    @GetMapping("/facilitador_celula/{celula}")
    public List<Object> findDistinctfacilitadorby(@PathVariable(value="celula") String celula) {
        return equipoRepository.findDistinctfacilitadorby(celula);
    }
}