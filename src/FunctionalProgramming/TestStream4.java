package FunctionalProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStream4 {

public static List<String> getBooksBasedId(Map<String, String> book)
{

List<String> listOfName= 
book.entrySet().stream().
filter(e->e.getKey().startsWith("978")).
map(me->me.getValue()).
collect(Collectors.toList());
return listOfName;
}

public static void main(String[] args) {
Map<String, String> book=new HashMap();
book.put("978-122-123", "Java");
book.put("978-122-124", "C");
book.put("345-122-123", "Angular");
book.put("678-122-123", "TypeScript");

getBooksBasedId(book).forEach(name->System.out.println(name));






}

}