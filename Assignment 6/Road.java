
public class Road implements Comparable<Road>{

	String name;
	int weight;
	Town source;
	Town destination;
	public Road(Town source, Town destination,int degrees, String name) {
	this.name = name;
	this.weight = degrees;
	this.source = source;
	this.destination = destination;
	}
	
	public Road(Town source, Town destination, String name) {
		this.source = new Town (source);
		this.destination = new Town (destination);
		this.name = name;
		weight = 1;
	}
	
	public boolean contains(Town town) {
		if(source.equals(town) || destination.equals(town)) {
			return true;
		} else
			return false;
	}

	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}

	public Town getSource() {
		return this.source;
	}

	public Town getDestination() {
		return this.destination;
	}

	@Override
	public int compareTo(Road o) {
		return this.name.compareTo(o.getName());
	}
		
	@Override
	public boolean equals(Object o) {
		Road r= (Road)o;

		return ((source.equals(r.getSource())) && (destination.equals(r.getDestination())))
				|| ((source.equals(r.getDestination())) && (destination.equals(r.getSource())));

	}

	@Override
	public String toString() {
		return "Road: " + name + ", connecting "+ source+ " to " + destination + " by " + weight + " mi";
	}
	
}
