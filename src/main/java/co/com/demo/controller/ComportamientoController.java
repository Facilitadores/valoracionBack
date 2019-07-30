package co.com.demo.controller;


import co.com.demo.model.Comportamiento;
import co.com.demo.repository.ComportamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/valoracion")
public class ComportamientoController {

    @Autowired
    ComportamientoRepository comportamientoRepository;

    @PostMapping("/guardarPilar1")
    public Comportamiento pilar1 (@RequestBody Comportamiento data)
    {
        return comportamientoRepository.save(data);
    }
}
