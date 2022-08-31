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
import static java.lang.System.*;
import java.util.ArrayList;

//define class Palin
public class Palin{

	//instance variable - String
	private String word;


	//constructors
	public Palin(String word){
		this.word = word;
	}

	//getLength method - returns an int
	public int getLength(){
		return word.length();
	}

	//getWord method - returns a String
	public String getWord(){
		return word;
	}

	//isPalin method - returns a boolean
	public boolean isPalin(){
		StringBuffer backwards = new StringBuffer(word);
		backwards.reverse();
		if(word.equals(backwards.toString())){
			return true;
		} else { return false; }
	}

	//toString method - returns a String
	public String toString(){
		return word;
	}
}