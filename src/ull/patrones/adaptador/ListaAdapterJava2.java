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
public class ListaAdapterJava2 implements List<Integer>
{
	private IArray m_array;
	private ArrayList<Integer> m_arrayList;
	public ListaAdapterJava2(IArray a_array)
	{
		m_array = a_array;
		m_arrayList = new ArrayList<>();
		convertirIArrayAArrayList();
	}
	/**
	 * Método para convertir un IArray a un ArrayList
	 */
	private void convertirIArrayAArrayList()
	{
		for (int i = 0; i < m_array.tamano(); i++)
		{
			m_arrayList.add(m_array.devolverPosicion(i));
		}
	}
	/*private void convertriArrayListAIarray()
	{
		m_array.vaciar();
		for (int i = 0; i < m_arrayList.size(); i++)
		{
			m_array.anadir(m_arrayList.get(i));
		}
	}*/
	
	@Override
	public boolean add(Integer e)
	{
		return m_arrayList.add(e);
	}

	@Override
	public void add(int index, Integer element)
	{
		m_arrayList.add(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c)
	{
		return m_arrayList.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c)
	{
		return m_arrayList.addAll(index, c);
	}

	@Override
	public void clear()
	{
		m_arrayList.clear();
	}

	@Override
	public boolean contains(Object o)
	{
		return m_arrayList.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		return m_arrayList.containsAll(c);
	}

	@Override
	public Integer get(int index)
	{
		return m_arrayList.get(index);
	}

	@Override
	public int indexOf(Object o)
	{
		return m_arrayList.indexOf(o);
	}

	@Override
	public boolean isEmpty()
	{
		return m_arrayList.isEmpty();
	}

	@Override
	public Iterator<Integer> iterator()
	{
		return m_arrayList.iterator();
	}

	@Override
	public int lastIndexOf(Object o)
	{
		return m_arrayList.lastIndexOf(o);
	}

	@Override
	public ListIterator<Integer> listIterator()
	{
		return m_arrayList.listIterator();
	}

	@Override
	public ListIterator<Integer> listIterator(int index)
	{
		return m_arrayList.listIterator(index);
	}

	@Override
	public boolean remove(Object o)
	{
		return m_arrayList.remove(o);
	}

	@Override
	public Integer remove(int index)
	{
		return m_arrayList.remove(index);
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		return m_arrayList.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c)
	{
		return m_arrayList.retainAll(c);
	}

	@Override
	public Integer set(int index, Integer element)
	{
		return m_arrayList.set(index, element);
	}

	@Override
	public int size()
	{
		return m_arrayList.size();
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex)
	{
		return m_arrayList.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray()
	{
		return m_arrayList.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		return m_arrayList.toArray(a);
	}
	@Override
	public String toString()
	{
		String t_result = "[ "+m_arrayList.get(0);
		for (int i = 1; i < m_arrayList.size(); i++)
		{
			t_result += ", "+m_arrayList.get(i);
		}
		t_result += "]";
		return t_result;
	}
}
