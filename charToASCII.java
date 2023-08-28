//Write a Java program to print the ASCII value of a given character.
import java.util.*;
class charToASCII
{
	public static void main(String arg [])
	{
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter a Charecter");
     char ch=sc.next().charAt(0);

     System.out.println((int)ch);	 
		
	}


}