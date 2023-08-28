//Write a Java program to print the sum (addition), multiply, subtract, divide, and remainder of two numbers.

import java.util.*;

class ArithmaticOperation
{
 int add(int num1,int num2)
 {
   return num1 + num2;
 }
 
 int mul(int num1,int num2)
 {
   return num1 * num2 ;
 }
 
 int sub(int num1 , int num2)
 {
    return num1- num2;
  }
 
 int remainder(int num1, int num2)
 {
   return num1 % num2 ;
 }
 
 double div(int num1, int num2)
 {
   return num1/num2 ;
 }
 
 public static void main(String arg [])
 {
     ArithmaticOperation operation =new ArithmaticOperation();
	 Scanner input=new Scanner(System.in);
	 
	 System.out.println("Addition : "+operation.add(input.nextInt(),input.nextInt()));
	 System.out.println("multiplication : "+operation.mul(input.nextInt(),input.nextInt()));
	 System.out.println("subtraction : "+operation.sub(input.nextInt(),input.nextInt()));
	 System.out.println("division : "+operation.div(input.nextInt(),input.nextInt()));
	 System.out.println("remainder : "+operation.remainder(input.nextInt(),input.nextInt()));
	
 }

}