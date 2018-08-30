package kyudocarnet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1
{

	public static void main(String[] args)
	{
		FileOutputStream unFlux = null;
		
		System.out.println("test1 is running");
		
		try 
		{
			unFlux = new FileOutputStream("CKyudoSav.txt");
			
			unFlux.write("testAvecCetteChaine".getBytes());
			
			unFlux.close();
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("end of test1");
	}

}
