

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
class InvalidIdException extends Exception
{
	public InvalidIdException(String msg)
	{
		super(msg);
	}
}
class Employee
{
	int empId;
	String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
	
	
}

public class TestOptionalDemo3 {

	public static void main(String[] args) throws InvalidIdException {

  List<Employee> listOfEmp=new ArrayList();
  listOfEmp.add(null);
  listOfEmp.add(new Employee(10, "ABC"));
  listOfEmp.add(new Employee(100, "XYZ"));
  
  Optional<Employee>  optionalObj;
  for(Employee e:listOfEmp)
  {
	
	optionalObj=Optional.ofNullable(e);
	  System.out.println(optionalObj.isPresent());
	 Employee e1 =optionalObj.orElse(new Employee(000, "XXX"));
	System.out.println(e1.getEmpId() + " "+e1.getEmpName());
  }
  
  
  List<Employee> listOfEmp1=new ArrayList();
  listOfEmp1.add(new Employee(1, "xssds"));
  listOfEmp1.add(new Employee(10, "ABC"));
  listOfEmp1.add(null);
  listOfEmp1.removeIf(p->p.empName.startsWith("A"));
  System.out.println("Enter the id to search");
  int id=11;
  for(Employee e:listOfEmp1)
  {
	  Optional<Employee> op=Optional.ofNullable(e);
	  if(op.isPresent())
	  {
		//System.out.println("Hi");  
	  if(op.get().getEmpId()==id)
	  {
		 
		 System.out.println(op.get());
	  }
	  }
	  else 
	  {
		 // System.out.println("hello");
		 op.orElseThrow(()->new InvalidIdException("Invalid id"));
	  }
	  
  }
  
  
  
  
  
  

	}

}
