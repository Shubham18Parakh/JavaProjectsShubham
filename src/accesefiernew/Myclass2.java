package accesefiernew;

public class Myclass2 {

	public static void main(String[] args) {
		
		Myclass1 m1=new Myclass1();//creating object another class -------->Myclass1
	//	m1.demo1(); priavte method not visible in another class
		m1.demo2();//calling default method from another class
		m1.demo3();//calling protected method from another class
		m1.demo4();//calling public method from another class 
		
		System.out.println("---------------------------");
		//System.out.println(m1.a);//variable is private can be aacesed within same class only we cant call here
		System.out.println(m1.b);//calling default variable from another class
		System.out.println(m1.c);//calling protected variable from another class
		System.out.println(m1.d);//calling public variable from another class


	}

}
