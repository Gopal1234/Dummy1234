package FunctionalProgramming;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;

public class TestMapWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, String> students=new LinkedHashMap<Integer, String>();

students.put(1, "A");
students.put(5, "A");
students.put(6, "C");
students.put(2, "X");
students.put(8, "A");
students.put(9, "E");

/*Set<Integer> setOfKey=students.keySet();
 Iterator<Integer> itr= setOfKey.iterator();
 while(itr.hasNext())
 {
	int key= itr.next();
	System.out.println(key + " "+students.get(key));
 }*/


  /* Set<Entry<Integer, String>> entry=students.entrySet();
   
   for(Map.Entry<Integer, String> me:entry)
   {
	   System.out.println(me.getKey() + " "+me.getValue());
   }*/
  //filter(Predicate p)
students.entrySet().
   stream().filter(me->me.getValue().equals("A")).
   forEach(me->System.out.println(me.getKey() + " "+me.getValue()));
   
	}

}
