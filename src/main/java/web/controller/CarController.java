package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", 2020),
            new Car("Lada", "Vesta", 2024),
            new Car("Mercedes", "A5", 2018),
            new Car("BMV", "X6", 2022),
            new Car("Ford", "Focus", 2015)
    );

    @GetMapping(path = "/")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> carsList = new ArrayList<>();
        if (count > 0 && count < 5) {
            for (int i = 0; i < count; i++) {
                carsList.add(cars.get(i));
            }
            model.addAttribute("cars", carsList);
        } else if (count >= 5) {
            model.addAttribute("cars", cars);
        }
        return "cars";
    }

}
