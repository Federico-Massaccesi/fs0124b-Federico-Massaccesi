package it.epicode.ProgettoSettimanale.services;

import it.epicode.ProgettoSettimanale.entities.Dipendente;
import it.epicode.ProgettoSettimanale.exceptions.NoElementFoundExc;
import it.epicode.ProgettoSettimanale.repositories.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DipendenteService {

    @Autowired
    private DipendenteRepository dipendenteRepository;

    public Dipendente saveDipendente(Dipendente d) {

        return dipendenteRepository.save(d);
    }

    public Page<Dipendente> getListDip(Pageable p) {

        return dipendenteRepository.findAll(p);
    }

    public Optional<Dipendente> getDipendenteById(Long id) {


        if(dipendenteRepository.findById(id).isPresent()){
            return dipendenteRepository.findById(id);
        }else {
            throw new NoElementFoundExc("Nessun dipendente trovato con l'ID specificato");
        }
    }

    public Optional<Dipendente> updateDipendenteById(Long id, Dipendente dip) {

        Optional<Dipendente> foundeDip = dipendenteRepository.findById(id);

        if(foundeDip.isPresent()){

            var existingDip = foundeDip.get();

            if(dip.getNome() != null){

                existingDip.setNome(dip.getNome());
            }
            if(dip.getCognome()!= null){

                existingDip.setCognome(dip.getCognome());
            }
            if(dip.getEmail()!= null){

                existingDip.setEmail(dip.getEmail());
            }
            if(dip.getUsername()!= null){

                existingDip.setUsername(dip.getUsername());
            }
            if(dip.getDispositivi()!= null){

                existingDip.setDispositivi(dip.getDispositivi());
            }

            return Optional.of(dipendenteRepository.save(existingDip));
        }else{
            throw new NoElementFoundExc("Nessun dipendente trovato con l'ID specificato");

        }}
    public Optional<Dipendente> deleteDipendenteById(Long id){

        Optional<Dipendente> d = dipendenteRepository.findById(id);
        if(d.isPresent()){
            dipendenteRepository.deleteById(id);
            return Optional.of(d.get());
        }else{
            throw new NoElementFoundExc("Nessun dipendente trovato con l'ID specificato");
        }
    }
}
