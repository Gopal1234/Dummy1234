package pack1;

public class TestLoop4 {

 int n, m, a, i = 1, counter = 0;
Scanner s=new Scanner(System.in);
System.out.print("Enter any number:");
n = s.nextInt();
m = n;
while(n > 0)
{
    n = n / 10;
    counter++;
}
while(m > 0)
{
    a = m % 10;
    System.out.println("Digits at position "+counter+":"+a);
    m = m / 10;
    counter--;
}
