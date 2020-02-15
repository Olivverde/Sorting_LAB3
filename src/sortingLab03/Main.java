/**
 * @author olivverde
 * @since 09/02/2020
 * @version 15/02/2020
 * 
 * Facility: UVG
 * Class: Algoritmos y estructura de datos
 * Class purpose: Gather all the functions, methods and constructors from the 
 * whole program and allow them to run.
 */

package sortingLab03;

//Imports
import java.util.Random;
import java.util.*; 
import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main (String []args) {
		
		//Class's Ambassador
		Sorting SS = new SelectionSorting();
		Random RM = new Random();

		//Stimate the amount of total numbers
		int amount = RM.nextInt(3000)+10;
		
		//Create the arrays that are going to hold the unsorted digits
		ArrayList<Comparable> ordered = new ArrayList<Comparable>();
		ArrayList<Comparable> data = new ArrayList<Comparable>();
	
		//Create numbers and save them (unsorted)
		try{
			FileWriter FW = new FileWriter("UnsortedNums.txt", true);
			PrintWriter PW = new PrintWriter("UnsortedNums.txt");
			PW.close();

			for(int i = 0 ; i < amount; i++)
			{
				int digits = RM.nextInt(3000);
				FW.write(digits + "\n");
				data.add(new Comparable(digits));
			} FW.close();
			
		}catch(IOException e) {
            System.out.println("The file has not been found");
        }
	ordered = SS.sorting(data, amount);

		//Get and save the numbers (sorted)
        try{
        	PrintWriter PW = new PrintWriter("SortedNums.txt");
        	FileWriter FW = new FileWriter("SortedNums.txt", true);
        	PW.close();
        	
        	//Extract the digits from the sorted array
        	for(int i=0; i<ordered.size(); i++)
        	{
        		int digits = ordered.get(i).getValue();
        		FW.write(digits + "\n");
        	}
        	FW.close();
        }catch(IOException e) {
            System.out.println("The file has not been found");
        }
	}
}