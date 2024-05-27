package it.epicode.ProgettoSettimanale.services;

import it.epicode.ProgettoSettimanale.entities.Dipendente;
import it.epicode.ProgettoSettimanale.entities.Dispositivo;
import it.epicode.ProgettoSettimanale.repositories.DipendenteRepository;
import it.epicode.ProgettoSettimanale.repositories.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DispositivoService {

    @Autowired
    private DispositivoRepository dispositivoRepository;


    public Dispositivo saveDispositivo(Dispositivo d) {

        return dispositivoRepository.save(d);
    }

    public Page<Dispositivo> getListDispositivi(Pageable p) {

        return dispositivoRepository.findAll(p);
    }

    public Optional<Dispositivo> getDispositivoById(Long id) {

        return dispositivoRepository.findById(id);
    }

    public Optional<Dispositivo> updateDispositivoById(Long id, Dispositivo dip) {

        Optional<Dispositivo> foundeDisp = dispositivoRepository.findById(id);

        if(foundeDisp.isPresent()){

            var existingDip = foundeDisp.get();

            if(dip.getDipendente() != null){

                existingDip.setDipendente(dip.getDipendente());
            }
            if(dip.getTipoDispositivo()!= null){

                existingDip.setTipoDispositivo(dip.getTipoDispositivo());
            }
            if(dip.getStatus()!= null){

                existingDip.setStatus(dip.getStatus());
            }

            return Optional.of(dispositivoRepository.save(existingDip));
        }else{
            return Optional.empty();

        }}
    public Optional<Dispositivo> deleteDispositivoById(Long id){

        Optional<Dispositivo> d = dispositivoRepository.findById(id);
        if(d.isPresent()){
            dispositivoRepository.deleteById(id);
            return Optional.of(d.get());
        }else{
            return Optional.empty();
        }
    }
}
