package inharitence;

public class Daughter extends Mother
{
	public void mobile() 
	{
		System.out.println("daughters mobile");
	}
	public static void cash()
	{
		System.out.println("daughters cash");
	}

	public static void main(String[] args) {
		Daughter d= new Daughter();
		d.money();
		d.home();
		d.mobile();
		d.cash();
	
	}

}
