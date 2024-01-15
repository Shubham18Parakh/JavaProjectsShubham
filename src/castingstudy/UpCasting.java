package castingstudy;

public class UpCasting {

	public static void main(String[] args) {
		Fathers f= new Fathers();
		Sons s = new Sons();
		
		f.bike();  //pulser
		f.car();   //bmw
		System.out.println("==========");
		s.bike(); //aapache
		s.car();  // thar
		s.laptop();// mac laptop
		System.out.println("===========");
		
		Fathers f1=new Sons(); //creating obj of subclass and giving refrence of superclass
         f1.bike();
         f1.car();
         System.out.println("==========");
         //f1.laptop dont have suggesions for laptop because because only common things can be called.

       
	}

}
