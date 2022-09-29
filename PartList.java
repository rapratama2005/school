//(c) A+ Computer Science
//www.apluscompsci.com

// Rizky Pratama
// Period 4
// 9/28/22

/*
_______ _________ _______  _                   _______  _______  _______ _________ _______  _______  _______ 
(  ____ )\__   __// ___   )| \    /\|\     /|  (  ____ )(  ____ )(  ___  )\__   __/(  ___  )(       )(  ___  )
| (    )|   ) (   \/   )  ||  \  / /( \   / )  | (    )|| (    )|| (   ) |   ) (   | (   ) || () () || (   ) |
| (____)|   | |       /   )|  (_/ /  \ (_) /   | (____)|| (____)|| (___) |   | |   | (___) || || || || (___) |
|     __)   | |      /   / |   _ (    \   /    |  _____)|     __)|  ___  |   | |   |  ___  || |(_)| ||  ___  |
| (\ (      | |     /   /  |  ( \ \    ) (     | (      | (\ (   | (   ) |   | |   | (   ) || |   | || (   ) |
| ) \ \_____) (___ /   (_/\|  /  \ \   | |     | )      | ) \ \__| )   ( |   | |   | )   ( || )   ( || )   ( |
|/   \__/\_______/(_______/|_/    \/   \_/     |/       |/   \__/|/     \|   )_(   |/     \||/     \||/     \|

*/
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
		partsMap = new TreeMap<>();
	}
	
	public PartList(String fileName)
	{
		this();
		try
		{
			Scanner file = new Scanner(new File(fileName));
			//add code here to read from the file 
			//and add Parts to the map
			while(file.hasNextLine()){
				Part x = new Part(file.nextLine());
				if (!partsMap.containsKey(x)){
					partsMap.put(x, 1);
				} else {
					partsMap.replace(x, partsMap.get(x)+1);
				}
			}
		}
		catch( IOException e )  //Most specific exceptions must be listed 1st
		{
			//out.println(e);
		}
		catch( RuntimeException e )
		{
			//out.println(e);
		}
		catch( Exception e )
		{
			//out.println(e);
		}
		finally
		{
			//no code needed here
		}
	}
	
	public String toString()
	{
		String output="";
		for (Part i: partsMap.keySet()){
			output += i.toString() + "- " + partsMap.get(i) + "\n";
		}
		return output;
	}
}