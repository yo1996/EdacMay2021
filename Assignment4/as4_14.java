import java.util.Scanner;
class as4_14
{
public static void main(String args[])
{
System.out.println("Enter Year");
Scanner sc=new Scanner(System.in);
int y=sc.nextInt();
if(y%4==0)
{
System.out.println("Leap year");
}
else
{
System.out.println("Not leap year");
}
}
}