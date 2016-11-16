package ull.patrones.adaptador;
/**
 * 
 * @author Clase aportada por el "cliente"
 *
 */
public interface IArray {
	public void anadir(int valor);
	public void eliminar (int posicion);
	public void vaciar ();
	public boolean esVacio();
	public int tamano();
	public int primero();
	public int ultimo();
	public int devolverPosicion(int posicion);
}
