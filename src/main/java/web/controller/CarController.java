package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String printCarsEn(ModelMap model, HttpServletRequest request){
        String a = request.getParameter("locale");
        model.addAttribute("cars", getListOfCars());
        model.addAttribute("locale", request.getParameter("locale"));
        return "cars";
    }
    private List<Car> getListOfCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmv", "m1", 1));
        cars.add(new Car("bmv", "m2", 2));
        cars.add(new Car("bmv", "m3", 3));
        return cars;
    }
}
