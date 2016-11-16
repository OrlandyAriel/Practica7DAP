package ull.patrones.adaptador;

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
	@Override
	public boolean add(Integer e)
	{
		return false;
	}

	@Override
	public void add(int index, Integer element)
	{
		
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c)
	{
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c)
	{
		return false;
	}

	@Override
	public void clear()
	{
		
	}

	@Override
	public boolean contains(Object o)
	{
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c)
	{
		return false;
	}

	@Override
	public Integer get(int index)
	{
		return null;
	}

	@Override
	public int indexOf(Object o)
	{
		return 0;
	}

	@Override
	public boolean isEmpty()
	{
		return false;
	}

	@Override
	public Iterator<Integer> iterator()
	{
		return null;
	}

	@Override
	public int lastIndexOf(Object o)
	{
		return 0;
	}

	@Override
	public ListIterator<Integer> listIterator()
	{
		return null;
	}

	@Override
	public ListIterator<Integer> listIterator(int index)
	{
		return null;
	}

	@Override
	public boolean remove(Object o)
	{
		return false;
	}

	@Override
	public Integer remove(int index)
	{
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c)
	{
		return false;
	}

	@Override
	public Integer set(int index, Integer element)
	{
		return null;
	}

	@Override
	public int size()
	{
		return 0;
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex)
	{
		return null;
	}

	@Override
	public Object[] toArray()
	{
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a)
	{
		return null;
	}
	
}
	
