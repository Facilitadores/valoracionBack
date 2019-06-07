package co.com.demo.controller;


import javax.validation.Valid;

import co.com.demo.model.Facilitador;
import co.com.demo.model.Preguntas;
import org.springframework.web.bind.annotation.CrossOrigin;
import co.com.demo.repository.PreguntasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/valoracion")
public class PreguntasController {
    @Autowired
    PreguntasRepository PreguntasRepository;

    //aca se debe realizar una validación si el usuario y la celula tienen datos debe actualizar si no es un insert
    @CrossOrigin
    @PostMapping("/preguntas")
    public  Preguntas guardarPreguntas (@RequestBody Preguntas data)
    {
        return PreguntasRepository.save(data);
    }

    @CrossOrigin
    @PostMapping("/preguntas1")
    public  Preguntas guardarPreguntasUno (@RequestBody Preguntas data)
    {
        Preguntas preguntasDb = PreguntasRepository.findByUsuario(data.getUsuario());
        preguntasDb.setObservaP1(data.getObservaP1());
        preguntasDb.setPre1Pi1(data.getPre1Pi1());
        preguntasDb.setPre2Pi1(data.getPre2Pi1());
        preguntasDb.setPre3Pi1(data.getPre3Pi1());
        return PreguntasRepository.save(preguntasDb);
    }
    @CrossOrigin
    @PostMapping("/preguntas2")
    public  Preguntas guardarPreguntasDos (@RequestBody Preguntas data)
    {
        Preguntas preguntasDb = PreguntasRepository.findByUsuario(data.getUsuario());
        preguntasDb.setObservaP2(data.getObservaP2());
        preguntasDb.setPre1Pi2(data.getPre1Pi2());
        preguntasDb.setPre2Pi2(data.getPre2Pi2());
        preguntasDb.setPre3Pi2(data.getPre3Pi2());
        preguntasDb.setPromedioP2(data.getPromedioP2());
        return PreguntasRepository.save(preguntasDb);
    }

    @PostMapping("/preguntas3")
    public  Preguntas guardarPreguntasTres (@RequestBody Preguntas data)
    {
        Preguntas preguntasDb = PreguntasRepository.findByUsuario(data.getUsuario());
        preguntasDb.setObservaP3(data.getObservaP3());
        preguntasDb.setPre1Pi3(data.getPre1Pi3());
        preguntasDb.setPre2Pi3(data.getPre2Pi3());
        preguntasDb.setPre3Pi3(data.getPre3Pi3());
        preguntasDb.setPromedioP3(data.getPromedioP3());
        return PreguntasRepository.save(preguntasDb);
    }

    @PostMapping("/preguntas4")
    public  Preguntas guardarPreguntasCuatro (@RequestBody Preguntas data)
    {
        Preguntas preguntasDb = PreguntasRepository.findByUsuario(data.getUsuario());
        preguntasDb.setObservaP4(data.getObservaP4());
        preguntasDb.setPre1Pi4(data.getPre1Pi4());
        preguntasDb.setPre2Pi4(data.getPre2Pi4());
        preguntasDb.setPre3Pi4(data.getPre3Pi4());
        preguntasDb.setPromedioP4(data.getPromedioP4());
        return PreguntasRepository.save(preguntasDb);
    }

    @PostMapping("/preguntas5")
    public  Preguntas guardarPreguntasCinco (@RequestBody Preguntas data)
    {
        Preguntas preguntasDb = PreguntasRepository.findByUsuario(data.getUsuario());
        preguntasDb.setObservaP5(data.getObservaP5());
        preguntasDb.setPre1Pi5(data.getPre1Pi5());
        preguntasDb.setPre2Pi5(data.getPre2Pi5());
        preguntasDb.setPre3Pi5(data.getPre3Pi5());
        preguntasDb.setPromedioP5(data.getPromedioP5());
        return PreguntasRepository.save(preguntasDb);
    }

    @PostMapping("/preguntas6")
    public  Preguntas guardarPreguntasSeis (@RequestBody Preguntas data)
    {
        Preguntas preguntasDb = PreguntasRepository.findByUsuario(data.getUsuario());
        preguntasDb.setObservaP6(data.getObservaP6());
        preguntasDb.setPre1Pi6(data.getPre1Pi6());
        preguntasDb.setPre2Pi6(data.getPre2Pi6());
        preguntasDb.setPre3Pi6(data.getPre3Pi6());
        preguntasDb.setPromedioP6(data.getPromedioP6());
        return PreguntasRepository.save(preguntasDb);
    }

    @PostMapping("/preguntasgeneral")
    public  Preguntas guardarPreguntasGeneral(@RequestBody Preguntas data)
    {
        Preguntas preguntasDb = PreguntasRepository.findByUsuario(data.getUsuario());
        preguntasDb.setOportunidades(data.getOportunidades());
        preguntasDb.setFortalezas(data.getFortalezas());
        preguntasDb.setPromedio_general(data.getPromedio_general());
        return PreguntasRepository.save(preguntasDb);
    }


}
