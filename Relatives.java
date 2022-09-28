//(c) A+ Computer Science
//www.apluscompsci.com

// Rizky Pratama
// Period 2
// 9/27/22

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

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;
	private String special;

	public Relatives()
	{
		map = new TreeMap();
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		// String[] personRelative2 = new String[personRelative.length-1];
		// for (int j = 1; j < personRelative.length; j++){
		// 	personRelative2[j-1] = personRelative[j];
		// }
		// Set<String> i = new TreeSet<>(Arrays.asList(personRelative2));
		// map.put(personRelative[0], i);
		try {
			if (map.containsKey(personRelative[0])){
				map.get(personRelative[0]).add(personRelative[1]);
			} else {
				Set<String> i = new TreeSet<>();
				i.add(personRelative[1]);
				map.put(personRelative[0],i);
			}
		} catch (IndexOutOfBoundsException e){
			special = personRelative[0];
		}
	}


	public String getRelatives(String person)
	{
		String relatives = "";
		Set<String> i = new TreeSet<>(map.get(person));
		for(String j: i) {
			relatives += j + " ";
		}
		return relatives;
	}


	public String toString()
	{
		String output="";
		for (Map.Entry<String,Set<String>> i: map.entrySet()){
			output += i.getKey() + " is related to " + getRelatives(i.getKey()) + "\n";
		}
		//output += special + " is related to " + map.get(special);
		return output;
	}
}