package ull.patrones.adaptador;

import java.util.ArrayList;

public class Cliente
{
	public static void main(String[] args)
	{
		//creo array de MiArrayCase de prueba e inserto datos
		MiArrayClase array = new MiArrayClase();
		for (int i = 0; i < 10; i++)
		{
			array.anadir(i);
		}
		ListaAdapterJava adapta = new ListaAdapterJava(array);
		System.out.println("Muestra que se convierte: "+adapta);
		
		Object [] arrayTo = adapta.toArray();
		System.err.print("\ntoArray: [");
		for (int i = 0; i < arrayTo.length; i++)
		{
			System.err.print( ", "+arrayTo[i]);
		}
		System.err.print("]\n");
		ArrayList<Integer> subList = (ArrayList<Integer>) adapta.subList(2, 6);
		System.out.println("muestra subList: "+subList);
		adapta.set(5, 10);
		adapta.set(3, 10);
		System.err.println("set 10 en la pos:5 y set 10 en la pos:3"+ adapta);
		System.out.println("contiene el objeto 10: "+adapta.contains((Object) 10));
		
		adapta.add(8, 0);
		System.err.println("añade en la pos:8 el 0"+adapta);
		System.out.println("primero encontrado en pos: "+adapta.indexOf((Object)10));
		System.err.println("ultimo encontrado en pos: "+adapta.lastIndexOf((Object)10));
	}
}
