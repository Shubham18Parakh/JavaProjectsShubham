package accesifier;

public class PubAcce2 {

	public static void main(String[] args) {
		
PubAcce1 p1 =new PubAcce1();//create object another class(pubacce)
  //p1.test1(); private method visible within class only we cant call
p1.test2();//calling default method from another class 
p1.test3();//calling protected method from another class visible within same package only
p1.test4();//calling public method from anoher class

//System.out.println(p1.a);  varible is private can be accesed within same class only we cant call here
System.out.println(p1.b);//calling default variable from another class
System.out.println(p1.c);//calling protected variable from anorher class
System.out.println(p1.d);//calling public variable outside the class



	}

}
