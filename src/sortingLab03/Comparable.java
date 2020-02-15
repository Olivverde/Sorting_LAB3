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
 * Class purpose: Sets the ADT contract for the Comparable interface, also
 * allows to define each method that every sorting is going to use.
 * 
 * Retrieved from: @Bailey, D. (2007). @JavaDataStructureinJava
 */
public class Comparable implements IComparable<Comparable>{
	private int value; 

	/**
	*pre: New value to compare
	*Post: the object acquires a value
	* @param value
	**/
	public Comparable(int value){
		this.value = value;
	}

	/**
	*pre: A new Comparable object is going to be compared
	@param value
	*post: Object's values are subtracted
	@return this.value - value.getValue()
	**/
	public int compareTo(Comparable value){
		return (this.value -value.getValue());
	}

	/**
	pre: Get the value
	post: the value itself
	**/
	public int getValue(){
		return this.value;
	}

	/**
	pre: must have value's value(attribute)
	post: change the value
	**/
	public void setValor(int value){
		this.value = value;
	}
}
