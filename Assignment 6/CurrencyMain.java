//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
public class CurrencyMain {
    public static final String[] menuOptions = { "Sell Currency%n", "Exit%n" };
    public static final String MSG_PROMPT = "%nEnter choice: ";
 
    public static void main(String[] args) throws Exception {
    	Scanner keyboard=new Scanner(System.in);
    	System.out.println("REQUEST TYPES: 8 for FILE,9 for STRING, 10 for NETWORK.\nNOTE:TYPE WILL BE FORCED TO INT\nEnter Request Type:");
		float x;
		x=keyboard.nextFloat();
		int choice;
		choice=(int)x;
		String request=null;
		while (x<8||x>10)
		{
			System.out.println("You selected: "+choice+", Invalid.");
			System.out.println("NOTE: Please ensure your choice is one of the presented options.");
			System.out.print("Please try again: ");
			x=keyboard.nextFloat();
			choice=(int)x;
		}
    	if (choice==8)
    	{
    		request="FILE";
    	}
    	if (choice==9)
    	{
    		request="STRING";
    		System.out.print("NOTE THAT STRING ONLY HAS 2 TYPES OF CURRENCIES. CAD AND EUR\n");
    	}
    	if (choice==10)
    	{
    		request="NETWORK";
    	}
    	
        new CurrencyMain(System.in, System.out).run(request);
    }
 
    InputStream in;
    OutputStream out;
 
    public CurrencyMain(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }

    public void run(String request) throws Exception {
        UIManager ui = new UIManager(this.in, this.out, menuOptions, MSG_PROMPT);
        
        Currencies currencyBank = new Currencies(request);
        
        
 
        try {
            while (true) {
                int option = ui.getMainOption();
                if (option == 2)
                    System.exit(0);
 
                String currency = ui.readToken("Enter the currency you are selling:");
                double amount = ui.readDouble("Enter the amount of currency you are selling:");
 
                if (!currencyBank.existsCurrency(currency)) {
                    ui.print("Currency %s does not exist%n%n", currency);
                    continue;
                }
 
                ui.print(currency, menuOptions);
                ui.print("%nYou will get USD %s %n%n", currencyBank.getCurrency(currency).convertToUSD(amount));
            }
        } catch (Exception ignore) {
        }
    }
}
