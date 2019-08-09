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
        NegocioyProceso updateDb = negocioyProcesoRepository.findByCelula(data.getCelula());
        updateDb.setNegocio(data.getNegocio());
        updateDb.setNegocionume(data.getNegocionume());
        updateDb.setPracticas(data.getPracticas());
        updateDb.setPracticasnume(data.getPracticasnume());
        updateDb.setProceso_hy_mnume(data.getProceso_hy_mnume());
        updateDb.setProceso_hym(data.getProceso_hym());
        updateDb.setUsd_usm(data.getUsd_usm());
        updateDb.setUsd_usmnume(data.getUsd_usmnume());
        updateDb.setResultpilar3(data.getResultpilar3());
        return negocioyProcesoRepository.save(updateDb);
    }
}
