//(c) A+ Computer Science
//www.apluscompsci.com

// Rizky Pratama
// Period 4
// 9/28/22

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

import java.io.*;
import java.util.*;
public class Part implements Comparable<Part>
{
	private String make, model, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		year = Integer.parseInt(list[list.length-1]);
		model = list[list.length-2];
		make = list[list.length-3];
		rest = line.substring(0, line.indexOf(make));
	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part that )
	{
		if (this.getMake().compareTo(that.getMake())==0){
			if (this.getModel().compareTo(that.getModel())==0){
				if (this.getYear()-that.getYear()==0){
					return this.getRest().compareTo(that.getRest());
				} else {return (this.getYear()-that.getYear());}
			} else {return (this.getModel().compareTo(that.getModel()));}
		} else {return (this.getMake().compareTo(that.getMake()));}

	}

	public int getYear(){
		return year;
	}

	public String getMake(){
		return make;
	}

	public String getModel(){
		return model;
	}

	public String getRest(){
		return rest;
	}

	public String toString()
	{
		return make + " " + model + " " + year + " " + rest;
	}
}