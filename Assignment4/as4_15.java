import java.util.Scanner;
class as4_15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char f,m;
int age;
System.out.println("Enter gender");
char ch=sc.next().charAt(0);
System.out.println("Enter age");
age=sc.nextInt();
if((ch=='f') && (age>18))
{
System.out.println("She is eligible for marriage");
}
else if((ch=='m') && (age>21))
{
System.out.println("He is eligible for marriage");
}
else
{
System.out.println("Not eligible for marriage");
}
}
}