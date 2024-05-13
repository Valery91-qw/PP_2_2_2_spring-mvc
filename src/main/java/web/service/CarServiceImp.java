package web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import web.dao.CarDao;
import web.models.Car;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null) {
            return this.carDao.getCars();
        }
        return this.carDao.getCars(count);
    }
    
}
