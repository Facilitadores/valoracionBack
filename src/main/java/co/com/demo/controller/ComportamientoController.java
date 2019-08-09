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
        Comportamiento updateDb = comportamientoRepository.findByCelula(data.getCelula());
        if(updateDb != null) {
            updateDb.setComportamiento(data.getComportamiento());
            updateDb.setComportamientonum(data.getComportamientonum());
            return comportamientoRepository.save(updateDb);

        } else{
                return comportamientoRepository.save(data);
            }
    }
}

