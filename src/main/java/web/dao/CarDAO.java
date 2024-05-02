package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<Car>();

        cars.add(new Car("jiguli", 1900, "tom"));
        cars.add(new Car("audi", 2000, "jery"));
        cars.add(new Car("lada", 2100, "kowalsky"));
        cars.add(new Car("mersedez", 2200, "pepe"));
        cars.add(new Car("java4x", 2300, "popo"));
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public List<Car> getCars(Integer count) {
        if(count == null) {
            return getCars();
        }
        return this.cars.stream().limit(count).toList();
    }
}
