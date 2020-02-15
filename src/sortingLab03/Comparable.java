/**
 * 
 */
package sortingLab03;

/**
 * @author olivverde
 *
 */
public class Comparable implements IComparable<Comparable>{
	private int value; 

	/**
	*pre: Un nuevo valor a comparar
	*Post: el objeto obtiene su valor
	* @param nuevoVal
	**/
	public Comparable(int value){
		this.value = value;
	}

	/**
	*pre: Un nuevo objeto, de tipo compare, se comparara
	@param compaVal es el nuevo objeto
	*post: Se restan los valores de los objetos y 
	@return ese resultado
	**/

	public int compareTo(Comparable value){
		return (this.value -value.getValue());
	}

	/**
	pre: obtendra el valor
	post: el valor del objeto
	**/
	public int getValue(){
		return this.value;
	}

	/**
	pre: debe de tener el valor del atributo valor
	post: cambiar el del atributo valor
	**/
	public void setValor(int value){
		this.value = value;
	}
}
