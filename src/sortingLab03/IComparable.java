/**
 * 
 */
package sortingLab03;

/**
 * @author olivverde
 *
 */
public interface IComparable<T> {
	/**
	pre: se compara el valor
	@return -1 cuando el valor es menor al objeto, 1 si es mayor, y 0 si es igual
	**/
	public abstract int compareTo(T value);
}
