package co.com.demo.controller;


import javax.validation.Valid;

import co.com.demo.model.Informacion;
import org.springframework.web.bind.annotation.CrossOrigin;
import co.com.demo.repository.InformacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/valoracion")
public class InformacionController {

    @Autowired
    InformacionRepository informacionRepository;

    @PostMapping("/guardarinformacion")
    public Informacion informacion (@RequestBody Informacion data)
    {
        return informacionRepository.save(data);
    }

    @PostMapping("/guardarMadurez")
    public Informacion updateMadurez(@RequestBody Informacion data) {

        Informacion ingresoDb = informacionRepository.findByCelula(data.getCelula());
        ingresoDb.setNueva_madurez(data.getNueva_madurez());
        ingresoDb.setNueva_madureznum(data.getNueva_madureznum());

        return informacionRepository.save(ingresoDb);
    }

 }
