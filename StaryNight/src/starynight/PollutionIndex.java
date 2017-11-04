package starynight;

import java.io.*;
import java.net.*;

public class PollutionIndex
{
	public void url () throws IOException
	{
	URL url = new URL ("http://www.airqualityontario.com/aqhi/index.php");
	
	URLConnection connect = url.openConnection();
	InputStream input = connect.getInputStream();
	
	BufferedReader br = new BufferedReader (new InputStreamReader(input));
	
	String line = null;
	while ((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
	
	}
}


