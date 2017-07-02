package sample;

public class Exception1 {

	public static void main(String[] args) {
		
		try 
		{
			System.out.println(100/0);
		} 
		catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
			System.out.println("done");
		}
		
	}

}
