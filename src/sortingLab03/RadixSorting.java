/**
 * 
 */
package sortingLab03;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author olivverde
 * @since 09/02/2020
 * @version 15/02/2020
 * 
 * Facility: UVG
 * Class: Algoritmos y estructura de datos
 * Class purpose: Implement the merge sorting method.
 * 
 * Retrieved from: @Bailey, D. (2007). @JavaDataStructureinJava
 */
public class RadixSorting implements Sorting 
{
	/**
	 * Radix Sorting: Sorts comparable objects, orders a group of digits by
	 * organizing them in vectors, then starts distributing the digits among
	 * all this vector. Finally gathered back every value into a single Array
	 * @param data
	 * @param amount
	 * @return a sorted array
	 */
	public ArrayList<Comparable> sorting(ArrayList<Comparable>data, int amount){
		for(int i = 0; i < 6 ; i++){
			//execute bucketPass method
			bucketPass(data, amount, i);	
		}return data;
	}
	/**
	 * Checks if it's a decimal relation, if not it generates by itself
	 * @param amount
	 * @param decimal
	 * @return
	 */
	private static int tenth(int amount, int decimal)
	{
		if(decimal == 0){
			//check if it has a decimal relation
			return amount%10;
		}else{
			return tenth(amount/10, decimal-1);
		}
	}
	/**
	 * Sort the digits by using vectors of vectors
	 * @param data
	 * @param amount
	 * @param decimal
	 */
	private static void bucketPass(ArrayList<Comparable> data, 
									int amount, int decimal){
		Comparable value;
		//A vector that holds a vector of integer
		Vector<Vector<Integer>> position = new Vector<Vector<Integer>>(10);
		position.setSize(10);
		//Set an Integer vector to the main vector
		for (int j=0; j<10; j++){
			position.set(j, new Vector<Integer>());	
		} 

		//Start introducing Integer values
		for (int i = 0; i < amount; i++) {
			value = data.get(i);
			int j = tenth(value.getValue(), decimal);
			position.get(j).add(value.getValue());
		}

		int i = amount;

		//Checks each vector taking its values and letting them empty
		for (int j=9; j >= 0; j--) {
			while (!position.get(j).isEmpty()){
				i--;
				value = new Comparable(position.get(j).remove(position.get(j).size() - 1));
				data.set(i, value);
			}
		}
	}
}
