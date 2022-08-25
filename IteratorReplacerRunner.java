//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		IteratorReplacer itrep = new IteratorReplacer("a b c a b c","a","+");
		itrep.replace();
		System.out.print(itrep.toString());
		itrep.setEmAll("a b c d e f g h i j x x x x ", "x", "7");
		itrep.replace();
		System.out.print(itrep.toString());
		itrep.setEmAll("1 2 3 4 5 6 a b c a b c", "b", "#");
		itrep.replace();
		System.out.print(itrep.toString());
		IteratorRemover itrem = new IteratorRemover("a b c a b c a", "a");
		System.out.print(itrem.toString());
		itrem.setTest("a b c d e f g h i j x x x x", "x");
		System.out.print(itrem.toString());
		itrem.setTest("1 2 3 4 5 6 a b c a b c ", "b");
		System.out.print(itrem.toString());
		

	}
}