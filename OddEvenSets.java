//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets(String line)
	{
		String[] words = line.split(" ");
		ArrayList<Integer> intList = new ArrayList<>();
		for (String i : words) {
			intList.add(Integer.parseInt(i));
		}
		Set<Integer> set = new TreeSet<Integer>(intList);
		Set<Integer> evens = new TreeSet<Integer>();
		Set<Integer> odds = new TreeSet<Integer>();
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}