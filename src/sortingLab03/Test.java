/**
 * @author olivverde
 * @since 09/02/2020
 * @version 15/02/2020
 * 
 * Facility: UVG
 * Class: Algoritmos y estructura de datos
 */
package sortingLab03;

import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * @author olivverde
 *
 */
public class Test {

	@Test
	public void merge(){
		MergeSorting merge = new MergeSorting();
		ArrayList<Comparable> data = new ArrayList<Comparable>();
		ArrayList<Comparable> given = new ArrayList<Comparable>();
		ArrayList<Comparable> expected = new ArrayList<Comparable>();
		
		ArrayList<String> order = new ArrayList<String>();
		ArrayList<String> soon = new ArrayList<String>();

		//Datos que son dados
		data.add(new Comparable(6));
		data.add(new Comparable(2));
		data.add(new Comparable(4));
		data.add(new Comparable(9));
		data.add(new Comparable(1));

		//Datos que se esperan
		expected.add(new Comparable(1));
		expected.add(new Comparable(2));
		expected.add(new Comparable(4));
		expected.add(new Comparable(6));
		expected.add(new Comparable(9));
		
		given = merge.sorting(data, 5);
		
		for(int i=0; i<data.size(); i++) {
			order.add(given.get(i).toString());
			soon.add(expected.get(i).toString());
		} assertEquals(soon, order);
	} 

	@Test
	public void quick(){
		QuickSorting quick = new QuickSorting();
		ArrayList<Comparable> data = new ArrayList<Comparable>();
		ArrayList<Comparable> given = new ArrayList<Comparable>();
		ArrayList<Comparable> expected = new ArrayList<Comparable>();
		
		ArrayList<String> order = new ArrayList<String>();
		ArrayList<String> soon = new ArrayList<String>();

		//Datos que son dados
		data.add(new Comparable(6));
		data.add(new Comparable(2));
		data.add(new Comparable(4));
		data.add(new Comparable(9));
		data.add(new Comparable(1));

		//Datos que se esperan
		expected.add(new Comparable(1));
		expected.add(new Comparable(2));
		expected.add(new Comparable(4));
		expected.add(new Comparable(6));
		expected.add(new Comparable(9));
		
		given = quick.sorting(data, 5);
		
		for(int i=0; i<data.size(); i++) {
			order.add(given.get(i).toString());
			soon.add(expected.get(i).toString());
		} assertEquals(soon, order);
	} 




	@Test
	public void insertion(){
		InsertionSorting insertion = new InsertionSorting();
		ArrayList<Comparable> data = new ArrayList<Comparable>();
		ArrayList<Comparable> given = new ArrayList<Comparable>();
		ArrayList<Comparable> expected = new ArrayList<Comparable>();
		
		ArrayList<String> order = new ArrayList<String>();
		ArrayList<String> soon = new ArrayList<String>();

		//Datos que son dados
		data.add(new Comparable(6));
		data.add(new Comparable(2));
		data.add(new Comparable(4));
		data.add(new Comparable(9));
		data.add(new Comparable(1));

		//Datos que se esperan
		expected.add(new Comparable(1));
		expected.add(new Comparable(2));
		expected.add(new Comparable(4));
		expected.add(new Comparable(6));
		expected.add(new Comparable(9));
		
		given = insertion.sorting(data, 5);
		
		for(int i=0; i<data.size(); i++) {
			order.add(given.get(i).toString());
			soon.add(expected.get(i).toString());
		} assertEquals(soon, order);
	} 


	@Test
	public void radix(){
		RadixSorting radix = new RadixSorting();
		ArrayList<Comparable> data = new ArrayList<Comparable>();
		ArrayList<Comparable> given = new ArrayList<Comparable>();
		ArrayList<Comparable> expected = new ArrayList<Comparable>();
		
		ArrayList<String> order = new ArrayList<String>();
		ArrayList<String> soon = new ArrayList<String>();

		//Datos que son dados
		data.add(new Comparable(6));
		data.add(new Comparable(2));
		data.add(new Comparable(4));
		data.add(new Comparable(9));
		data.add(new Comparable(1));

		//Datos que se esperan
		expected.add(new Comparable(1));
		expected.add(new Comparable(2));
		expected.add(new Comparable(4));
		expected.add(new Comparable(6));
		expected.add(new Comparable(9));
		
		given = radix.sorting(data, 5);
		
		for(int i=0; i<data.size(); i++) {
			order.add(given.get(i).toString());
			soon.add(expected.get(i).toString());
		} assertEquals(soon, order);
	} 


	@Test
	public void selection(){
		SelectionSorting selec = new SelectionSorting();
		ArrayList<Comparable> data = new ArrayList<Comparable>();
		ArrayList<Comparable> given = new ArrayList<Comparable>();
		ArrayList<Comparable> expected = new ArrayList<Comparable>();
		
		ArrayList<String> order = new ArrayList<String>();
		ArrayList<String> soon = new ArrayList<String>();

		//Datos que son dados
		data.add(new Comparable(6));
		data.add(new Comparable(2));
		data.add(new Comparable(4));
		data.add(new Comparable(9));
		data.add(new Comparable(1));

		//Datos que se esperan
		expected.add(new Comparable(1));
		expected.add(new Comparable(2));
		expected.add(new Comparable(4));
		expected.add(new Comparable(6));
		expected.add(new Comparable(9));
		
		given = selec.sorting(data, 5);
		
		for(int i=0; i<data.size(); i++) {
			order.add(given.get(i).toString());
			soon.add(expected.get(i).toString());
		} assertEquals(soon, order);
	} 


}
