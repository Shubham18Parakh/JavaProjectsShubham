package methods;

public class MethodUse2 {
	
public void p()
{
	System.out.println(" p is non static method without parameter ");
}
public void q(char gender,float height)
{
	System.out.println("q is non static method with parameter");
	System.out.println("my gender is "+ gender);
	System.out.println("my height is " + height);
}
public static void r()
{
	System.out.println("r is static method without parameter");
	
}
public static void s(int a ,int b)
{
	int sub = a-b;
	System.out.println("s is static with parameter ");
	System.out.println("substraction of a-b= " + sub);
}
}
