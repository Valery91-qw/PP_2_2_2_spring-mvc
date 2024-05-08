package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarsController {

    private final CarDao carDao;

    public CarsController(CarDao carDAO) {
        this.carDao = carDAO;
    }

    @GetMapping(value = "/cars")
    public String setContent(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", carDao.getCars(count));
        return "cars";
    }
}
