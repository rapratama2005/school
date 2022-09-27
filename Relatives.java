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

	public Relatives()
	{
		map = new TreeMap();


	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		Set<String> i = new TreeSet<>(Arrays.asList(personRelative));
		i.remove(0);
		map.put(personRelative[0], i);
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








		return output;
	}
}