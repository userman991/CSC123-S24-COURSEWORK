//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URI;
public class NetworkHook extends AbstractCurencyLoader 
{
 
    @Override
    protected InputStream getStream() throws Exception {
        URI uri = new URI("http://www.usman.cloud/banking/exchange-rate.csv");
        URLConnection connection = uri.toURL().openConnection();
        return connection.getInputStream();
    }
}

