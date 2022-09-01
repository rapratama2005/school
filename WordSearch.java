// Rizky Pratama
// Period 2
// 9/1/22

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

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][str.length()/size];
    	for (int x = 0; x < m.length; x++) {
    		for(int y = 0; y < m[x].length; y++) {
    			m[x][y] = str.substring(0,1);
    			str = str.substring(1);
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int x = 0; x < m.length; x++) {
    		for(int y = 0; y < m[x].length; y++) {
    			if (checkRight(word, x, y)||checkLeft(word, x, y)||checkUp(word, x, y)||checkDown(word, x, y)||checkDiagUpRight(word, x, y)||checkDiagUpLeft(word, x, y)||checkDiagDownRight(word, x, y)||checkDiagDownLeft(word, x, y)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		for (int i = 0; i < w.length(); i++) {
			try {
				if (!m[r][c+i].equals(w.substring(i,i+1))) {
				return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for (int i = 0; i < w.length(); i++) {
			try {
				if (!m[r][c-i].equals(w.substring(i,i+1))) {
				return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		for (int i = 0; i < w.length(); i++) {
			try {
				if (!m[r-i][c].equals(w.substring(i,i+1))) {
				return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		for (int i = 0; i < w.length(); i++) {
			try {
				if (!m[r+i][c].equals(w.substring(i,i+1))) {
				return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		for (int i = 0; i < w.length(); i++) {
			try {
				if (!m[r-i][c+i].equals(w.substring(i,i+1))) {
				return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		for (int i = 0; i < w.length(); i++) {
			try {
				if (!m[r-i][c-i].equals(w.substring(i,i+1))) {
				return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		for (int i = 0; i < w.length(); i++) {
			try {
				if (!m[r+i][c-i].equals(w.substring(i,i+1))) {
				return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		for (int i = 0; i < w.length(); i++) {
			try {
				if (!m[r+i][c+i].equals(w.substring(i,i+1))) {
				return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

    public String toString()
    {
    	String toReturn = "";
    	for(String[] x : m) {
    		for (String y: x) {
    			toReturn += y + " ";
    		}
    		toReturn += "\n";
    	}
 		return toReturn;
    }
}
