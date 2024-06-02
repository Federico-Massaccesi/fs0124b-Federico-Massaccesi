package it.epicode.ProgettoSettimanale.controllers;

import it.epicode.ProgettoSettimanale.entities.Event;
import it.epicode.ProgettoSettimanale.repositories.EventRepository;
import it.epicode.ProgettoSettimanale.services.EventService;
import it.epicode.ProgettoSettimanale.validationClasses.EventPostValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    EventRepository repo;

    @Autowired
    EventService svc;

    @PostMapping
    public ResponseEntity<Event> addEvent(@RequestBody @Validated EventPostValidation event
    , BindingResult validation){
        if (validation.hasErrors()) {
            throw new RuntimeException("no");
        }
        var newEvent = Event.builder()
                .withData(event.data())
                .withDescrizione(event.descrizione())
                .withPostiDisponibili(event.postiDisponibili())
                .withTitolo(event.titolo())
                .withDisponibilitàPrenotazione(true)
                .withLuogo(event.luogo())
                .withPostiPrenotati(0)
                .build();

        repo.save(newEvent);

        return new ResponseEntity<Event>(newEvent, HttpStatus.CREATED);


    }
}
