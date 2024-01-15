package interfacestudy;

public interface Mom {

	  static void trust() 
	    {
			System.out.println("This is the trust Method static ");
		}
	
	
	void look();
	void nature();
	void recipe();
	default void love () {
		System.out.println("This is love method of mother");
		
	}
}
