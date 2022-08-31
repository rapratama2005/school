//(c) A+ Computer Science
//www.apluscompsci.com
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

public class StringSearch
{
	/*
	 *method countWords will count the occurrences of word in sent
	 *there may many occurrences of word or none at all
	 */
	public static int countWords(String sent, String word)
	{
		int index = 0;
		int x = 0;
		while(sent.indexOf(word, index)>-1){
			index = sent.indexOf(word,index) + 1;
			x++;
		}
		return x;
	}

	/*
	 *method countLetters will count the occurrences of letter in sent
	 *there may many occurrences of letter or none at all
	 */
	public static int countLetters(String sent, String letter)
	{
		int x = 0;
		for (int i = 0; i < sent.length(); i++){
			if(sent.substring(i,i+1).equals(letter)){
				x++;
			}
		}
		return x;
	}
}