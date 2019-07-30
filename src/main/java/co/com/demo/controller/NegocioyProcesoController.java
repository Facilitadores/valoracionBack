package co.com.demo.controller;


import co.com.demo.model.NegocioyProceso;
import co.com.demo.repository.NegocioyProcesoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/valoracion")
public class NegocioyProcesoController {

    @Autowired
    NegocioyProcesoRepository negocioyProcesoRepository;

    @PostMapping("/guardarPilar3")
    public NegocioyProceso pilar3 (@RequestBody NegocioyProceso data)
    {
        return negocioyProcesoRepository.save(data);
    }
}
