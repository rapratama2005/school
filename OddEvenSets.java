
//� A+ Computer Science  -  www.apluscompsci.com
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
import java.util.Scanner;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class OddEvenSets
{
	private Set<Integer> odds = new TreeSet<Integer>();
	private Set<Integer> evens = new TreeSet<Integer>();
	private Set<Integer> perfect = new TreeSet<Integer>();
	public OddEvenSets(String line)
	{
		String[] words = line.split(" ");
		ArrayList<Integer> intList = new ArrayList<>();
		for (String i : words) {
			intList.add(Integer.parseInt(i));
		}
		System.out.println(intList);
		Set<Integer> set = new TreeSet<Integer>(intList);
		for (int i: set) {
			if (i%2==0) {
				evens.add(i);
			} else {
				odds.add(i);
			}
			if (perfectNumber(i)){
				perfect.add(i);
			}
		}
	}

	public boolean perfectNumber(int x){
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 1; i < x; i++){
			if (x%i==0){
				set.add(i);
			}
		}
		int sum = 0;
		for (int i: set){
			sum += i;
		}

		return sum==x;
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\nPERFECTS : " + perfect + "\n\n";
	}
}