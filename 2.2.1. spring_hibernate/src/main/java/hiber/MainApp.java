package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        userService.addUser(new User("ivan1", "kleshnev1", "milo1@mail.ru",
                new Car(1,"lada1")));
        userService.addUser(new User("ivan2", "kleshnev2", "milo2@mail.ru",
                new Car(2,"lada2")));
        userService.addUser(new User("ivan3", "kleshnev3", "milo3@mail.ru",
                new Car(3,"lada3")));
        userService.addUser(new User("ivan4", "kleshnev4", "milo4@mail.ru",
                new Car(4,"lada4")));
        userService.addUser(new User("ivan5", "kleshnev5", "milo5@mail.ru",
                new Car(5,"lada5")));
        System.out.println("-------------------------------------------");
        userService.listUsers().forEach(System.out::println);
        System.out.println("-------------------------------------------");
        System.out.println(userService.getUserByCarModelAndSeries("lada4", 4));


        context.close();
    }
}
