package FunctionalProgramming;
//accessing interface using annonymous object
@FunctionalInterface
interface LoginService
{
	
	boolean getLogin(String userName, String password);
	default void display(String msg)
	{
		System.out.println(msg);
	}
}




public class TestLambdaDemo1 {

	public static void main(String[] args) {
		
		LoginService service=(input1, input2)->
		{
			if(input1.equals("admin")&& input2.equals("admin123"))
		{
			return true;
		}
	return false;
		}; //end of lambda expression
	if(	service.getLogin("admin", "admin123"))
	{
		System.out.println("success");
	}
 
	service.display("Good morning");
	}

}


