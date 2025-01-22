package FunctionalProgramming;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {

   MyUser user=new MyUser();
   Scanner scanner=new Scanner(System.in);
	System.out.println("Enter user id");
	int id=scanner.nextInt();
	System.out.println("Enter user name");
	String name=scanner.next();
	System.out.println("Enter user password");
	String password=scanner.next();
	System.out.println("Enter user status ACTIVATE?DEACTIVATE/REMOVED");
		String st=scanner.next();
		int a=10;
		
		//I am convetirng string into enum type
	UserStatus123 status=	   UserStatus123.valueOf(st);
		user.setUserId(id);
		user.setUserName(name);
		user.setUserPassword(password);
		user.setStatus(status);
		
		int id1=user.getUserId();
		String name1=user.getUserName();
		String password1=user.getUserPassword();
		UserStatus123 s=user.getStatus();
		
		System.out.println(id1+ " "+name1+ " "+password1+ " "+s);
		
UserStatus123[] u=		  UserStatus123.values();
		for(int i=0; i<u.length;i++)
		{
			UserStatus123 us=u[i];
			System.out.println(us.ordinal() +" -->"+us.name());
		
		}
		
		
		
		
		
		
		
		
		
		

	}

}
