package application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import destination.Destination;
import destination.DestinationNotFoundException;
import destination.DestinationRepository;

@RestController
public class DestinationController {

	@Autowired
	private DestinationRepository destinationRepo;
	
	@GetMapping
	public List<Destination> getDestinations() {
		return destinationRepo.getDestinations();
	}
	
	@GetMapping("/{zipcode}")
	public Destination getDestination(@PathVariable int zipcode) throws DestinationNotFoundException {
		return destinationRepo.getDestination(zipcode);
	}
	
}
