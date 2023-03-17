package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void addCar(Car car);
    Car getCar(Long id);
    List<User> listUsers();
    User getUserByCarModelAndSeries(String model, int series);
}
