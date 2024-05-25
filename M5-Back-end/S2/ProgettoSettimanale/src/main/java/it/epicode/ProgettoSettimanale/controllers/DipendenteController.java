package it.epicode.ProgettoSettimanale.controllers;

import it.epicode.ProgettoSettimanale.entities.Dipendente;
import it.epicode.ProgettoSettimanale.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dipendente")
public class DipendenteController {

    @Autowired
    DipendenteService dipService;

    @PostMapping
    public ResponseEntity<Dipendente> salvaDipendente(@RequestBody Dipendente d){

        var dip = dipService.saveDipendente(d);

        return new ResponseEntity<>(dip, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<Dipendente>> listaDipendenti(Pageable p){

        var dip = dipService.getListDip(p);

        return new ResponseEntity<>(dip, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Dipendente>> getDipendenteById(@PathVariable Long id){

        var dip = dipService.getDipendenteById(id);

        return new ResponseEntity<>(dip, HttpStatus.OK);
    }


}
