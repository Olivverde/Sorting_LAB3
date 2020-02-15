package sortingLab03;
/**
 * @author olivverde
 * @since 09/02/2020
 * @version 15/02/2020
 * 
 * Facility: UVG
 * Class: Algoritmos y estructura de datos
 * Class purpose: Implement the selection sorting method.
 * 
 * Retrieved from: @Bailey, D. (2007). @JavaDataStructureinJava
 */

import java.util.ArrayList;

public class SelectionSorting implements Sorting
{
	/**
	 * Selection Sorting: Sorts comparable objects, taking 2 by 2 in order
	 * to determinate which is bigger, implementing the swap function to 
	 * reorganize according to the generated order.
	 * @param data
	 * @param amount
	 * @return 
	 */
	public ArrayList<Comparable> sorting (ArrayList<Comparable> data, int amount){
		int unsorted = amount;
		int max;

		//while the array isn't empty
		while(unsorted > 0){
			max = 0;
			//Look for the greater
			for(int index = 1; index < unsorted; index++)
			{
				if(data.get(max).compareTo(data.get(index)) < 0){
					max = index;
				}
			} 
			//Execute swap function
			swap(data, max, unsorted-1);
			unsorted--;
		}
		return data;
	}
	/**
	 * Swap: Allow the change of values among array's spaces
	 * @param data
	 * @param max
	 * @param index
	 */
	private static void swap(ArrayList<Comparable> data, int max, int index){
		Comparable temporal; 
		temporal = data.get(max);
		data.set(max, data.get(index));
		data.set(index, temporal);
	}
}