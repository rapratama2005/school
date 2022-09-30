//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<String> input = new ArrayList<>();
		int count = 0; 
		try{
			Scanner s = new Scanner(new File("relatives.dat"));
			while(s.hasNextLine()){
				input.add(s.nextLine());
			}
			count = Integer.parseInt(input.get(0));
			input.remove(0);
		} catch (Exception e){
			System.out.println(e);
		}

		Relatives r = new Relatives();
		for (int i = 0; i < count; i++){
			r.setPersonRelative(input.get(i));
		}
		System.out.println(r.toString());
		//System.out.println(r.getRelatives(input.get(count)));
	}
}