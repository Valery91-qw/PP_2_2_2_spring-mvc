package web.dao;

import java.util.List;

import web.models.Car;

public interface CarDao {
    List<Car> getCars();
    List<Car> getCars(Integer count);
}
