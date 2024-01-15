package methods;

public class CricketTeam {

	public static void main(String[] args) {
		
      //className objectName=newClassName();
		CricketTeam paytmseries = new CricketTeam();
		paytmseries.australian();
		paytmseries.indian();
	}
	public void australian()
	{
		String Captain_Name;
		Captain_Name= "Ponting";
		System.out.println("#Big Breaking News Coming From ACB#");
	  System.out.println("Newly Appointed Captain of Australian team is " + Captain_Name); 
	}
	public void indian()
	{
		String Captain_Name;
		Captain_Name="Dhoni";
		System.out.println("#New Update From BCCI#");
		System.out.println("Newly Appointed Captain of Indian team is " + Captain_Name);
	}

}
