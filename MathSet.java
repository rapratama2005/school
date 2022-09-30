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
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet(String o, String t)
	{
		String[] o2 = o.split(" ");
		ArrayList<Integer> o3 = new ArrayList<>();
		for (String i: o2){
			o3.add(Integer.parseInt(i));
		}
		one = new TreeSet<Integer>(o3);

		String[] t2 = t.split(" ");
		ArrayList<Integer> t3 = new ArrayList<>();
		for (String i: t2){
			t3.add(Integer.parseInt(i));
		}
		two = new TreeSet<Integer>(t3);

	}

	public Set<Integer> union()
	{
		Set<Integer> all = new TreeSet<Integer>();
		all.addAll(one);
		all.addAll(two);
		return all;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> intersect = new TreeSet<Integer>();
		for (int i: one){
			for (int j: two){
				if (i == j){
					intersect.add(i);
				}
			}
		}
		return intersect;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> diffAB = new TreeSet<Integer>();
		for (int i: one){
			boolean inB = false;
			for (int j: two){
				if (i == j){
					inB = true;
				}
			}
			if (!inB){
				diffAB.add(i);
			}
		}
		return diffAB;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> diffBA = new TreeSet<Integer>();
		for (int i: two){
			boolean inA = false;
			for (int j: one){
				if (i == j){
					inA = true;
				}
			}
			if (!inA){
				diffBA.add(i);
			}
		}
		return diffBA;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> symmDiff = new TreeSet<Integer>();
		symmDiff.addAll(differenceAMinusB());
		symmDiff.addAll(differenceBMinusA());
		return symmDiff;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}