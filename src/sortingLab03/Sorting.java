package sortingLab03;
/**
 * @author olivverde
 * @since 09/02/2020
 * @version 15/02/2020
 * 
 * Facility: UVG
 * Class: Algoritmos y estructura de datos
 * Interface purpose: Implement sorting methods to each sort way
 * 
 * Retrieved from: @Bailey, D. (2007). @JavaDataStructureinJava
 */
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
