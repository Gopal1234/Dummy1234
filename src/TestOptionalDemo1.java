

import java.util.Optional;

/*
 * 
 * 
 * 
 * 
 * 1.Optional is class which introduced in java 8
 * 2. java.util.package holds the Optional class
 * 3.It is used to represent whether the value is present or absent
 * 4.It avoids any runtime NullPointerException 
 * 5.In real time when we are fetching data from database,
 * there may be a situation where null values or empty valuescan be present
 * so by using optinal we can check and verify our object
 * 
 * 
 */


public class TestOptionalDemo1 {

	public static void main(String[] args) {
		Integer value1=null;
		Integer value2=100;
		
		Optional<Integer> optionalObj=Optional.empty();
		System.out.println(optionalObj);
		//System.out.println(optionalObj.isEmpty());
	
		
		//incase of ofNullable() method if the value will 
		//not null is describe non-null value
		//otherwise it create empty optional object
		Optional<Integer> num1=Optional.ofNullable(value1);
		System.out.println(num1);//Optional[Value]
		//incase of ofNullable() method if the value will not null is describe non-null value
				//otherwise it throws null pointer exception
		Optional<Integer> num2=Optional.of(value2);
		///Optional[Value]
		System.out.println(num2);
   System.out.println( multiply(num1,num2));
	}

	private static int  multiply
	(Optional<Integer> num1, Optional<Integer> num2) {

System.out.println("First number is present" + " "+num1.isPresent());
System.out.println("First number is present" + " "+num2.isPresent());
System.out.println("Empty optinal" + " "+num1.isEmpty());
int x=num1.orElse(20);
int y=num2.get();
return x*y;

		
	}

}
