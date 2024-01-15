package encapsulation;

public class Demo {

	public static void main(String[] args) {
		
	Demo d=new Demo();
	d.setName("Amit");
	d.setAge(18);
	System.out.println("Name " + d.getName());
	System.out.println("age " + d.getAge());
	
	}
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) 
	{
		this.name=name;
		
	}
	
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) 
	{
		this.age=age;
	}

}
