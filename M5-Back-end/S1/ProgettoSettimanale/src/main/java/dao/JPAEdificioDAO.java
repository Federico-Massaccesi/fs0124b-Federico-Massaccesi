package dao;

import entities.Edificio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import repositories.EdificioRepository;

import java.util.Optional;
@Component
@Primary
@Slf4j
public class JPAEdificioDAO implements GenericDAO<Edificio> {

    @Autowired
    EdificioRepository repository;


    @Override
    public void save(Edificio object) {
        log.debug("Elemento {} salvato", object);
        repository.save(object);
    }


    @Override
    public void delete(Long id) {

        repository.deleteById(id);
    }

    @Override
    public Optional<Edificio> getById(Long id) {
        return repository.findById(id);
    }
}
