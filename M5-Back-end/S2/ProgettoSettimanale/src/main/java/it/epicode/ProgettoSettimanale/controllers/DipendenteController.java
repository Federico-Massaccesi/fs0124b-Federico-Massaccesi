package it.epicode.ProgettoSettimanale.controllers;

import it.epicode.ProgettoSettimanale.entities.Dipendente;
import it.epicode.ProgettoSettimanale.exceptions.InvalidDataProvided;
import it.epicode.ProgettoSettimanale.exceptions.NoElementFoundExc;
import it.epicode.ProgettoSettimanale.records.DipendenteValidation;
import it.epicode.ProgettoSettimanale.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/dipendente")
public class DipendenteController {

    @Autowired
    DipendenteService dipService;

    @PostMapping
    public ResponseEntity<?> salvaDipendente(@RequestBody @Validated DipendenteValidation  d, BindingResult validation){

        if(validation.hasErrors()) {
            throw new InvalidDataProvided(validation.getAllErrors().toString());
        }else{
            var Dip = Dipendente.builder()
                    .withNome(d.nome())
                    .withCognome(d.cognome())
                    .withUsername(d.username())
                    .withEmail(d.email())
                    .withDispositivi(d.dispositivi())
                    .build();
            var dip = dipService.saveDipendente(Dip);

            return new ResponseEntity<>(dip, HttpStatus.CREATED);
        }

    }
    @GetMapping
    public ResponseEntity<Page<Dipendente>> listaDipendenti(Pageable p){

        var dip = dipService.getListDip(p);

        return new ResponseEntity<>(dip, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Dipendente>> getDipendenteById(@PathVariable Long id){
    try {
        var dip = dipService.getDipendenteById(id);

        return new ResponseEntity<>(dip, HttpStatus.OK);
    }catch(Exception e){
        throw new NoElementFoundExc("Dipendente non trovato");
        }
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Optional<Dipendente>> updateDipendente(@PathVariable Long id,@RequestBody Dipendente dip){

        var d = dipService.updateDipendenteById(id, dip);
        if(d.isPresent()){
            return new ResponseEntity<>(d, HttpStatus.OK);
        }else{
            throw new RuntimeException("Error updating");
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Dipendente> deleteDipendente(@PathVariable Long id){
        var d = dipService.deleteDipendenteById(id);
        if(d.isPresent()){
            return new ResponseEntity<>(d.get(), HttpStatus.OK);
        }else{
            throw new RuntimeException("Error deleting");
        }
    }
}
