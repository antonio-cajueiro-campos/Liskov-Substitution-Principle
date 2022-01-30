package repository;

import entity.User;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;

public class MySQLRepositoryImplementation<T, ID> implements Repository<T, ID> {

    private MySQLConfiguration mySQLConfiguration;

    public static int COUNT = 0;

    private LinkedList<T> storage = new LinkedList<>();

    public MySQLRepositoryImplementation(MySQLConfiguration mySQLConfiguration) {
        this.mySQLConfiguration = mySQLConfiguration;
    }

    @Override
    public <S extends T> T salvar(S entity) {
        storage.add(Integer.parseInt(entity.toString()), entity);
        return entity;
    }

    @Override
    public Optional<T> encontrarPorId(ID id) {
        Iterator<T> entityIterator = storage.iterator();
        while (entityIterator.hasNext()) {
            T entity = entityIterator.next();
            if (Integer.parseInt(entity.toString()) == Integer.parseInt(id.toString())) {
                T ent = storage.get(Integer.parseInt(entity.toString()));
                return Optional.ofNullable(ent);
            }
        }
        return Optional.of(null);
    }

    @Override
    public LinkedList<T> encontrarTodos() {
        return storage;
    }
}
