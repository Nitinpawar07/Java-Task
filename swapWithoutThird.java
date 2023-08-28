//Write a Java program to swap two numbers without using the third variable

class swapWithoutThird
{
 public static void main(String arg [])
 {
	 int x=10,y=20;
	 
	 System.out.println("before swapping " +x+" " +y);
	 
	 x=x+y;
	 y=x-y;
	 x=x-y;
	 System.out.println("after swapping " +x+" " +y);
	 
 }
  
}