package damian.garbacz.kosmos.controllers;


import damian.garbacz.kosmos.services.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tourists")
public class TouristController {

    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }


    @GetMapping("")
    public String showTourists(){
        return "tourists";
    }
}
