package ull.patrones.adaptador;

public class MiArrayClase implements IArray {
	private int[] v;
	private int tam;
	
	public MiArrayClase(){
		v = new  int [100];
		vaciar();
	}
	@Override
	public void anadir(int valor) {
		v[tam]=valor;
		tam++;
	}
	@Override
	public void eliminar(int posicion) {
		for (int i=posicion;i<99;i++)
		{
			v[i]=v[i+1];
		}
		tam--;
	}
	@Override
	public void vaciar() {
		for (int i=0;i<100;i++)
		{
			v[i]=0;
		}
		tam=0;
	}

	@Override
	public boolean esVacio() {
		if(tam==0)
		{
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public int tamano() {
		return tam;
	}

	@Override
	public int primero() {
		return v[0];
	}

	@Override
	public int ultimo() {
		return v[tam-1];
	}

	@Override
	public int devolverPosicion(int posicion) {
		return v[posicion];
	}
}
