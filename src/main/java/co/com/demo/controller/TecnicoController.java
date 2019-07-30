package co.com.demo.controller;


import co.com.demo.model.Tecnico;
import co.com.demo.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/valoracion")
public class TecnicoController {

    @Autowired
    TecnicoRepository tecnicoRepository;

    @PostMapping("/guardarPilar2")
    public Tecnico pilar2 (@RequestBody Tecnico data)
    {
        return tecnicoRepository.save(data);
    }
}
