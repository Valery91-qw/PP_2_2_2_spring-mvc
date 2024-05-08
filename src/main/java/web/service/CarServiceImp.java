package web.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import web.dao.CarDao;
import web.models.Car;

@Repository
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars() {
        return this.carDao.getCars();
    }

    @Override
    public List<Car> getCars(Integer count) {
        return this.carDao.getCars(count);
    }
    
}
