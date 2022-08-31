//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class IteratorReplacerRunner
{
	public static void main ( String[] args )
	{
		ArrayList<String> input = new ArrayList<>();   
        try {
            Scanner s = new Scanner(new File("input.txt"));
            while (s.hasNextLine()){
                input.add(s.nextLine());
            }
			for (String i: input){
				String[] x = i.split("  ");
				IteratorReplacer itrep = new IteratorReplacer(x[0], x[1], x[2]);
				itrep.replace();
				System.out.println(itrep.toString());
			}
        } catch (Exception e){
            System.out.println(e);
        }

		

	}
}