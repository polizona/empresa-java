package empresa;
import java.util.Scanner; //para leer entradas del teclado

public class empresa {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//atributos	
	 balance mibalance = new balance();
  	 almacen insumoA = new almacen();
	 almacen insumoB = new almacen();
	 int operacion;
	 char almacen;
	 
		System.out.println("selecciona la operacion:");
		System.out.println("1: recepción de embarque");
		System.out.println("2: genera orden de trabajo");
		Scanner entrada = new Scanner(System.in); //prepara una entrada de teclado
	    operacion = entrada.nextInt();  //lee un entero del teclado y lo asigna a operacion
	    entrada.reset(); //limpia la entrada para capturar otra
	    if(operacion==1) 
	       { System.out.println("selecciona el almacén (A/B):");
	         almacen=entrada.next().charAt(0);
	         if(almacen=='A') {insumoA.inventario= new embarque();
	         				   mibalance.insumoA=mibalance.insumoA+insumoA.inventario.precio;
	         				   System.out.println(mibalance.insumoA);  }
	         else if (almacen=='B'){insumoB.inventario= new embarque();
			   		mibalance.insumoB=mibalance.insumoB+insumoB.inventario.precio;
			   		System.out.println(mibalance.insumoB);}
	         	  else {System.out.println ("almacen inválido");}
	       }
	    else if(operacion==2) {System.out.println("operación 2: ");}
	         else {System.out.println("operación inválida");}
	    entrada.close(); //cierra el lector del teclado
	}
}
