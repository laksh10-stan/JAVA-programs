
public class Try_Catch {
	public static void main(String args[] )
	{
		try {
			int a=12/0;
		}catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		
		try {
			String str=null;
			System.out.println(str.length());
		}catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This part lies in finally");
		}
	}

}
