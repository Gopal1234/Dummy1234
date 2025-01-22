import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
class EmptyInputException extends Exception
{
	public EmptyInputException(String errorMsg) {
		super(errorMsg);
	}
}

public class TestOptional1 {

	public static void main(String[] args) throws EmptyInputException {
	 List<String> names=new ArrayList();
	 names.add("Mr. Ram");
	 names.add(null);
	 names.add("");
	 names.add("Mrs. abc");
	 names.add("Mr. xyz");
	 int maleCount=0;
	 int femaleCount=0;
	 for(String name:names)
	 {
		Optional<String> n=Optional.ofNullable(name);
	
	if(n.isPresent())
	{
		if(n.get().startsWith("Mr."))
		{
			maleCount++;
		}else if(n.get().startsWith("Mrs."))
		{
			femaleCount++;
		}
		System.out.println(name);
	}
	
		else
		{
		String s=	n.orElse("XXXXXXXX");
		System.out.println(s);
		}
		
		if(n.isEmpty())
		{
			//n.orElseThrow(()->new EmptyInputException("blank input error"));
		String s2=	n.orElseGet(()->"hiii...");
		System.out.println(s2);
		}
		
	 }
	 
	 
	
	 System.out.println("male count is"+ " "+maleCount);
	 System.out.println("female count is"+ " "+femaleCount);
	 
	 
	 
	 
	 

	}

}
