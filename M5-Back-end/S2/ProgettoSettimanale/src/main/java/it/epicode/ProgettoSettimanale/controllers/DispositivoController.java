package it.epicode.ProgettoSettimanale.controllers;

import it.epicode.ProgettoSettimanale.entities.Dipendente;
import it.epicode.ProgettoSettimanale.entities.Dispositivo;
import it.epicode.ProgettoSettimanale.services.DipendenteService;
import it.epicode.ProgettoSettimanale.services.DispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/dispositivi")
public class DispositivoController {

    @Autowired
    DispositivoService dipService;

    @PostMapping
    public ResponseEntity<Dispositivo> salvaDispositivo(@RequestBody Dispositivo d){

        var dip = dipService.saveDispositivo(d);

        return new ResponseEntity<>(dip, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<Dispositivo>> listaDispositivi(Pageable p){

        var dip = dipService.getListDispositivi(p);

        return new ResponseEntity<>(dip, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Dispositivo>> getDispositivoById(@PathVariable Long id){

        var dip = dipService.getDispositivoById(id);

        return new ResponseEntity<>(dip, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Optional<Dispositivo>> updateDispositivo(@PathVariable Long id,@RequestBody Dispositivo dip){

        var d = dipService.updateDispositivoById(id, dip);
        if(d.isPresent()){
            return new ResponseEntity<>(d, HttpStatus.OK);
        }else{
            throw new RuntimeException("Error updating");
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Dispositivo> deleteDispositivo(@PathVariable Long id){
        var d = dipService.deleteDispositivoById(id);
        if(d.isPresent()){
            return new ResponseEntity<>(d.get(), HttpStatus.OK);
        }else{
            throw new RuntimeException("Error deleting");
        }
    }
}
