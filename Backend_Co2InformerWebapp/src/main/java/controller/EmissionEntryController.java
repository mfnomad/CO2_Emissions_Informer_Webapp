package controller;

import model.EmissionEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.EmissionEntryRepository;
import service.EmissionEntryService;

import java.util.List;

@RestController
@RequestMapping("/emissions")
@CrossOrigin(origins = "http://localhost:4200")
public class EmissionEntryController {


    private final EmissionEntryService service;
    private final EmissionEntryRepository repository;

    @Autowired
    public EmissionEntryController(EmissionEntryService emissionEntryService, EmissionEntryRepository repository_) {
        this.service = emissionEntryService;
        this.repository = repository_;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping
    public List<EmissionEntry> getAllEmissions() {
        System.out.println("getAll called()");
        return service.getAllEmissions();
    }


    @GetMapping("/country/{country}/year/{year}")
    public List<EmissionEntry> getEmissionsByCountryAndYear(@PathVariable String country, @PathVariable String year) {
        System.out.println("Fetching emissions for country: " + country + " and year: " + year);
        return repository.findByCountryAndYear(country, year);
    }

}

