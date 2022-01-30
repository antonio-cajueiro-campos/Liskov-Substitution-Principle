import entity.User;
import repository.MySQLConfiguration;
import repository.MySQLRepositoryImplementation;
import service.UserService;

import java.util.List;

public class main {

    public static void main(String[] args) {

        UserService userService = new UserService(new MySQLRepositoryImplementation(new MySQLConfiguration()));

        userService.saveUser(new User(
                0L,
                "Maria",
                "03/01/1998",
                "kimeesan5"
        ));
        userService.saveUser(new User(
                1L,
                "Antonio Carlos",
                "03/01/2000",
                "kimeesan5@gmail.com"
        ));

        List<User> allUsers = userService.getAllUsers();

        allUsers.forEach(user -> {
            System.out.println(user.getInformation());
        });

        System.out.println("--------------------");
        System.out.println(userService.getUser(1L).getInformation());

    }
}