class as4_3
{
public static void main(String args[])
{

int x=10;
int y=20;
int z;
boolean a,b,c;
a=true;
b=true;
y=((x*x)+(3*x)-7);
System.out.println(y);

y=((x++)+(++x));
System.out.println(x+" " +y);

z=((x++)-(--y)-(--x)+(x++));
System.out.println(x+ " "+y+" "+z);

c=((a && b) || ! (a || b));
System.out.println(a+" "+b+" "+c);
}
}