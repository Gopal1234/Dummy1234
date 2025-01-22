package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	
	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
class StudentBO
{
	List<Student> student;
	//non static method
	public void setMarks(List<Student> student)
	{
		this.student=student;
	}
	public List<Student> getMarks()
	{
		return student;
	}
	
	public List<Student> sortMarks()
	{
		//sort() method of collection uses Comparable interface
		//Comparable interface having one method called int compareTo(Object obj)
		//compareTo() compares both obejct based on invoking object and parameterized object
		//All wrapper classes like Integer, Float, Double, Long e.tc implements Comparable interface
		//String class also implements Comparable
		//Collections.sort(student);
		return student;
	}
	
	public int searchMarks(int mark)
	{
		if(student.contains(mark))
		{
			return mark;
		}
		return 0;
	}
	
	public List<Student> updateMarks(int newMarks)
	{
		
	//	student.set(1, newMarks);
		return student;
		
	}
	
	
}


public class TestLiseDemo1 {
public static void main(String[] args) {
	List<Student> listOfMarks=new ArrayList();
	listOfMarks.add(new Student(1, "B", 90));
	listOfMarks.add(new Student(10, "A", 99));
	listOfMarks.add(new Student(3, "X", 19));
	
	StudentBO stu=new StudentBO();
	stu.setMarks(listOfMarks);
	
	List<Student> fetchMarks=	 stu.getMarks();
	/*for(int i=0; i<fetchMarks.size(); i++)
	{
		// get(int index)---Object
		System.out.println(fetchMarks.get(i));
	}*/
	/*for(int num:fetchMarks)
	{
		System.out.println(num);
	}*/
	/*Iterator<Integer> itr=fetchMarks.iterator();
	while(itr.hasNext())
	{
	int n=itr.next();
	System.out.println(n);
	}*/
	
	fetchMarks.forEach(n->System.out.println(n.rollNo + " "+n.name+ " "+n.marks));
	
	/*System.out.println("***********");
	List<Integer> sortedMarks=  stu.sortMarks();
	sortedMarks.forEach(n->System.out.println(n));
	 int searchedMarks=stu.searchMarks(30);
	 System.out.println("***********");
	 System.out.println(searchedMarks);
	 System.out.println("***********");
	 stu.updateMarks(450).forEach(n->System.out.println(n));;*/
}
}
