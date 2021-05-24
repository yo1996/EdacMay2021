import java.util.Scanner;
class as4_8
{
public static void main(String args[])
{
int si;
System.out.println("Enter principal amount");
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
System.out.println("Enter Rate");
Scanner sc1=new Scanner(System.in);
int r=sc1.nextInt();
System.out.println("Enter Time");
Scanner sc2=new Scanner(System.in);
int n=sc2.nextInt();
si=(p*r*n)/100;
System.out.println("Simple Interest is :"+si);
}
}