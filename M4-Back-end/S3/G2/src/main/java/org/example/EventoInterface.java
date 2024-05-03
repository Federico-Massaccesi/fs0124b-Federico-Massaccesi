package org.example;

import it.epicode.Evento;

public interface EventoInterface {

    public void save(Evento ev);

    public Evento getById(Integer id);

    public void delete(Evento ev);
}
