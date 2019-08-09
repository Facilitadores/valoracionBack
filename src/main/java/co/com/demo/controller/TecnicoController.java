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
        Tecnico updateDb = tecnicoRepository.findByCelula(data.getCelula());
        updateDb.setAplicaciones(data.getAplicaciones());
        updateDb.setAplicacionesnume(data.getAplicacionesnume());
        updateDb.setArquitectDevops(data.getArquitectDevops());
        updateDb.setArquitectnumeDevops(data.getArquitectnumeDevops());
        updateDb.setEstandares(data.getEstandares());
        updateDb.setEstandaresnume(data.getEstandaresnume());
        updateDb.setTecnicoDevops(data.getTecnicoDevops());
        updateDb.setTecniconumeDevops(data.getTecniconumeDevops());
        updateDb.setResultpilar2(data.getResultpilar2());
        return tecnicoRepository.save(updateDb);
    }
}
