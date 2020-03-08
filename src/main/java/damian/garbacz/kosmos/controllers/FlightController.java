package damian.garbacz.kosmos.controllers;


import damian.garbacz.kosmos.entities.Tourist;
import damian.garbacz.kosmos.services.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/showAll")
    public String showFlights(Model model){
        model.addAttribute("flights", flightService.findAllFlights());
        return "flights";
    }

//    @GetMapping("/add")
//    public String addTouristForm(Model model){
//        model.addAttribute("tourist", new Tourist());
//        return "add-tourist";
//    }
//
//    @PostMapping("/add")
//    public String processAddTourist(Tourist tourist){
//        touristService.addTourist(tourist);
//        return "redirect:/tourists/showAll";
//    }
//
//    @GetMapping("/delete")
//    public String deleteTourist(Long id){
//        touristService.deleteTourist(id);
//        return "redirect:/tourists/showAll";
//    }
}
