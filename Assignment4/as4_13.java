import java.util.Scanner;
class as4_13
{
public static void main(String args[])
{
int l;
System.out.println("Enter First value");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("Enter Second value");
Scanner sc1=new Scanner(System.in);
int b=sc1.nextInt();
System.out.println("Enter Third value");
Scanner sc2=new Scanner(System.in);
int c=sc2.nextInt();
if((a>b && b>c && c>a))
{
System.out.println("a is greater");
}
else if((b>a) && (b>c))
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}