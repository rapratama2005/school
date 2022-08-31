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

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep){
		setEmAll(line, rem, rep);
	}

	public void setEmAll(String line, String rem, String rep){
		String[] temp = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(temp));
		toRemove = rem;
		replaceWith = rep;
	}

	public void replace(){
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()){
			if(it.next().equals(toRemove)){
				it.set(replaceWith);
			}
		}
		//System.out.println(it);

	}

	public String toString(){
		return list.toString()+"\n\n";
	}
}