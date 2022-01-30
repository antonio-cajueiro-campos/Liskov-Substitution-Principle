package service;

import entity.User;
import repository.Repository;

import java.util.LinkedList;
import java.util.Optional;

public class UserService implements IUserService {

    private final Repository<User, Long> userRepository;

    public UserService(Repository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.salvar(user);
    }

    @Override
    public User getUser(Long id) {
        Optional<User> userOpt = userRepository.encontrarPorId(id);
        return Optional.ofNullable(userOpt.get()).get();
    }

    @Override
    public LinkedList<User> getAllUsers() {
        return userRepository.encontrarTodos();
    }


}
