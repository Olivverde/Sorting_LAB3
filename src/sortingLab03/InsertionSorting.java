/**
 * 
 */
package sortingLab03;

import java.util.ArrayList;

/**
 * @author olivverde
 * @since 09/02/2020
 * @version 15/02/2020
 * 
 * Facility: UVG
 * Class: Algoritmos y estructura de datos
 * Class purpose: Implement the insertion sorting method.
 * 
 * Retrieved from: @Bailey, D. (2007). @JavaDataStructureinJava
 * @author lauraTamath
 */

public class InsertionSorting implements Sorting {
	/**
	 * Insertion Sorting: Sorts comparable objects, It checks if the currently
	 * digit has a lower value than the last one. It move the lower values to 
	 * the beginning of the array.
	 * @param data
	 * @param amount
	 * @return
	 */
	public ArrayList<Comparable> sorting(ArrayList<Comparable> data, int amount){
		//Amount of sorted digits
		int order = 1;
		//Currently index
		int index; 
		
		while(order < amount)
		{
			Comparable actual = data.get(order);
			for(index = order; index > 0; index --){
				//Check if it's about the bigger value
				if (actual.compareTo(data.get(index -1))<0){
					data.set(index, data.get(index-1));	
				}else{
					break;
				}
			}
			//Add again the last number
			data.set(index, actual); 
			order ++;
		}
		
		return data;
	}
}
