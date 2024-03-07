package program;

import java.util.Scanner;

public class Welcome {
	public double depositamount;
	public  double dropout=0;

	Scanner a=new Scanner(System.in);
	public void  deposit()  {
		System.out.println("Enter your amount for deposit:");
		depositamount=a.nextDouble();
		System.out.println("Your amount is deposited. Your current balance is :"+(depositamount));
		
	}

	public   void  balance() {

		System.out.println("Your current balance is "+(depositamount-dropout));
		
	}

	public void withdraw(double dropout)  {
		
if(dropout<0 || dropout<=depositamount ) {
		System.out.println("you have successfully withdraw.your current amount is:"+(depositamount-dropout));
		
	}
	else {
		System.out.println("Insufficient Fund. Your current balance is "+depositamount);
	}
		
		
	}

}
