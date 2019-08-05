package co.com.demo.controller;

import co.com.demo.model.Agilismo;
import co.com.demo.repository.AgilismoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/valoracion")
public class AgilismoController {

    @Autowired
    AgilismoRepository agilismoRepository;

    @PostMapping("/guardarPilar4")
    public Agilismo pilar4 (@RequestBody Agilismo data)
    {
        return agilismoRepository.save(data);
    }

    @GetMapping("/resultadofinal/{celula}")
    public List<Object> finddistinctallby(@PathVariable(value="celula") String celula) {
        return agilismoRepository.finddistinctallby(celula);

    }

}
