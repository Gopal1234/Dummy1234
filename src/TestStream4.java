public class TestStream4 {

public static List<String> getBooksBasedId(Map<String, String> book)
{
//I need to fetch from hm
//I need to check if any book starts vwith  978
//m->m.getValu
//into list//
List<String> listOfName= book.entrySet().stream().filter(e->e.getKey().startsWith("978")).map(Map.Entry::getValue).
collect(Collectors.toList());
return listOfName;
}

public static void main(String[] args) {
Map<String, String> book=new HashMap();
book.put("978-122-123", "Java");
book.put("978-122-124", "C");
book.put("345-122-123", "Angular");
book.put("678-122-123", "TypeScript");

getBooksBasedId(book).forEach(System.out::println);
book.entrySet().forEach(entry->System.out.println(entry.getKey() + " "+entry.getValue()));
book.forEach((key,value)->System.out.println(key+ " "+value));







}

}