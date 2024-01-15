package interfacestudy;

public class Demo implements Father,Mother
{

	public static void main(String[] args) {
		 
		Demo d=new Demo();
		d.kindness();
	    d.respect();
	    d.care();
	    d.hardwork();
	    d.House();
	    d.inteligence();
	    d.anger();
	    Father.property();

	}

	@Override
	public void kindness() {
		System.out.println("Kindness Method from Mother");
		
	}

	@Override
	public void care() {
		System.out.println("Care method from mother");
		
	}

	@Override
	public void respect() {
		System.out.println("respect method from mother");
		
	}

	@Override
	public void hardwork() {
		System.out.println("hardwork method from father");
		
	}

	@Override
	public void inteligence() {
		System.out.println("inteligence method from father");
		
	}

	@Override
	public void House() {
	System.out.println("house method from father");
		
	}

	@Override
	public void anger() {
	
		Father.super.anger();
		Mother.super.anger();
	}
	static void property() {
		
	}

}
