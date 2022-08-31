//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

public class LongPalindrome
{
	/*
	 *method getAllPalins will return an array list that contains
	 *all of the palindromes contained within word
	 *palindromes must have a minimum length of 2
	*/
	public static ArrayList<Palin> getAllPalins(String word)
	{
		ArrayList<Palin> palinList = new ArrayList<>();
		for (int x = 0; x < word.length(); x++){
			for(int y = x+2; y <= word.length(); y++){
				Palin test = new Palin(word.substring(x, y));
				if(test.isPalin()){
					palinList.add(insertLocation(palinList, test), test);
					System.out.println(palinList);
				}
			}
		}
		return palinList;
	}

	/*
	*method insertLocation will look at the list and determine where to
	*put the new Palin so that the sorted order is maintained
	*/
	private static int insertLocation( ArrayList<Palin> list, Palin pal )
	{
		int x = 0;
		if (list.size()==0){return 0;}
		for (int i = 0; i < list.size(); i++){
			if(pal.toString().compareTo(list.get(i).toString())>0){
				x = i;
			}
		}
		return x;
	}

	/*
	 *method getLongestPalin will return the longest
	 *palindrome contained within word
	 *a palindrome must a minimum length of 2
	*/
	public static Palin getLongestPalin(String word)
	{
		ArrayList<Palin> palins = getAllPalins(word); 
		Palin x = palins.get(0);
		for(Palin i: palins){
			if(x.getLength()<i.getLength()){
				x = i;
			}
		}
		return x;
	}
}