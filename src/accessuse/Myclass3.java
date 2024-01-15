package accessuse;

import accesefiernew.Myclass1;

public class Myclass3 extends Myclass1 {

	public static void main(String[] args) {
	
		Myclass1 m1=new Myclass1();
		//m1.demo1()
		//m1.demo2();
		Myclass3 m3 =new Myclass3();
		m3.demo3();//demo3 is protected method can be accsssed within same package to call it in another package we need to create subclass obj
		m1.demo4();//calling public method can be accessed in all 
		
		

	}

}
