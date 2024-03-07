package program;


import java.util.*;

public class Atm {
	
	public static void main(String[] args) throws InvalidInputException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to SBI ATM...");
		int choice;
		
		Welcome a=new Welcome();
		 int continueChoice =0;
	
		do {
			
			System.out.println("Enter a number for action:");
			choice = sc.nextInt();
		try {	
		switch(choice)
		{
		case 1:
			System.out.println("You have chosen option for withdraw");
			System.out.println("Enter your amount for withdraw:");
			double depositamount=sc.nextDouble();
			if(depositamount>0) {
			a.withdraw(depositamount);
			}
			else {
				System.out.println("please enter correct input");
			}
			break;
		case 2:
			System.out.println("You have chosen option for deposit");
			a.deposit();
			break;
		case 3:
			System.out.println("You have chosen option for balance");
		
			a.balance();
			 break;
		 default:
             throw new InvalidInputException();
             
		}
		}
		catch(InvalidInputException i) {
			i.getmessage();
		}
			 
				 System.out.println("Do you want to continue?");
	             System.out.println("1. Yes\t2. No");
	              continueChoice = sc.nextInt();

	             if (continueChoice == 2) {
	                 exit();
	                 break;
	             }
		}while(continueChoice==1);
	
	}	


	private static void exit() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using the ATM. ");
		
	}

}



































