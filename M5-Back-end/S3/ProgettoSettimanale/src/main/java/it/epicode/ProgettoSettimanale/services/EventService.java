package it.epicode.ProgettoSettimanale.services;

import it.epicode.ProgettoSettimanale.entities.Event;
import it.epicode.ProgettoSettimanale.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event saveUser(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(Long id) {
        if(eventRepository.findById(id).isPresent()) {
            return eventRepository.findById(id);
        }else{
            return Optional.empty();//SOSTITUIRE CON ECCEZIONE
        }
    }

    public Event updateEvent(Event event,Long id) {

        var foundedEvent = eventRepository.findById(id);

        if(foundedEvent.isPresent()) {

            var definedEvent = foundedEvent.get();

            var updatedEvent = definedEvent.builder()
                            .withData(event.getData())
                            .withDescrizione(event.getDescrizione())
                            .withDisponibilitàPrenotazione(event.isDisponibilitàPrenotazione())
                            .withLuogo(event.getLuogo())
                            .withPostiDisponibili(event.getPostiDisponibili())
                            .withPostiPrenotati(event.getPostiPrenotati())
                            .withTitolo(event.getTitolo())
                    .build();

            updatedEvent.setId(definedEvent.getId());
            return eventRepository.save(updatedEvent);
        }else{
            throw new RuntimeException("errore sdfogh"); //ECCEZIONE
        }
    }

    public Event delete(Long id){
        var foundedEvent = eventRepository.findById(id);

        if(foundedEvent.isPresent()) {
            eventRepository.delete(foundedEvent.get());
            return foundedEvent.get();
        }else{
            throw new RuntimeException("fefe");//ECCEZIONE

        }
    }
}
