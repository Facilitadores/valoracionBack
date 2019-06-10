package co.com.demo.controller;

import co.com.demo.model.Facilitador;
import co.com.demo.model.Preguntas;
import co.com.demo.repository.FacilitadorRepository;
import co.com.demo.repository.PreguntasRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.ResponseEntity;


import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/valoracion")
public class FacilitadorController {
    @Autowired
    FacilitadorRepository facilitadorRepository;

    @GetMapping("/celulas")
    public List<Facilitador> findAll() {
        return facilitadorRepository.findAll();
    }

    @GetMapping("/facilitadorcelula/{celula}")
    public Facilitador celulafacilitador (@PathVariable(value="celula") String celula)
            {
        return facilitadorRepository.findAllByCelula(celula);
        }
}