package ull.patrones.adaptador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * 
 * @author Orlandy Ariel Sánchez A.
 *
 */
public class ListaAdapterJava implements List<Integer>
{
	private IArray m_array;
	
	public ListaAdapterJava(IArray a_array)
	{
		m_array = a_array;
	}
	@Override
	public boolean add(Integer e)
	{
		 m_array.anadir(e);
		return true;
	}

	@Override
	public void add(int index, Integer element)
	{
		anade(index, element);
	}
	/**
	 * Método crea un ArrayList con los elementos de IArray
	 * @param index
	 * @param element
	 */
	private void anade(int index, Integer element)
	{
		ArrayList<Integer>t_arrayList =obtenerArrayListDeIArray();
		
		t_arrayList.add(index, element);
		m_array.vaciar();
		remplazaArray(t_arrayList);
	}
	/**
	 * Método para transformar IArray a ArrayList
	 * @return, devuelve una copia del IArray convertida en ArrayList
	 */
	private ArrayList<Integer> obtenerArrayListDeIArray()
	{
		ArrayList<Integer>t_arrayList = new ArrayList<>();
		for (int i = 0; i < m_array.tamano(); i++)
		{
			t_arrayList.add(m_array.devolverPosicion(i));
		}
		return t_arrayList;
	}
	/**
	 * Reemplaza los elementos de IArray por una lista
	 * @param a_list, lista por la que se reemplazará IArray
	 */
	private void remplazaArray(List<Integer> a_list)
	{
		for (int i = 0; i <a_list.size() ; i++)
		{
			m_array.anadir(a_list.get(i));
		}
	}
	@Override
	public boolean addAll(Collection<? extends Integer> c)
	{
		ArrayList<Integer> t_array = (ArrayList<Integer>) c;
		int tam = m_array.tamano();
		remplazaArray(t_array);
		return aCambiado(tam, m_array.tamano());
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c)//mirar 
	{
		ArrayList<Integer> t_array = obtenerArrayListDeIArray();
		int tam=m_array.tamano();
		t_array.addAll(index,c);
		
		m_array.vaciar();
		remplazaArray(t_array);
		return aCambiado(tam, m_array.tamano());
	}

	@Override
	public void clear()
	{
		m_array.vaciar();
	}

	@Override
	public boolean contains(Object o)
	{
		int t_obj = (int) o;
		boolean t_result = false;
		for (int i = 0; i <m_array.tamano(); i++)
		{
			if(m_array.devolverPosicion(i)==t_obj)
			{
				t_result = true;
				i= m_array.tamano();
			}
		}
		return t_result;
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		ArrayList<Integer> t_array = (ArrayList<Integer>) c;
		boolean t_result = false;
		for (int i = 0; i < t_array.size(); i++)
		{
			t_result=contains(t_array.get(i));
		}
		return t_result;
	}

	@Override
	public Integer get(int index)
	{
		return m_array.devolverPosicion(index);
	}

	@Override
	public int indexOf(Object o)
	{
		int t_result = -1;
		int t_obj = (int) o;
		for (int i = 0; i < m_array.tamano(); i++)
		{
			if(m_array.devolverPosicion(i)==t_obj)
			{
				t_result = i;
				i= m_array.tamano();
			}
		}
		return t_result;
	}

	@Override
	public boolean isEmpty()
	{
		return m_array.esVacio();
	}

	@Override
	public Iterator<Integer> iterator()
	{
		ArrayList<Integer> t_arrayList = obtenerArrayListDeIArray();
		return t_arrayList.iterator();
	}

	@Override
	public int lastIndexOf(Object o)
	{
		int t_result = -1;
		int t_obj = (int) o;
		for (int i =  m_array.tamano(); i >=0; i--)
		{
			if(m_array.devolverPosicion(i)==t_obj)
			{
				t_result = i;
				i= 0;
			}
		}
		return t_result;
	}

	@Override
	public ListIterator<Integer> listIterator()
	{
		ArrayList<Integer> t_arrayList =obtenerArrayListDeIArray();
		return t_arrayList.listIterator();
	}

	@Override
	public ListIterator<Integer> listIterator(int index)
	{
		ArrayList<Integer> t_arrayList = obtenerArrayListDeIArray();
		return t_arrayList.listIterator();
	}

	@Override
	public boolean remove(Object o)
	{
		int t_obj = (int) o;
		boolean t_result = false;
		for (int i = 0; i <m_array.tamano(); i++)
		{
			if(m_array.devolverPosicion(i)==t_obj)
			{
				t_result = true;
				m_array.eliminar(i);
				i= m_array.tamano();
			}
		}
		return t_result;
	}

	@Override
	public Integer remove(int index)
	{
		int t_result = m_array.devolverPosicion(index);
		m_array.eliminar(index); 
		return t_result;
	}

	@Override
	public boolean removeAll(Collection<?> c) 
	{
		ArrayList<Integer> t_array = (ArrayList<Integer>) c;
		int tam = m_array.tamano();
		for (int i = 0; i < t_array.size(); i++)
		{
			remove((Object)t_array.get(i));
		}
		
		return aCambiado(tam, m_array.tamano());
	}
	/**
	 * Función para comprobar si ha habido cambios
	 * @param antes, tamaño antes de ejecutar una acción
	 * @param despues, tamaño despues de ejecutar una acción
	 * @return
	 */
	private boolean aCambiado(int antes, int despues)
	{
		return (antes!=despues)?false:true;
	}
	@Override
	public boolean retainAll(Collection<?> c)
	{
		ArrayList<Integer> t_array = (ArrayList<Integer>) c;
		int tam = m_array.tamano();
		for (int i = 0; i < t_array.size(); i++)
		{
			if(!contains((Object)t_array.get(i)))
			{
				remove((Object)t_array.get(i));
			}
		}
		return aCambiado(tam, m_array.tamano());
	}

	@Override
	public Integer set(int index, Integer element)
	{
		ArrayList<Integer> t_arr = obtenerArrayListDeIArray();
		t_arr.set(index, element);
		m_array.vaciar();
		
		remplazaArray(t_arr);
		return element;
	}

	@Override
	public int size()
	{
		return m_array.tamano();
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex)
	{
		ArrayList<Integer> t_arr = new ArrayList<>(Math.abs(fromIndex-toIndex));
		for (int i = fromIndex; i < toIndex; i++)
		{
			t_arr.add(m_array.devolverPosicion(i));
		}
		return t_arr;
	}

	@Override
	public Object[] toArray()
	{
		return toArrayPrivado(obtenerArrayListDeIArray().toArray());
	}
	/**
	 * Método para obtener un array apartir de uno pasado por parámetro
	 * @param a
	 * @return
	 */
	private Object[] toArrayPrivado(Object[] a)
	{
		Object [] t_obj = new Object[a.length];
		for (int i = 0; i < a.length; i++)
		{
			t_obj[i] = a[i];
		}
		return t_obj;
	}

	@Override
	public <T> T[] toArray(T[] a)//mirar 
	{
		return obtenerArrayListDeIArray().toArray(a);
		
	}
	@Override
	public String toString()
	{
		String t_result = "[ "+m_array.devolverPosicion(0);
		for (int i = 1; i < m_array.tamano(); i++)
		{
			t_result += ", "+m_array.devolverPosicion(i);
		}
		t_result += "]";
		return t_result;
	}
}
	
