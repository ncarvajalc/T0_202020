package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Crear Arreglo Dinamico de Integers");
			System.out.println("2. Agregar Integer");
			System.out.println("3. Buscar Integer");
			System.out.println("4. Eliminar Integer");
			System.out.println("5. Imprimir el Arreglo");
			System.out.println("6. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			System.out.print("[ ");
			for(int i = 0; i < modelo.darTamano(); i++)
			{
				System.out.print(modelo.darElemento(i)+ " ");
			}
			
			System.out.println("]");
		}
}
