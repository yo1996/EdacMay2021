import java.util.Scanner;
class as4_7
{
public static void main(String args[])
{
int Total;

System.out.println("Enter marks of marathi");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

System.out.println("Enter Marks of English");
Scanner sc1=new Scanner(System.in);
int b=sc1.nextInt();

System.out.println("Enter marks of Hindi ");
Scanner sc2=new Scanner(System.in);
int c=sc2.nextInt();

System.out.println("Enter marks of History");
Scanner sc3=new Scanner(System.in);
int d=sc2.nextInt();

System.out.println("Enter marks of maths");
Scanner sc4=new Scanner(System.in);
int e=sc2.nextInt();

Total=(a+b+c+d+e);
System.out.println("Sum = "+Total);

double per=(Total / 500)*100;
System.out.println("Percentage = "+per+"%");
}
}