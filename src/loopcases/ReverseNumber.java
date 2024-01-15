package loopcases;

public class ReverseNumber {

	public static void main(String[] args) {
	//intiallization part
		int number =12345,reverse=0;//You can use any number and reverse it by using this concept
		
		while(number!=0) //condition part
		{
			int reminder =number%10;     //updation part here
			reverse=reverse*10+reminder;
			number=number/10;
			
			}
		System.out.println("the reverse of the given number is " + reverse);

	}

}
