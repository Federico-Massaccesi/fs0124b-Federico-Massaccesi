package dao;

import java.util.Optional;

public interface GenericDAO<T> {

    public void save(T object);

    public void delete(Long id);

    public Optional<T> getById(Long id);

}
