/**
 * 
 */
package sortingLab03;

import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * @author olivverde
 *
 */
public class Test {

	public void merge(){
		MergeSorting merge = new MergeSorting();
		ArrayList<Comparable> dato = new ArrayList<Comparable>();
		ArrayList<Comparable> dados = new ArrayList<Comparable>();
		ArrayList<Comparable> esperados = new ArrayList<Comparable>();
		
		ArrayList<String> orden = new ArrayList<String>();
		ArrayList<String> pronto = new ArrayList<String>();

		//Datos que son dados
		dato.add(new Comparable(6));
		dato.add(new Comparable(2));
		dato.add(new Comparable(4));
		dato.add(new Comparable(9));
		dato.add(new Comparable(1));

		//Datos que se esperan
		esperados.add(new Comparable(1));
		esperados.add(new Comparable(2));
		esperados.add(new Comparable(4));
		esperados.add(new Comparable(6));
		esperados.add(new Comparable(9));
		
		dados = merge.sorting(dato, 5);
		
		for(int i=0; i<dato.size(); i++) {
			orden.add(dados.get(i).toString());
			pronto.add(esperados.get(i).toString());
		} assertEquals(pronto, orden);
	} 
}
