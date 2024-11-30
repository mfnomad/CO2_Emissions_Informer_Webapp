package controller;

import model.EmissionEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EmissionEntryService;

import java.util.List;

@RestController
@RequestMapping("/emissions")
public class EmissionEntryController {

    @Autowired
    private EmissionEntryService service;

    @GetMapping
    public List<EmissionEntry> getAllEmissions() {
        System.out.println("getAll called()");
        return service.getAllEmissions();
    }

    @GetMapping("/year/{year}")
    public List<EmissionEntry> getEmissionsByYear(@PathVariable Long year) {
        return service.getEmissionsByYear(year);
    }
}
