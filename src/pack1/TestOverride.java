package pack1;



class A1
{
	int k1;
	
	static void display()
	{
		System.out.println("welcome to cyber success");
	}
}
class A2 extends A1
{
	static void display()
	{
		System.out.println("welcome to IBM");
	}
}
public class TestOverride {

	public static void main(String[] args) {

		System.out.println(new A1().k1);
		 int k=70;
		 System.out.println(k);
     A1 parent;
     parent=new A2();
     parent.display();

	}

}
