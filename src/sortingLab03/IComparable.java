/**
 * 
 */
package sortingLab03;

/**
 * @author olivverde
 * @since 09/02/2020
 * @version 15/02/2020
 * 
 * Facility: UVG
 * Class: Algoritmos y estructura de datos
 * Interface purpose: States the method's contract for Comparable objects
 * 
 * Retrieved from: @Bailey, D. (2007). @JavaDataStructureinJava
 */
public interface IComparable<T> {
	/**
	pre: value is compared
	@return -1 when the value is lower,
	 1 if it's higher,
	 0 if it's equals
	**/
	public abstract int compareTo(T value);
}
