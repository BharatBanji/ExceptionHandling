package exceptionHandling;

public class ExceptionHandling2 {
	public static void main (String args[]){
		try 
		{ 
		    int x = 0; 
		    int y = 5 / x; 
		    System.out.print(y);
		} 
		catch (Exception e) 
		{
		    System.out.println("Exception"); 
		} 
		System.out.println("finished");

	}

}
