package repository;

import java.util.LinkedList;
import java.util.Optional;

public interface Repository<T, ID> {

    <S extends T> T salvar(S entity);

    Optional<T> encontrarPorId(ID id);

    LinkedList<T> encontrarTodos();
}
