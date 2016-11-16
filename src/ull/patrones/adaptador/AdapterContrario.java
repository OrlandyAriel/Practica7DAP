package ull.patrones.adaptador;

import java.util.List;

/**
 * 
 * @author Orlandy Ariel Sánchez A.
 *
 */
public class AdapterContrario implements IArray
{

	private List<Integer> m_lista;
	public AdapterContrario(List<Integer> a_lista)
	{
		m_lista = a_lista;
	}
	@Override
	public void anadir(int valor)
	{
		m_lista.add(valor);
	}

	@Override
	public void eliminar(int posicion)
	{
		m_lista.remove(posicion);
	}

	@Override
	public void vaciar()
	{
		m_lista.clear();
	}

	@Override
	public boolean esVacio()
	{
		return m_lista.isEmpty();
	}

	@Override
	public int tamano()
	{
		return m_lista.size();
	}

	@Override
	public int primero()
	{
		return	m_lista.get(0);
	}

	@Override
	public int ultimo()
	{
		return m_lista.get(m_lista.size()-1);
	}

	@Override
	public int devolverPosicion(int posicion)
	{
		return m_lista.get(posicion);
	}

}
