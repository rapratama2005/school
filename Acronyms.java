//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{
		acronymTable = new TreeMap<>();


	}

	public void putEntry(String entry)
	{
		String[] i = entry.split(" - ");
		acronymTable.put(i[0], i[1]);
	}

	public String convert(String sent)
	{
		String[] i = sent.split(" ");
		String output = "";
		for (String j: i){
			if (acronymTable.containsKey(j)){
				output += acronymTable.get(j) + " ";
			} else {
				output += j + " ";
			}
		}
		return output;
	}

	public String toString()
	{
		String j = "====    MAP CONTENTS    ====\n";
		j += acronymTable.toString();
		// for (Map.Entry<String, String> i : acronymTable.entrySet()){
			
		// }
		j += "====    READ LINES      ====\n";

		return j;
	}
}