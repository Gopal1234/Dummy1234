package FunctionalProgramming;
/*
 * What is enum?
 * Enum is set of constants
 * 
 * 
 * 
 */
enum UserStatus123
{
	ACTIVATE,DEACTIVATE,REMOVED;
	
}



public class MyUser {
	
private int userId;
private String userName;
private String userPassword;
private UserStatus123 status;
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
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public UserStatus123 getStatus() {
	return status;
}
public void setStatus(UserStatus123 status) {
	this.status = status;
}




}
