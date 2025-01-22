import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Flight
{
	private int flightNumber;
	private String flightName;
	private String flightSource;
	private String flightDestination;
	private double flightPrice;
	public Flight(int flightNumber, String flightName, String flightSource, String flightDestination,
			double flightPrice) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
		this.flightPrice = flightPrice;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public double getFlightPrice() {
		return flightPrice;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", flightSource=" + flightSource
				+ ", flightDestination=" + flightDestination + ", flightPrice=" + flightPrice + "]";
	}
	
	
}
public class TestMapWithUserdefined {

	public static void main(String[] args) {

  List<Flight> listOfFlight=new ArrayList();
  listOfFlight.add(new Flight(1238, "Indigo", "kolkata", "Pune", 5908.00));
  listOfFlight.add(new Flight(1289, "AirAsia", "Chennai", "Bangalore", 9908.00));
  listOfFlight.add(new Flight(1998, "SpriceJet", "Indore", "Lucknow", 4908.00));
  listOfFlight.add(new Flight(2388, "Vistara", "kolkata", "Singapore", 1908.00));
  listOfFlight.add(new Flight(1818, "Indigo", "Kochi", "Bhubaneswar", 3904.00));
  listOfFlight.add(new Flight(1258, "Jet", "kolkata", "Pune", 6902.00));
  
  
  
  /*
   * before jdk1.8 
   * we need to create one list called listOfFlightName
   * object by initializing arraylist or linked list
   * 
   * we need iterate that list 
   * 
   * fetch all names
   * 
   * add all nemmes to listOfFlightName
   * 
   */
  
  
  //Now If I want to getName all the airline names
  listOfFlight.stream().
  map(flight->flight.getFlightName()).
  collect(Collectors.toSet()).
  forEach(flightName->System.out.println(flightName));
  
  //I want to fetch flight names which starts with ends
 int numberFlights=(int) listOfFlight.stream().
		 filter(flight->flight.getFlightNumber()%10==8).count();
  System.out.println(numberFlights);
  
  //I want findFirst object of flight
 Optional<Flight>  optional=listOfFlight.stream().findFirst();
  if(optional.isPresent())
  {
	  System.out.println(optional.get().getFlightName() + " "+optional.get().getFlightPrice());
	  
  }
  else
  {
	  System.out.println("no value");
  }
 //I want to iterate all the flight based on ASC order
  Comparator<Flight> cmp=(obj1,obj2)->
obj1.getFlightPrice()>obj2.getFlightPrice()?
   1:-1;
  listOfFlight.stream().
  sorted(cmp).
  forEach(flight-> System.out.println(flight));
  
  //get flight with high cost
 Flight flight= listOfFlight.stream().max(cmp).get();
System.out.println("******HIGH PRICE FLIGHTS******");
System.out.println(flight);
		
//get All cost of flights

double amt=listOfFlight.stream().map(f->f.getFlightPrice()).reduce(0.0,(sum,price)->sum+price);
System.out.println(amt);
	
//search all flight from source to destination
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter source");
	String src=scanner.next();
	System.out.println("Enter destination");
	String dest=scanner.next();
	
	listOfFlight.stream().
	filter(flt->flt.getFlightSource().equalsIgnoreCase(src) && flt.getFlightDestination().equalsIgnoreCase(dest)).
	forEach(f->System.out.println(f));
	}
	
	
	
	
	
	
}
