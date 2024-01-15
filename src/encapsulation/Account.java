package encapsulation;

public class Account {
	//private data members to hide the data
	private long account_number;
	private String Name,Email;
	private  float amount;
	
	//public  getter and setter methods
	public long getaccout_number()
	{
		return account_number;
	}
	public void setaccount_number(long account_number) 
	{
		this.account_number=account_number;
	}
	public String getname() 
	{
		return Name;
	}
	public void setName(String Name) 
	{
		this.Name=Name;
	}
	public String getEmail() 
	{
		return Email;
	}
	public void setEmail(String Email) 
	{
		this.Email=Email;
	}
	
	public float getamount()
	{
		return amount;
	}
	public void setamount(float amount) 
	{
		this.amount=amount;
	}
	
	public static void main(String[] args) {
	
		
		Account acc=new Account();
		acc.setaccount_number(912900000000000l);//setting values to account number
		acc.setName("SHUBHAM_JAIN");
		acc.setEmail("parakhshubham18@gmail.com");
		acc.setamount(500000.00f);
	System.out.println("Account Number= " + acc.getaccout_number());
	System.out.println("Account Holder Name=" + acc.getname());
	System.out.println("Account Holder Email-ID " + acc.getEmail());
	System.out.println("Available Amount " + acc.getamount());

	}

}
