package kyudocarnet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;

public class testGestionInOutFichier
{

	public static void main(String[] args)
	{
		FileOutputStream unFluxOut = null;
		FileInputStream unFluxIn = null;
		
		System.out.println("testGestionInOutFichier is running\n");
		
		try 
		{
			unFluxOut = new FileOutputStream("CKyudoSav.txt");
			
			unFluxOut.write("testAvecCetteChaine\n".getBytes());
			
			unFluxOut.write("testAvecCetteAutreChaine\n".getBytes());
			
			unFluxOut.close();
			
			System.out.println("Methode 1");
			int n = 0;
			byte[] unBuffer = new byte[8];
			unFluxIn = new FileInputStream("CKyudoSav.txt");
			while ((n = unFluxIn.read(unBuffer)) >= 0)
	        {
				for (byte bit : unBuffer)
	            {
					//System.out.print("\t" + bit + "(" + (char) bit + ")");
					System.out.print((char) bit);
	            }
	            System.out.print("");
	            unBuffer = new byte[8];
				
		    
	        }
			System.out.println("");
			unFluxIn.close();
	        
			System.out.println("Methode 2");
			String unString = "";
			unFluxIn = new FileInputStream("CKyudoSav.txt");
			while ((unFluxIn.available()) > 0)
	        {
				unString = unString + (char)unFluxIn.read();
	        }
			System.out.println(unString);
			unFluxIn.close();
			
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("end of testGestionInOutFichier");
	}

}
