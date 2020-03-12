package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextStorage 
{
	static File file = new File("storage.txt");
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scnr = new Scanner(file);
//		scnr.useDelimiter("|");
//		int lines = countLines(scnr);
		
		while(scnr.hasNextLine())
		{
//			System.out.print("tags:");
			while(scnr.hasNext())
			{
				String worker = scnr.next();
				if(worker.contains("url="))
				{
					System.out.println(worker.substring(worker.indexOf("=")+1));
					break;
				}
				System.out.print(worker + " ");
			}
			System.out.println();
		}
		
			
	}
	
	public static int countLines(Scanner file)
	{
		int lines = 0;
		while(true)
		{
			if(file.hasNextLine())
			{
				lines++;
				file.nextLine();
			}
			else
				break;
		}
		return lines;
	}
}
