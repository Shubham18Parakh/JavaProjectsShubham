package interfacestudy;

public class Son implements Mom,Dad
{

	public static void main(String[] args) {
		
		
		Son s=new Son();
		s.hardwork();
		s.honest();
		s.proprty();
	    s.look();
        s.nature();
	    s.recipe();
	    s.love();
	    Mom.trust();
	}

	@Override
	public void hardwork() {
		
		System.out.println("This is fathers method hardwork implemented in sons class");
		
	}

	@Override
	public void honest() {
		System.out.println("This is fathers method honest implemented in sons class");
		
	}

	@Override
	public void proprty() {
	System.out.println("This is fathers method property implemented in sons class");
		
	}

	@Override
	public void look() {
		System.out.println("This is mother look method implemented in sons class");
		
	}

	@Override
	public void nature() {
	System.out.println("This is mother nature method implemented in sons class");
		
	}

	@Override
	public void recipe() {
		System.out.println("This is mother recipe method implemented in sons class");
		
	}

	@Override
	public void love() {
	
		Mom.super.love();
		Dad.super.love();
	}
	
	static void trust() {
		
	}

}
