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
 * Class purpose: Implement the quick sorting method.
 * 
 * Retrieved from: @Bailey, D. (2007). @JavaDataStructureinJava
 * @LauraTamath
 */
public class QuickSorting implements Sorting{

	/**
	 * Quick Sorting: Sorts comparable objects, Analyzes each index point
	 * by moving systematic though the array
	*pre: Unsorted Array
	*post: Sorted Array
	*/
	public ArrayList<Comparable> sorting(ArrayList<Comparable> dato, int datos){
		//Execute QS method
		QS(dato, datos -1, 0);
		return dato;
	}
/**
 * 
 * @param data
 * @param left
 * @param right
 */
	private static void QS(ArrayList<Comparable> data, int left, int right){
		int ultright;
		//Check which index is bigger
		if (left >= right) return;

		ultright = position(data, right, left);
		//Executing QS
		QS(data, ultright+1, right);
		QS(data, left, ultright-1);
	}

	/**
	 * Moves the index in both ways in order to check all the values
	 * @param data
	 * @param right
	 * @param left
	 * @return
	 */

	private static int position(ArrayList<Comparable> data, int right, int left){
		while (true){
			//Moving index to right
			while(left < right && data.get(left).compareTo(data.get(right)) < 0){
				right --;
			}
			//If left is bigger than right
			if(left < right){
					swap(data, left ++, right);
			}else{
				return left;
			}
			//Moving index to right
			while(left <right && data.get(left).compareTo(data.get(right))<0){
				left ++;
			}
			//If left is lower than right
			if (left < right) {
				swap(data, left, right--);
			}else{
				return right;
			}
		}
	}
	
/**
 * Interchange data among array's position
 * @param data
 * @param lower
 * @param next
 */
	//Interchange data
	private static void swap(ArrayList<Comparable> data, int lower, int next){
		Comparable temp;
		temp = data.get(lower);
		data.set(next, temp);
		data.set(lower, data.get(next));
	}
}
