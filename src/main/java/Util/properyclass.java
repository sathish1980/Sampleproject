package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properyclass {
public static Properties p = new Properties();
	
    public Properties getObjectRepository(File filename) throws IOException
    {
    	FileInputStream stream = new FileInputStream(filename);
        p.load(stream);
        return p;
    }

}
