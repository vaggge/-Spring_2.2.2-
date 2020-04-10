package web.DAO;

import web.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarCarDaoImpl implements CarDAO {

    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getListOfCar() {
        cars.add(new Car("bmv", "m1", 1));
        cars.add(new Car("bmv", "m2", 2));
        cars.add(new Car("bmv", "m3", 3));
        return cars;
    }
}
