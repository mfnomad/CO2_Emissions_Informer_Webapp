package service;

import model.EmissionEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmissionEntryRepository;

import java.util.List;

@Service
public class EmissionEntryService {

    private final EmissionEntryRepository repository;

    @Autowired
    public EmissionEntryService(EmissionEntryRepository emissionEntryRepository) {
        this.repository = emissionEntryRepository;
    }



    public List<EmissionEntry> getAllEmissions() {
        return repository.findAll();
    }
}
