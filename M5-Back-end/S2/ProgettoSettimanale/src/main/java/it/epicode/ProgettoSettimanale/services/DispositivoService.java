package it.epicode.ProgettoSettimanale.services;

import it.epicode.ProgettoSettimanale.repositories.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DispositivoService {

    @Autowired
    private DispositivoRepository dispositivoRepository;
}