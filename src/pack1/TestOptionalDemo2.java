package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptionalDemo2 {

	public static void main(String[] args) {
		List<String> names=new ArrayList();
		names.add("Mr. abc");
		names.add(null);
		names.add("");
		names.add("Mrs. xyz");
		names.add("Mr. abc");
		int maleCount=0;
		int femaleCount=0;
		for(String name:names)
		{
			Optional<String> opt=Optional.ofNullable(name);
			if(opt.isPresent())
			{
				if(opt.get().startsWith("Mr."))
				{
					maleCount++;
				}else if(opt.get().startsWith("Mrs."))
				{
					femaleCount++;
				}
				System.out.println(name);
			}
			else
			{
			String s=	opt.orElse("XXXXXXX");
			System.out.println(s);
			}
			
			if(opt.isEmpty())
			{
			String s1=	opt.orElseGet(()->  "Hiiii");
			System.out.println(s1);
			}
			
			
		}
		System.out.println("male count:"+ " "+maleCount);
		System.out.println("female count:"+ " "+femaleCount);
		
		
		
		
		
		
		
	}

}
