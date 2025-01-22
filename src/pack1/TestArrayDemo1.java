package pack1;

public class TestArrayDemo1 {

	public static void main(String[] args) {
    int a[]= {10,23,24,28,30};
    
   /* for(int i=0; i<a.length; i++)
    {
    	if(i%2==0)
    	{
    		System.out.println(a[i]);
    		
    	}
    	else
    	{
    		System.out.println(a[i]);
    	}
    }*/
  /*int[] b=new int[4];
// copy array
    for(int i=2,j=0; i<a.length; i++,j++)
    {
    b[j]=a[i];
    System.out.println(b[j]);
    }*/
    //fill with 0
   for(int i=0; i<a.length; i++)

	{
	   if(a[i]%2==0)
	   {
		   a[i]=0;
	   }
	   }
	
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	}

}
