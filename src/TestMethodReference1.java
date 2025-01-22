interface LoginService
{
	boolean authenticate(String userName, String password);
}
class ServiceImpl
{
	public static boolean doLogin(String uname, String pwd)
	{
		//if(uname==12 && pwd.equals("admin@123"))
			
	if(uname.equalsIgnoreCase("admin") && pwd.equals("admin@123"))
{
	return true;
}
		return false;
	}
}
public class TestMethodReference1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginService service=ServiceImpl::doLogin;
		if(service.authenticate("admin", "admin@123"))
		{
			System.out.println("valid login");
		}else
		{
			System.out.println("Invalid login");
		}

	}

}
