package ull.patrones.adaptador.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ull.patrones.adaptador.ListaAdapterJava;
import ull.patrones.adaptador.MiArrayClase;

public class TestLista
{
	private ListaAdapterJava m_adapta;
	private MiArrayClase m_array ;
	@Before
	public void configuracion() 
	{
		m_array= new MiArrayClase();
		for (int i = 0; i < 10; i++)
		{
			m_array.anadir(i);
		}
		m_adapta = new ListaAdapterJava(m_array);
	}
	@Test
	public void testAdaptayToArray()//compruba que si lo adapta y de paso que funciona el método toArray
	{
		Object [] t_obj = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertArrayEquals(t_obj, m_adapta.toArray());
	}
	@Test
	public void anade()
	{
		m_adapta.add(5);
		Object [] t_obj = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,5};
		assertArrayEquals(t_obj, m_adapta.toArray());
	}
	@Test
	public void anadeEnPosicion()
	{
		m_adapta.add(5,00);
		Object [] t_obj = { 0, 1, 2, 3, 4, 00,5, 6, 7, 8, 9};
		assertArrayEquals(t_obj, m_adapta.toArray());
	}
	@Test 
	public void elimina()
	{
		m_adapta.remove(10);
		Object [] t_obj = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
		assertArrayEquals(t_obj, m_adapta.toArray());
	}
	@Test
	public void tamano()
	{
		assertEquals(10, m_adapta.size());
	}
	@Test
	public void vaciar()
	{
		m_adapta.clear();
		assertEquals(true, m_adapta.isEmpty());
	}
	@Test 
	public void setear()
	{
		m_adapta.set(5, 10);
		Object [] t_obj = { 0, 1, 2, 3, 4, 10, 6, 7, 8, 9};
		assertArrayEquals(t_obj, m_adapta.toArray());
	}
	@Test
	public void contieneColeccion()
	{

		ArrayList<Integer> t_array = new ArrayList<>();
		for(int i = 3;i <7;i++){
			t_array.add(i);
		}
		assertEquals(true, m_adapta.containsAll(t_array));
	}
	@Test
	public void listIterator()
	{
		ArrayList<Integer> t_array = new ArrayList<>();
		for(int i = 0;i <10;i++){
			t_array.add(i);
		}
		
		assertEquals(t_array.listIterator(), m_adapta.listIterator());
	}
	@Test
	public void obtenerPrimerElementoEncontrado()
	{
		assertEquals(5, m_adapta.indexOf(5));
	}
	@Test
	public void obtenerUltimoElementoEncontrado()
	{
		assertEquals(5, m_adapta.indexOf(5));
	}
	@Test 
	public void subLista()
	{
		Object [] t_obj = { 0, 1, 2};
		assertArrayEquals(t_obj, m_adapta.subList(0, 3).toArray());
	}
}
