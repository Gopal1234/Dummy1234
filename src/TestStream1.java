import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream1 {

	public static void main(String[] args) {
		List<String> listOfEmployee=new ArrayList();
		listOfEmployee.add("Amit");
		listOfEmployee.add("Ankit");
		listOfEmployee.add("Amitabh");
		listOfEmployee.add("Rajib");
		listOfEmployee.add("sourav");
		listOfEmployee.add("Sumit");
		listOfEmployee.add("Saroj");
		//converting all names from name in upper case
		listOfEmployee.stream()
		.map(x->x.toUpperCase()).
		collect(Collectors.toSet()).
		forEach(name->System.out.print( name+ ","));
		
		//fetch element from integer data and multiply each element with two
		List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); 
		

	}

}
