

import java.util.Optional;

public class TestOptionalDemo2 {

	public static void main(String[] args) {

  Optional<String> obj1=Optional.of("Capgemini");
  String obj2="IBM";
  String obj3=null;
  System.out.println("non-empty optional"+ " "+obj1);
  System.out.println("non-empty optional value"+ " "+obj1.get());
  System.out.println("empty optional "+ " "+Optional.empty());
  System.out.println("of Nullable on non empty optional "+ " "+Optional.ofNullable(obj2));
  System.out.println("of Nullable on  empty optional "+ " "+Optional.ofNullable(obj3));
  System.out.println("of  on  empty optional "+ " "+Optional.of(obj3));	
		
		

	}

}
