import java.util.Scanner;
class as4_6
{
public static void main(String args[])
{
double area,c;
System.out.println("Enter radious");
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
area=(3.14*r*r);
c=(2*3.14*r);
System.out.println("Area is :" +area);
System.out.println("Circumference is :" +c);
}
}