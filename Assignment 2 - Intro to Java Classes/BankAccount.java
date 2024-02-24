//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

public class BankAccount
{
	private String firstName;
	private String lastName;
	private double balance;
	
    public BankAccount(String ownerFirstName, String ownerLastName, double initialDepositAmount)
    {
    	firstName=ownerFirstName;
    	lastName=ownerLastName;
    	balance=initialDepositAmount;

    }

    public boolean deposit(double amount)
    {

    	balance+=amount;
    	return true;
    	
    	
    }

    public boolean withdraw(double amount)
    {

    	balance-=amount;
    	return true;

     }

     public boolean isOpen()
     {
    	 System.out.println("Bank Account is open.");
    	 return true;
    	 
     }

     public void close()
     {
    	 System.out.println("Bank Account Closed.");
     }

     public String getOwnerFullName()
     {
    	 return (firstName+" "+lastName);
     }

}