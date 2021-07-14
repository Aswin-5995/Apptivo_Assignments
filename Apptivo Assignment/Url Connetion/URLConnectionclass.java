//Java Program to illustrate reading and writing
// in URLConnection Class
import java.io.*;
import java.net.*;

import java.util.List;
import java.util.Map;

public class URLConnectionclass
{
	public static void main(String[] args)
	{
		try
		{
			URL url = new URL("https://www.w3schools.com/sql/sql_create_table.asp");
			
			//open the connection to the above URL.
			URLConnection urlcon = url.openConnection();
			
			//Executing the below line would print the value of
			// Allow User Interaction field.
			 System.out.println(urlcon.getAllowUserInteraction());
			
			
			//Executing the below line would print the value
			// of URL of the given connection.
			 System.out.println(urlcon.getURL());
			
			
			//To get a map of all the fields of http header
			Map<String, List<String>> header = urlcon.getHeaderFields();
			
			//print all the fields along with their value.
			for (Map.Entry<String, List<String>> mp : header.entrySet())
			{
				System.out.print(mp.getKey() + " : ");
				System.out.println(mp.getValue().toString());
			}
			System.out.println();
			System.out.println("Complete source code of the URL is-");
			System.out.println("---------------------------------");
			
			//get the inputstream of the open connection.
			BufferedReader br = new BufferedReader(new InputStreamReader
												(urlcon.getInputStream()));
			String i;
			
			//print the source code line by line.
			while ((i = br.readLine()) != null)
			{
				System.out.println(i);
			}
		}
		catch (MalformedURLException error) {
            // Output expected MalformedURLExceptions.
			System.out.println(error);
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
