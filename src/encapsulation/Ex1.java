package encapsulation;

public class Ex1 {
	
	int student_id;
	String name;
	
	public int getstudent_id()
	{
		return student_id;
		
	}
	
	public void setstudent_id(int student_id)
	{
		this.student_id=student_id;
	}
	public String getname() 
	{
		return name;	
	}
	public void setname(String name)
	{
		this.name=name;
	}
	
	public static void main(String[] args) {
Ex1 ex= new Ex1();
ex.setname("Virat");
ex.setstudent_id(123);
System.out.println("Player name is " + ex.getname());
System.out.println("student id is " + ex.getstudent_id());


	}
}
