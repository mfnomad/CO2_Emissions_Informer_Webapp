package service;

import model.EmissionEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmissionEntryRepository;

import java.util.List;

@Service
public class EmissionEntryService {

    @Autowired
    private EmissionEntryRepository repository;

    public List<EmissionEntry> getEmissionsByYear(Long year) {
        return repository.findByYear(year);
    }

    public List<EmissionEntry> getAllEmissions() {
        return repository.findAll();
    }
}
