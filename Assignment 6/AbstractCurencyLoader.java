//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
 
import java.util.Scanner;
public abstract class AbstractCurencyLoader {
 
    public Map<String, MyCurrency> loadCurrencies() throws Exception {
        Map<String, MyCurrency> m = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(getStream()));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            String currencyCode = tokens[0];
            double exchangeRate = Double.valueOf(tokens[2]);
            m.put(currencyCode, new MyCurrency(currencyCode, exchangeRate));
        }
        return m;
    }
 
    protected abstract InputStream getStream() throws Exception;
 
    public static AbstractCurencyLoader getInstance(String type) {
        type = type.toUpperCase().strip();
        if (type.equals("FILE")) 
        {
        	Scanner keyboard=new Scanner(System.in);
        	System.out.println("Enter FILE path:");
        	// THIS IS HOW I USE A FILE PATH, EXAMPLE BELOW
        	//C:\Users\jovanny\Downloads\currencies.csv
        	
        	String filePath=keyboard.next();
        	FileHook filehook=new FileHook(filePath);
            return filehook;

        			
        	//return new FileHook(filePath);
        }
        else if (type.equals("STRING")) 
        {
            return new StringHook();
        } 
        else if (type.equals("NETWORK")) 
        {
            return new NetworkHook();
        }
        return null;
    }
}

