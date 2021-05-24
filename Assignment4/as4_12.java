import java.util.Scanner;
class as4_12
{
public static void main(String args[])
{
float bs,gs;
float hra=0,da=0;
System.out.println("Enter basic salary");
Scanner sc=new Scanner(System.in);
bs=sc.nextInt();
if (bs<10000)
{
hra=(bs*10)/100;
da=(bs*90)/100;
}
else if(bs >= 10000)
{
hra=2000;
da=(bs*98)/100;
}
gs=bs+hra+da;
System.out.println("Gross salary ="+gs);
}
}

