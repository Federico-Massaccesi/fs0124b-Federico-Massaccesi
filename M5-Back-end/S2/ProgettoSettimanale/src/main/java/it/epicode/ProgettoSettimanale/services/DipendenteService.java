package it.epicode.ProgettoSettimanale.services;

import it.epicode.ProgettoSettimanale.entities.Dipendente;
import it.epicode.ProgettoSettimanale.repositories.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<Dipendente> getListDip() {

        return dipendenteRepository.findAll();
    }

    public Optional<Dipendente> getDipendenteById(Long id) {

        return dipendenteRepository.findById(id);
    }

    public Optional<Dipendente> deleteDipendenteById(Long id){

        Optional<Dipendente> d = dipendenteRepository.findById(id);
        if(d.isPresent()){
            dipendenteRepository.deleteById(id);
            return Optional.of(d.get());
        }else{
            return Optional.empty();
        }
    }
}
