/*
package co.com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.demo.DAO.AvesDao;
import co.com.demo.DAO.ZonasDao;
import co.com.demo.model.Aves;
import co.com.demo.model.Zonas;;

*/
//CRUD para la tabla AVES
/*
@RestController
@CrossOrigin
@RequestMapping("/ias")
public class AvesController {
	@Autowired
	AvesDao avesDAO;
	@Autowired
	ZonasDao zonasDao;

	@GetMapping("/aves/{nombre}/nombre")zonas
	public Aves getAves(@PathVariable(value="nombre") String nombre)
	{
		return avesDAO.findAvesByParams(nombre);
	}

	@CrossOrigin
	@PostMapping("/aves")
	public Aves createAves(@Valid @RequestBody Aves ave)
	{
		return avesDAO.save(ave);
	}
	@GetMapping("/aves")
	public List<Aves> ListAllAves()
	{
		return avesDAO.findAll();
	}
	
	@GetMapping("/zonas")
	public List<Zonas> ListAllZonas()
	{
		return zonasDao.findAll();
	}
	
	@GetMapping("/ave/{id}")
	public ResponseEntity<Object> getAveByCode(@PathVariable(value="id") String cdave)
	{
		Aves ave = avesDAO.findOne(cdave);
		if(ave ==null)
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(ave);
	}
	@GetMapping("/ave/{zona}/{nombre}")
	public ResponseEntity<Object> getAveByCode(@PathVariable(value="zona") String zona,@PathVariable(value="nombre") String nombre)
	{
		Aves ave = avesDAO.findOne("1");
		if(ave ==null)
		{
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(ave);
	}
	@CrossOrigin
	@PutMapping("/ave/{id}")
	public ResponseEntity<Object> updateAve(@PathVariable(value="id") String cdave, @Valid @RequestBody Aves aveDetails)
	{
		Aves ave = avesDAO.findOne(cdave);
		if(ave ==null)
		{
			return ResponseEntity.notFound().build();
		}
		ave.setDsnombreCientifico(aveDetails.getDsnombreCientifico());
		ave.setDsnombreComun(aveDetails.getDsnombreComun());
		Aves updatedAve =  avesDAO.save(ave);
		return ResponseEntity.ok().body(updatedAve);
	}

	@CrossOrigin
	@DeleteMapping("/ave/{id}")
	public ResponseEntity<Object> updateAve(@PathVariable(value="id") String cdave)
	{
		Aves ave = avesDAO.findOne(cdave);
		if(ave ==null)
		{
			return ResponseEntity.notFound().build();
		}
		avesDAO.delete(ave);
		return ResponseEntity.ok().body(ave);
	}
}

 */

