import java.util.Scanner;
class as4_11
{
public static void main(String args[])
{
System.out.println("Enter 2 number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("before swapping number are :"+a+" "+b);
a=(a+b);
b=(a-b);
a=(a-b);
System.out.println("after swapping number are :"+a+" "+b);
}
}