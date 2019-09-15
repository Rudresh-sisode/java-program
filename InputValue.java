import java.util.Scanner;
public class InputValue
{
	public static void main(String[] arvs)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("please enter one number");
		int a=input.nextInt();
		System.out.print("your value is "+a);
	}
}