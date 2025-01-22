import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {

 List<Integer> marks=new ArrayList();
 marks.add(10);
 marks.add(40);
 marks.add(30);
 marks.add(31);
 marks.add(56);
 //to give grace marks for the student who got >=30 and <35
 //iterate
 //check condition
 //give +5
 
 //filer(Predicate p)
 //boolean test(T t)
 //map(Function function)
 //stream() is used to create an stream on any data source
 marks.stream().
filter((m)-> m>=30 && m<35).map(m->m+5).
forEach(x->System.out.println(x));
//forEach(Consumer consumer)
//stream.forEach(x->System.out.println(x));
 List<String> members=Arrays.asList
		 (new String[]{"ABCD","ABA","TAPAT","SUCCESS"});
Predicate<String> p=x-> x.charAt(0)==x.charAt(x.length()-1);
 members.stream().
 filter(p).
 map(x->x).
 forEach(x->System.out.println(x));
 
 
 
 
 
 
 
 
 
 
 
 
 
 
		
		
		
		
		
		
	}

}
