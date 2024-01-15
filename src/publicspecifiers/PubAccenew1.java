package publicspecifiers;


import accesifier.PubAcce1;

public class PubAccenew1 extends PubAcce1 {

	public static void main(String[] args)
	{
	
  PubAcce1 p1=new PubAcce1();
 
  
  
 // p1.test1();//test1 is private can be accesed within same class only we cant call here
  // p1.test2();//test2 is default method that can be called within same package not in another package
  //p1.test3();//test3 is a protected method can be access within same  package to call in another package we need inheritence
  
  //to access protected variable do inheritence first and then create object of sub class
 p1.test4();//calling public  method from another package
 
 PubAccenew1 p=new PubAccenew1();
p.test3();//test3 is a protected method can be access within same  package to call in another package we need inheritence
p.test4();//public method can be accessed in all
 
	}

}
