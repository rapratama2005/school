//(c) A+ Computer Science
//www.apluscompsci.com

// Rizky Pratama
// Period 2
// 9/16/22

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
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{

	public static Set<String> getUniques(String input)
	{
		String[] words = input.split(" ");  
		Set<String> uniques = new TreeSet<String>(Arrays.asList(words));
		//add code
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		String[] words = input.split(" ");  
		Set<String> uniques = new TreeSet<String>(Arrays.asList(words));
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
		for (String i: uniques) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).equals(i)) {
					list.remove(j);
					break;
				}
			}
		}
		Set<String> dupes = new TreeSet<String>(list);
		//add code
		return dupes;
	}
}