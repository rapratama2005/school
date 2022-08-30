//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class IteratorRemoverRunner
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
				IteratorRemover itrem = new IteratorRemover(x[0], x[1]);
				itrem.remove();
				System.out.println(itrem.toString());
			}
        } catch (Exception e){
            System.out.println(e);
        }

		

	}
}