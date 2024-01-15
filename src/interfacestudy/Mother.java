package interfacestudy;

public interface Mother {
	
	
	void kindness();
	void care();
	void respect();
    default void anger() {
    	System.out.println("this is default method of mother");
    	
    }
}
