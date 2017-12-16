package destination;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DestinationRepository {

	private Map<Integer, Destination> destinations;
	
	public DestinationRepository() {
		this.destinations = new TreeMap<Integer, Destination>();
		
		// Fake data
		Destination hasselt = new Destination(1000, "Brussel", "Belgium", 32.61, 176545);
		Destination leuven = new Destination(3000, "Leuven", "Belgium", 55.63, 99288);
		Destination gent = new Destination(9000, "Gent", "Belgium", 156.18, 257029);
		
		addDestination(hasselt);
		addDestination(leuven);
		addDestination(gent);
	}
	
	public Destination getDestination(int zipcode) throws DestinationNotFoundException {
		if(!destinations.containsKey(zipcode)) {
			throw new DestinationNotFoundException("The destination with zipcode " + zipcode + " was not found.");
		}
		return this.destinations.get(zipcode);
	}
	
	public List<Destination> getDestinations() {
		return new ArrayList<Destination>(destinations.values());
	}
	
	public void addDestination(Destination destination) {
		this.destinations.put(destination.getZipcode(), destination);
	}
	
	public void deleteDestination(int zipcode) {
		this.destinations.remove(zipcode);
	}
	
}
