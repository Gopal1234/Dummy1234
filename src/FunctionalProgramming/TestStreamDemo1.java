package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

//entity or model class
class Flight
{
	private int flightNumber;
	private String flightName;
	private String source;
	private String destination;
	private double price;
	public Flight(int flightNumber, String flightName, String source, String destination, double price) {
		
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", price=" + price + "]";
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public double getPrice() {
		return price;
	}
	
	
	
	
}
interface FlightService
{
	public void addFlight(Flight flight);
	public Set<Flight> getAllFlights();
	public int countFlights();
	public Flight getHighPriceFlight();
	public Flight getLowPriceFlight();
	public List<Flight> getFlightBasedOnPrice();
	public List<Flight> searchFlight(String source, String destination);
	public double getTotalPrice();
	public List<String> getAllAirlineNameinUpperCase();
	
}
class FlightImpl implements FlightService
{
 List<Flight> listOfFlights=new ArrayList();
	@Override
	public void addFlight(Flight flight) {
		  listOfFlights.add(flight);
		
	}

	//using stream api
	//non-terminal methods return type is stream
	//terminal -
	@Override
	public Set<Flight> getAllFlights() {
		
Set<Flight> flights	=	listOfFlights.stream().collect(Collectors.toSet());
		
		
		return flights;
	}

	@Override
	public int countFlights() {
		// TODO Auto-generated method stub
		int nof=(int)listOfFlights.stream().count();
		return nof;
	}
//1 3
	//if(1>3
	/*
	 * interface Comparator
	 * {
	 * int compare(Flight obj1,Flight Obj2)
	 * if(obj1>obj2)
	 * {
	 * return 1;
	 * }
	 * return -1;
	 * 
	 * 
	 */
	@Override
	public Flight getHighPriceFlight() {
		// TODO Auto-generated method stub
		Comparator<Flight> cmp=(obj1, obj2)->obj1.getPrice()>obj2.getPrice()?1:-1;
		Flight flight=listOfFlights.stream().max(cmp).get();
		
		
		
		return flight;
	}

	public List<Flight> getListOfFlightsEndWith8() {
		return listOfFlights;
	}

	@Override
	public Flight getLowPriceFlight() {
		// TODO Auto-generated method stub
		//min
		return null;
	}

	@Override
	public List<Flight> getFlightBasedOnPrice() {
		// TODO Auto-generated method stub
		Comparator<Flight> cmp=(obj1, obj2)->obj1.getPrice()>obj2.getPrice()?1:-1;
		
	List<Flight> flights=	listOfFlights.stream().sorted(cmp).collect(Collectors.toList());
		return flights;
	}

	@Override
	public List<Flight> searchFlight(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		
		/*
		 * int sum=0.0;
		 * for(int i=0; i<list.size(); i++)
		 * {
		 * sum=sum+list.price();
		 * }
		 * 
		 * 
		 * 
		 */
	double amt=	listOfFlights.stream().map(flight->flight.getPrice()).reduce(0.0,(sum,price)->sum+price);
		return amt;
	}

	@Override
	public List<String> getAllAirlineNameinUpperCase() {
		// TODO Auto-generated method stub
		return null;
	}
	
}




public class TestStreamDemo1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		FlightService service=new FlightImpl();
		System.out.println("Enter the number of flights");
		int fno=scanner.nextInt();//3
		for(int i=0; i<fno; i++)
		{
			
			System.out.println("Enter flight number");
			int flightNumber=scanner.nextInt();
			System.out.println("Enter flight name");
			String flightName=scanner.next();
			System.out.println("Enter flight source");
		String flightSource=scanner.next();
		System.out.println("Enter flight destination");
		String flightDestination=scanner.next();
			
		System.out.println("Enter flight price");
	double flightPrice=scanner.nextDouble();
	
	Flight flight=
	new Flight(flightNumber, 
			flightName, flightSource, 
			flightDestination, flightPrice);
	
	service.addFlight(flight);
	
	}
	//printing all flights		
service.getAllFlights().forEach(flight->System.out.println(flight));	
System.out.println("***********");
//counting number of flights
 System.out.println(service.countFlights());
 System.out.println("***************");
 //get max price flight
  System.out.println( service.getHighPriceFlight());
  System.out.println("***************");
  
     service.getFlightBasedOnPrice().forEach(f->System.out.println(f));
     System.out.println("***************");
     
     System.out.println("total price amount"+ " "+service.getTotalPrice());
	}

}
