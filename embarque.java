package empresa;

import java.util.Scanner;

public class embarque {
	//atributos
	int cantidad;
	float precio;
	
	//metodos
	//constructor
	embarque(){ 
		Scanner entrada = new Scanner(System.in); //prepara una entrada de teclado
		System.out.println("cantidad de unidades: ");
	    cantidad = entrada.nextInt();  //lee un entero del teclado y lo asigna a cantidad
	    entrada.reset(); //limpia la entrada para capturar otra
	    System.out.println("precio: ");
	    precio = entrada.nextFloat();  //lee un entero del teclado y lo asigna a cantidad
	    entrada.close(); //limpia la entrada para capturar otra
	    }
}
