package za.ac.cputweek.services;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cputweek.domain.Location;
import org.springframework.stereotype.Service;
import za.ac.cputweek.repository.LocationRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocationServices  {

    @Autowired
    private LocationRepository repository;


    public List<Location> getAllLocation()
    {
        List<Location> locations=new ArrayList<>();
        repository.findAll().forEach(locations::add);
        return locations;
    }

    public Optional<Location> getLocation(String id)
    {
        return repository.findById(id);

    }


    public void addLocation(Location location)
    {
         repository.save(location);
    }

    public void updateLocation(String id,Location l)
    {
        repository.save(l);
    }

    public void deleteLocation(String id)
    {
        repository.deleteById(id);
    }


}
