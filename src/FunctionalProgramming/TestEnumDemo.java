package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

enum UserStatus
{
ACTIVATE, DEACTIVATE, REMOVED;

}
class User
{
private int userId;
private String userName;
private long userPhone;
//ACTIVATE, DEACTIVATE, REMOVED
private UserStatus status;
public int getUserId() {
return userId;
}
public void setUserId(int userId) {
this.userId = userId;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
public long getUserPhone() {
return userPhone;
}
public void setUserPhone(long userPhone) {
this.userPhone = userPhone;
}
public UserStatus getStatus() {
return status;
}
public void setStatus(UserStatus status) {
this.status = status;
}

}


public class TestEnumDemo {

public static void main(String[] args) {

  MyUser user=new MyUser();
  Scanner scanner=new Scanner(System.in);
  System.out.println("Enter user is");
  int id=Integer.parseInt(scanner.nextLine());
  System.out.println("Enter user name");
  String uname=scanner.nextLine();
  System.out.println("Enter user phone number");
  long ph=Long.parseLong(scanner.nextLine());
  System.out.println("Enter your satus ---ACTIVATE/DEACTIVATE/REMOVED");
  String status=scanner.nextLine();
  //valueOf(String str)--enum
  user.setStatus(UserStatus.valueOf(status));
  user.setUserId(id);
  user.setUserName(uname);
  user.setUserPhone(ph);
 
  //{1,2,3}--ordinal()--int
  //enum.name()--String
  //System.out.println(user.getUserId() + " "+user.getUserName()+ " "+user.getStatus().ordinal());
  System.out.println(user.getUserId() + " "+user.getUserName()+ " "+user.getStatus().name());
 
  UserStatus[] u=UserStatus.values();
  System.out.println(Arrays.toString(u));
 




}

}