package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico implements IArregloDinamico {
	/**
	 * Capacidad maxima del arreglo
	 */
	private int tamanoMax;
	/**
	 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
	 */
	private int tamanoAct;
	/**
	 * Arreglo de elementos de tamaNo maximo
	 */
	private String elementos[ ];

	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * @param max Capacidad maxima inicial
	 */
	public ArregloDinamico( int max )
	{
		elementos = new String[max];
		tamanoMax = max;
		tamanoAct = 0;
	}

	public void agregar( String dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			String [ ] copia = elementos;
			elementos = new String[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		elementos[tamanoAct] = dato;
		tamanoAct++;
	}

	public int darCapacidad() {
		return tamanoMax;
	}

	public int darTamano() {
		return tamanoAct;
	}

	public String darElemento(int i) {
		return elementos[i];
	}

	public String buscar(String dato) {
		String buscado = null;

		for(int i = 0; i < tamanoAct; i++)
		{
			String s = elementos[i];

			if(s.compareTo(dato)== 0)
				buscado = s;
		}

		return buscado;
	}

	public String eliminar(String dato) {
		String buscado = null;
		boolean encontro = false;
		for(int i = 0; i < tamanoAct && !encontro; i++)
		{
			String s = elementos[i];
			
			if(s.compareTo(dato)== 0)
			{
				buscado = s;
				encontro = true;
				for(int j = i+1; j< tamanoAct; j++)
				{
					String siguiente = elementos[j];
					elementos[j-1] = siguiente;
				}
				elementos[elementos.length-1] = null;
				tamanoAct--; 
			}
			
		}
		
		return buscado;
	}

}
