import java.util.Scanner;
class as4_10
{
public static void main(String args[])
{
double ,c;
System.out.println("Enter temperature in Fahrenheit");
Scanner sc=new Scanner(System.in);
double f=sc.nextInt();
System.out.println("Fahrenheit to Celsius Conversion");
c=(5*(f-32)/9) ;
System.out.println("Fahrenheit to Celsius Conversion is :" +c);
}
}