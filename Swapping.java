//Write a Java program to swap two numbers by using the third variable
import java.util.*;
class Swapping
{
 public static void swap(int num1,int num2)
 {  
    System.out.println("before swap ");
	display(num1,num2);
	 int temp;
	 temp=num1;
	 num1=num2;
	 num2=temp;
	 System.out.println("After swap ");
	 display(num1,num2);
	 
 }
 
 public static void display(int num1,int num2)
 {
	 System.out.println("Number 1 : "+num1);
	 System.out.println("Number 2 : "+num2);
 }
  public static void main(String arg[])
  {
	Scanner sc = new Scanner(System.in);
	 int num1= sc.nextInt();
     int num2 = sc.nextInt();
	swap(num1,num2);
	
	
  }
  
}