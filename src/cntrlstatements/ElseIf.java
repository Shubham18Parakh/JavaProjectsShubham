package cntrlstatements;

public class ElseIf {

	public static void main(String[] args) {
		//imagine if marks is 600 write a program for scholarship
		//if your marks are greater then equal to 540 then you will get 100% scholarship
		//else if your marks are greater then equal to 480 then you will get 60% scholarship
         // else if your marks are greater then equal to 420 then you will get 60% scholarship
		//else if your marks are greater then 360 then you will get 40% scholarship
		//esle your marks are less then equal to 360 then you will not get scholarship
		
		
		int marks =550;
		
		if (marks>=540 && marks<=600) 
		{
			System.out.println("congratulation you are eligible for 100% scholarship");
		}
		else if (marks>=480 && marks <=540)
		{
			System.out.println("congratulations you are eligible for 60% scholarship");
		}
		else if ( marks >=360 && marks <=420) {
			System.out.println("congratulation for 40% scholarship");
		}
		else {
			System.out.println("we are sorry for you you are not eligible for scholarship");
		}
	}

}
