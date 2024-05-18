//Jovanny Gonzalez
//jgonzalez1071@toromail.csudh.edu

import java.io.FileInputStream;
import java.io.InputStream;

public class FileHook extends AbstractCurencyLoader
{
	String path;
	
   public FileHook(String filePath) 
   {
		path=filePath;
   }

@Override
   protected InputStream getStream() throws Exception {
       //return new FileInputStream("currencies.csv");
       return new FileInputStream(path);
   }
}