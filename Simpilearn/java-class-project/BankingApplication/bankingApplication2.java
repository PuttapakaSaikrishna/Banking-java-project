package BankingApplication;

import java.util.Scanner;

class bankdetails{
	private String name;
	private String accno;
	private String acc_type;
	private long balance;
	Scanner sc = new Scanner(System.in);
	
	//	To open new account
	
	public void Openaccount() 
	{	
		System.out.print("   Enter name :  ");
		name = sc.next();
		System.out.print("   Enter Account No : ");
		accno = sc.next();
		System.out.print("   Enter Account type :  ");
		acc_type =sc.next();
		System.out.print("   Enter balance : ");
		balance = sc.nextLong();
		
	}
	
	//	To show you account
	public void Showaccount() 
	{
		System.out.println("     Name of Account Holder : " + name);
		System.out.println("     Account Number : "+accno);
		System.out.println("     Account Type : " +acc_type);
		System.out.println("     Your Balance Amount : "+ balance);
	}
	
	// 	To deposit 
	public void Deposit() 
	{
		System.out.println("Enter your amount you want to with ");
		long depoamount;
		depoamount =sc.nextLong();
		balance = balance + depoamount;
		
		
	}
	
	// 	To withdraw amount
	public void withdraw()
	{
		long widrawamount;
		System.out.println("Enter you want to widthdraw amount");
		widrawamount =sc.nextLong();
		if(balance >= widrawamount)
		{
			balance =balance -widrawamount;
			System.out.println("balance amount is : "+ balance);
		}
		else
		{
			System.out.println("Your balance is less than "+widrawamount + "Transaction failed..!!");
		}
	}
	
	//	Method to search an account number  
	public boolean search(String ac_no) 
	{  
        if (accno.equals(ac_no)) {  
            Showaccount();  
            return (true);  
        }  
        return (false);  
    }  
}

public class bankingApplication2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//create initial accounts
		System.out.println("****************************************************");
		System.out.println("How many number of customers do you want to input ?");
		System.out.println("****************************************************");
		int n = sc.nextInt();
		bankdetails c[] = new bankdetails[n];  //it is class of bankdetails on above
		for(int i=0; i<c.length;i++)
		{
			c[i]=new bankdetails();
			c[i].Openaccount();
		}
		  // loop runs until number 5 is not pressed to exit
		
		int ch;
		do
		{
			System.out.println("****************************************************");
			System.out.println(" ******  Banking System Application  *****");  
			System.out.println("****************************************************");
            System.out.println("\t1 1. Display all account details ");  
            System.out.println("\t2 2. Search by Account number");
            System.out.println("\t3 3. Deposit the amount");
            System.out.println("\t4 4. Withdraw the amount");
            System.out.println("\t5 5. Exit");
            System.out.println("****************************************************");
            System.out.println("*******  Enter your choice:  ********");  
            System.out.println("****************************************************");
            
            ch = sc.nextInt();  
            switch (ch) {  
                case 1:  
                    for (int i = 0; i < c.length; i++) {  
                        c[i].Showaccount();  
                    }  
                    break;  
                case 2:  
                    System.out.print("  Enter account no. you want to search: ");  
                    String ac_no = sc.next();  
                    boolean found = false;  
                    for (int i = 0; i < c.length; i++) {  
                        found = c[i].search(ac_no);  
                        if (found) {  
                            break;  
                        }  
                    }  
                    if (!found) {  
                        System.out.println("   Search failed! Account doesn't exist..!!");  
                    }  
                    break;  
                case 3:  
                    System.out.print("  Enter Account no. : ");  
                    ac_no = sc.next();  
                    found = false;  
                    for (int i = 0; i < c.length; i++) {  
                        found = c[i].search(ac_no);  
                        if (found) {  
                            c[i].Deposit();  
                            break;  
                        }  
                    }  
                    if (!found) {  
                        System.out.println("   Search failed! Account doesn't exist..!!");  
                    }  
                    break;  
                case 4:  
                    System.out.print("  Enter Account No : ");  
                    ac_no = sc.next();  
                    found = false;  
                    for (int i = 0; i < c.length; i++) {  
                        found = c[i].search(ac_no);  
                        if (found) {  
                            c[i].withdraw();  
                            break;  
                        }  
                    }  
                    if (!found) {  
                        System.out.println("   Search failed! Account doesn't exist..!!");  
                    }  
                    break;  
                case 5:  
                    System.out.println("   See you soon...");  
                    break;  
            }  
        }  
        while (ch != 5);  
    }  

	}
