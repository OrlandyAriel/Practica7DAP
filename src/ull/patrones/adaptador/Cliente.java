package ull.patrones.adaptador;

import java.util.ArrayList;
import java.util.ListIterator;
/**
 * 
 * @author Orlandy Ariel Sánchez A.
 *
 */
public class Cliente
{
	public static void main(String[] args)
	{
		//creo array de MiArrayCase de prueba e inserto datos
		MiArrayClase array = new MiArrayClase();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < 10; i++)
		{
			array.anadir(i);
			a.add(i);
		}
		ListaAdapterJava adapta = new ListaAdapterJava(array);
		System.err.println(adapta);
		ListIterator<Integer> b =adapta.listIterator();
		ListIterator<Integer> c = a.listIterator();
		while(c.hasNext())
		{
			System.err.println(c.next());
		}
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
	}
}
