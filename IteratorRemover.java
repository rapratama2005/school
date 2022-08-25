//(c) A+ Computer Science
//www.apluscompsci.com
// Rizky Pratama
// Period 2
// 8/22/22

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
// import java.util.Scanner; //imports scanner
// import java.util.ArrayList; //Imports Lists
// import java.io.File; //Imports Files
// import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem){
		setTest(line, rem);
	}

	public void setTest(String line, String rem){
		String[] temp = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(temp));
		toRemove = rem;
	}

	public void remove(){
		Iterator it = list.iterator();
		while(it.hasNext()){
			if(it.next().equals(toRemove)){
				it.remove();
			}
		}
	}

	public String toString()
	{
		remove();
		return list.toString();
	}
}