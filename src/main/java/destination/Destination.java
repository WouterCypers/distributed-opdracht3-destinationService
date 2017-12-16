package destination;

public class Destination {

	private int zipcode;
	private String name;
	private String country;
	private double area;
	private int population;
	
	public Destination() { }
	
	public Destination(int zipcode, String name, String country, double area, int population) { 
		setZipcode(zipcode);
		setName(name);
		setCountry(country);
		setArea(area);
		setPopulation(population);
	}
	
	public int getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
}
