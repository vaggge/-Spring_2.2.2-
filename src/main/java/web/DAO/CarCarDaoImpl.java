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
        return cars;
    }
}
