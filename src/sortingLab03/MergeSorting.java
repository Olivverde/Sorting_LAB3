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
 * Class purpose: Implement the merge sorting method.
 * 
 * Retrieved from: @Bailey, D. (2007). @JavaDataStructureinJava
 */

public class MergeSorting implements Sorting{
	/**
	 * Merge Sorting: Sorts comparable objects, orders a group of digits by
	 * separating into two arrays, working and ordering both in parallel. After
	 * ordering separately, it put together again.
	 * @param data
	 * @param amount
	 * @return a sorted array
	 */
	public ArrayList<Comparable> sorting(ArrayList<Comparable> data, int amount){
		ArrayList<Comparable> temp = new ArrayList<Comparable>();

		//Execute mergeSortRecursive
		mergeSortRecursive(data,temp,0,  amount-1);
		return data;
	}
	/**
	 * Allow the interchange of data among temporal and data arrays
	 * kind of sorting in parallel
	 * @param data
	 * @param temp
	 * @param lower
	 * @param middle
	 * @param higher
	 */
	private static void sort(ArrayList<Comparable> data,
	ArrayList<Comparable> temp, int lower, int middle, int higher)
	{
		int current = middle;
		int actual = lower;
		int next = higher;

		//While index is coherent
		while(actual < higher && next <= middle){
			if(data.get(next).compareTo(temp.get(actual)) < 0){
				data.set(current++, data.get(next++));
			}else{
				data.set(current++, temp.get(actual++));
			}
		}
		while(actual< higher){
			data.set(current++, temp.get(actual++));
		}
	}
	
	/**
	 * A recursive resource, execute until it
	 * has ordered both arrays separately
	 * @param data
	 * @param temp
	 * @param lower
	 * @param max
	 */
	private static void mergeSortRecursive(ArrayList<Comparable> data,
					ArrayList<Comparable> temp, int lower, int max){
		int current = max - lower +1;
		int middle = lower + current/2;
		int i;
		
		//Assures that the index can execute 
		if(current < 2) return;
		for(i = lower; i<middle; i++){
			temp.set(i, data.get(i));
		}

		//Execute recursivity
		mergeSortRecursive(temp, data, lower, middle -1);
		mergeSortRecursive(data, temp, max, middle);
		sort(data, temp, middle, max, lower);
	}
}
