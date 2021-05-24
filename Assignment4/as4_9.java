import java.util.Scanner;
class as4_9
{
public static void main(String args[])
{
int year,month,days;
System.out.println("Enter total days");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
year=(a/365);
month=((a%365)/12);
days=((a%365)%12);
System.out.println("Year"+year);
System.out.println("Month"+month);
System.out.println("days"+days);
}
}

