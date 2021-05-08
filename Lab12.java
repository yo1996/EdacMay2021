import java.util.Scanner;
class Lab12
{
 public static void main(String args[])
{
 System.out.println("enter 3 number");
 Scanner sc= new Scanner(System.in);
 int i=sc.nextInt();
 int j=sc.nextInt();
 int k=sc.nextInt();
 double avg=(i+j+k)/3;
 System.out.println("Average"+avg);
 }
}