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

public class MathSetRunner
{
	public static void main (String args[]){
		ArrayList<String> input = new ArrayList<>();
		ArrayList<String> input2 = new ArrayList<>();
		try {
			Scanner s = new Scanner(new File("mathsetdata.dat"));
			while(s.hasNextLine()){
				input.add(s.nextLine());
				// if (s.hasNextLine()){
				// 	input2.add(s.nextLine());
				// }
			}
		} catch (Exception e){
			System.out.println(e);
		}
		//System.out.println(input);
		for (int i = 0; i < input.size(); i+=2){
			//System.out.println(input.get(i));
			//System.out.println(input.get(i+1));
			try{
				MathSet x = new MathSet(input.get(i), input.get(i+1));
				System.out.println(x);
				System.out.println("Union " + x.union());
				System.out.println("Intersection " + x.intersection());
				System.out.println("differenceAMinusB " + x.differenceAMinusB());
				System.out.println("differenceBMinusA " + x.differenceBMinusA());
				System.out.println("symmetricDifference " + x.symmetricDifference());
				System.out.println();
			} catch (Exception e){

			}
		}
	}
}