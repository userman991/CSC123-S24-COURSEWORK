//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu
import java.util.HashMap;
import java.util.Map;
 
public class Currencies {
 
    Map<String, MyCurrency> currencies = new HashMap<>();
 
    public Currencies(String loaderType) throws Exception {
        AbstractCurencyLoader cl = AbstractCurencyLoader.getInstance(loaderType);
        currencies = cl.loadCurrencies();
    }
 
    public MyCurrency getCurrency(String name) {
        return currencies.get(name);
    }
 
    public boolean existsCurrency(String name) {
        return currencies.containsKey(name);
    }
}
