package service;

import entity.User;
import java.util.LinkedList;

public interface IUserService {

    User saveUser(User user);

    User getUser(Long id) throws Exception;

    LinkedList<User> getAllUsers();
}
