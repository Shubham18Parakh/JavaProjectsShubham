package interfacestudy;

public interface Dad {
	
	void hardwork();
	void honest();
	void proprty();
	default void love () 
	{
		System.out.println("This is fathers love method");
		
	}
	

}
