package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;

@Controller
@RequestMapping("/")
public class CarController {

    private final CarDAO carDAOImpl;

    @Autowired
    public CarController(CarDAOImpl carDAOImpl) {
        this.carDAOImpl = carDAOImpl;
    }

    @GetMapping("/cars")
    public String printCar(@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("count", carDAOImpl.getCars(count));
        return "index";
    }
}
