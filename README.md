# Práctica 7 DAP

#Orlandy Ariel Sánchez A.
Una empresa quiere eliminar todos los usos de un código propio con arrays que se hacen en diferentes implementaciones y utilizar a partir de ahora siempre la clase Lista de java. Sin embargo, existe un gran número de proyectos que utilizan este código por lo que no es viable actualizarlos todos. Sin embargo, quieren contar con alguna propuesta que les permita olvidarse de la existencia de esta implementación desfasada y puedan unificar la utilización de la clase Lista.
Proponga una solución para este problema. A continuación se le proporciona  el código que se pretende actualizar.

Utiliza correctamente el/los patrones adecuados. 6 ptos
Diseña interfaz. 3 ptos.
Informe con todo lo solicitado 1 pto.
## Patrón utilizado: Patrón Adaptador
###Definición
Convierte la interfaz de una clase en otra interfaz que es la que esperan los clientes. Permite que cooperen clasees que de otra forma no podrían por tener interfaces incompatibles.

###Clases aportada por el cliente:
###IArray
```java
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
```
##MiArrayClase
``` java
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
```