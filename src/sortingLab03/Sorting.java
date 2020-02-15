package sortingLab03;

import java.util.ArrayList;

public interface Sorting {
	/**
	 * pre: digits are unsorted
	 * post: digits must be sorted
	 * 
	 * @param data
	 * @param amount
	 * @return
	 */
	public ArrayList<Comparable> sorting (ArrayList<Comparable> data, int amount);
}
