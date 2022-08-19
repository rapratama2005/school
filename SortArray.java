// Rizky Pratama
// Period 2
// 8/18/22

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
// import java.util.Scanner; //imports scanner
// import java.util.ArrayList; //Imports Lists
// import java.io.File; //Imports Files
// import java.io.FileNotFoundException;

import java.io.*;
import java.util.*;

public class SortArray //remember to change this
{
   public static void print(String line){ // condenses System.out.print into print(line)
      System.out.print(line);
   }
   
   public static void println(String line){ // condenses System.out.print into print(line)
      System.out.println(line);
   }
   
   public static void printArray(int[] array){ // prints array w/o fencepost prob
      System.out.print("[" + array[0]);
      for (int i = 1; i < array.length; i++){
         System.out.print(", " + array[i]);
      }
      System.out.println("]");
   }

   public static void print2DArray(int[][] array){ // prints 2d arrays
      for (int[] array2: array){
         printArray(array2);
      }
   }

   public static int[] generateArray(int length, int min, int max){// creates random array with min to max, inclusive
      int[] array = new int[length];
      for (int i = 0; i < array.length; i++){
         array[i] = randomInt(min, max);
      }
      return array;
   }
   
   public static ArrayList<Integer> generateList(int length, int min, int max){// creates random list with min to max, inclusive
      ArrayList<Integer> array = new ArrayList<>();
      for (int i = 0; i < length; i++){
         array.add(randomInt(min, max));
      }
      return array;
   }
   
   public static ArrayList<String> generateWordList(int length, ArrayList<String> list){// creates random list of words 
      ArrayList<String> array = new ArrayList<>();
      for (int i = 0; i < length; i++){
         array.add(getRandomWord(list));
      }
      return array;
   }

   public static int[][] generate2DArray(int row, int col, int min, int max){//creates random 2D array with min to max, inclusive
      int[][] array = new int[row][col];
      for (int i = 0; i < row; i++){
         array[i] = generateArray(col, min, max);
      }
      return array;
   }
   
   public static int randomInt(int min, int max){//picks random int
      return (int) (Math.random()*(max-min+1))+min;
   }
   
   public static double randomDouble(double min, double max){//picks random double
      return (Math.random()*(max-min+1))+min;
   }
   
   public static String getRandomWord(ArrayList<String> list){//gets random word
      return list.get(randomInt(0, list.size()-1));
   }
   
   public static ArrayList<String> getStringList(String fileName) throws FileNotFoundException{
      Scanner file = new Scanner(new File(fileName)); //Scans File
      ArrayList<String> s = new ArrayList<>();
      while (file.hasNextLine()){
         s.add(file.nextLine());
      }
      return s;
   }
   
   public static ArrayList<Integer> getIntList(String fileName) throws FileNotFoundException{
      Scanner file = new Scanner(new File(fileName)); //Scans File
      ArrayList<Integer> s = new ArrayList<>();
      while (file.hasNextInt()){
         s.add(file.nextInt());
      }
      return s;
   }
   
   public static ArrayList<Double> getDoubleList(String fileName) throws FileNotFoundException{
      Scanner file = new Scanner(new File(fileName)); //Scans File
      ArrayList<Double> s = new ArrayList<>();
      while (file.hasNextDouble()){
         s.add(file.nextDouble());
      }
      return s;
   }
   
   public static void bubbleSort(ArrayList<Integer> list){//sorts Array w/ bubble sort | O(n^2)
      for (int i = 0; i < list.size() - 1; i++){
         for (int j = 0; j < list.size() - 1 - i; j++){
            if (list.get(j) < list.get(j+1)){
               int temp = list.get(j);
               list.set(j, list.get(j+1));
               list.set(j+1, temp);
            }
            System.out.println(list);
         }
      }
   }
   
   public static void selectionSort(ArrayList<Integer> list){//sorts Array w/ selection sort | O(n^2)
      for (int i = 0; i < list.size(); i++){
         int min = list.get(i);
         int minIndex = i;
         for (int j = i; j < list.size(); j++){
            if (min > list.get(j)){
               min = list.get(j);
               minIndex = j;
            }
         }
         int temp = list.get(i);
         list.set(i, min);
         list.set(minIndex, temp);
      }
   }
   
   public static void insertionSort (ArrayList<Integer> list){//sorts Array w/ insertion sort | O(n^2)

      for (int i = 1; i < list.size(); i++){
         int valueToInsert = list.get(i);
         int indexToInsert = i;
         
         while (indexToInsert > 0 && list.get(indexToInsert - 1) > valueToInsert){
            list.set(indexToInsert, list.get(indexToInsert - 1));
            indexToInsert--;
         } 
         
         list.set(indexToInsert, valueToInsert);
         //System.out.println(list);
      }
   }
   
   public static int binarySearch (ArrayList<Integer> list, int target){//binary search - searches from middle
      int startIndex = 0;
      int endIndex = list.size()-1;
      while (startIndex <= endIndex){
         int midIndex = (startIndex + endIndex)/2;
         if (target < list.get(midIndex)){
            endIndex = midIndex - 1;
         } else if (target > list.get(midIndex)) {
            startIndex = midIndex + 1;
         } else {
            return midIndex;
         }
      }
      return -1;
   }

   public static int binarySearchRecursion (ArrayList<Integer> list, int target, int startIndex, int endIndex){//binary search - searches from middle
      
      int midIndex = (startIndex + endIndex)/2;
      if (target < list.get(midIndex)){
         return(binarySearchRecursion(list, target, startIndex, midIndex -1));
      } else if (target > list.get(midIndex)) {
         return(binarySearchRecursion(list, target, midIndex+1, endIndex));
      } else if (target == list.get(midIndex)){
         return midIndex;
      } else { 
         return -1;
      }
   }

   //main function
    public static void main(String[] args) throws FileNotFoundException
    {
      //Scanner input = new Scanner(System.in);//imports scanner
      ArrayList rng = generateList(10, 1, 10);
      System.out.println(rng);
      insertionSort(rng);
      println(" ");
      System.out.println(rng);
    }
}
