//� A+ Computer Science  -  www.apluscompsci.com
// Rizky Pratama
// Period 2
// 8/29/22

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
import java.util.*;
import java.io.*;

//define class Palin
public class OddEvenSetsRunner{

	public static void main (String args[]){
		ArrayList<String> input = new ArrayList<>();   
        try {
            Scanner s = new Scanner(new File("oddeven.dat"));
            while (s.hasNextLine()){
                input.add(s.nextLine());
            }
            //int cases = Integer.parseInt(input.get(0));
            //input.remove(0);
           
        } catch (Exception e){
            System.out.println(e);
        }
		for (String i : input){
			OddEvenSets x = new OddEvenSets(i);
			System.out.println(x.toString());
		}
	}
}