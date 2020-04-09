package web.service;

import web.DAO.*;
import web.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDAO dao;

    @Override
    public List<Car> getListOfCar() {
        return dao.getListOfCar();
    }
}
