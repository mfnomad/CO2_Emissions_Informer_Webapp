package repository;

import model.EmissionEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmissionEntryRepository extends JpaRepository<EmissionEntry, String> {
    List<EmissionEntry> findByCountryAndYear(String country, String year);


}

