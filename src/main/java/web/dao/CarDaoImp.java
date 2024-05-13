package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<Car>();

        cars.add(new Car("jiguli", 1900, "tom"));
        cars.add(new Car("audi", 2000, "jery"));
        cars.add(new Car("lada", 2100, "kowalsky"));
        cars.add(new Car("mersedez", 2200, "pepe"));
        cars.add(new Car("java4x", 2300, "popo"));
    }

    @Override
    public List<Car> getCars() {
        return this.cars;
    }

    @Override
    public List<Car> getCars(Integer count) {
        return this.cars.stream().limit(count).toList();
    }
}
