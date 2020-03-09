package damian.garbacz.kosmos.controllers;


import damian.garbacz.kosmos.entities.Tourist;
import damian.garbacz.kosmos.services.FlightService;
import damian.garbacz.kosmos.services.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tourists")
public class TouristController {

    private final TouristService touristService;
    private final FlightService flightService;

    public TouristController(TouristService touristService, FlightService flightService) {
        this.touristService = touristService;
        this.flightService = flightService;
    }

    @GetMapping("/showAll")
    public String showTourists(Model model){
        model.addAttribute("tourists", touristService.findAllTourists());
        return "tourists";
    }

    @GetMapping("/add")
    public String addTouristForm(Model model){
        model.addAttribute("tourist", new Tourist());
        return "add-tourist";
    }

    @PostMapping("/add")
    public String processAddTourist(Tourist tourist){
        touristService.addTourist(tourist);
        return "redirect:/tourists/showAll";
    }

    @GetMapping("/delete")
    public String deleteTourist(Long id){
        touristService.deleteTourist(id);
        return "redirect:/tourists/showAll";
    }

    @GetMapping("/edit")
    public String editTourist(Long id, Model model){
        model.addAttribute("allFlights", flightService.findAllFlights());
        model.addAttribute("touristId", id);
        return "tourist-flights";
    }
    @GetMapping("/addToTourist")
    public String addFlightToTourist(Long flightId, Long touristId, Model model){
            touristService.addFlightToTourist(flightId, touristId);
        model.addAttribute("touristId", touristId);
        return "tourist-flights";
    }

}
