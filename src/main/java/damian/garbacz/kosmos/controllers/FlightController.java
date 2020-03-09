package damian.garbacz.kosmos.controllers;


import damian.garbacz.kosmos.entities.Flight;
import damian.garbacz.kosmos.entities.Tourist;
import damian.garbacz.kosmos.services.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

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

    @GetMapping("/add")
    public String addFlightForm(Model model){
        model.addAttribute("flight", new Flight());
        return "add-flight";
    }

    @PostMapping("/add")
    public String processAddFlight(Flight flight){
        flightService.addFlight(flight);
        return "redirect:/flights/showAll";
    }

    @GetMapping("/delete")
    public String deleteFlight(Long id){
        flightService.deleteFlight(id);
        return "redirect:/flights/showAll";
    }

    @GetMapping("/bookForm")
    public String bookFormPage(Model model){
        model.addAttribute("flights", flightService.findAllFlights());
        return "book-flight";
    }

    @PostMapping("/bookForm")
    public String bookFlightResult(LocalDate arrivalDate, Integer ticketCost, Model model){
        model.addAttribute("flightsToBook",flightService.findBookFlights(arrivalDate, ticketCost));
        return "book-flight";
    }
}
