package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Mensajes mensajesLog = new Mensajes();
		
		Scanner input = new Scanner(System.in);
		
        String raza;
        double peso;
        boolean peligro;
        
        Integer eleccion;

        System.out.println("Vamos a crear un animal");

        try{
        	mensajesLog.logDebug("Inicio del bloque try");
        	  
            System.out.println("Ingrese la raza:");
            raza = input.nextLine();
            
            System.out.println("¿La raza ingresada esta en peligro? Ingrese 'Y' si es así");
            if (input.nextLine().toUpperCase().equals("Y")) {
				peligro = true;
			} else {
				peligro = false;
			}
            
            System.out.println("Ingrese el peso (kg):");
            peso = input.nextDouble();
            input.nextLine();
            
            System.out.println("¿Que tipo de animal es?");
            System.out.println("1 - Perro");
            System.out.println("2 - Gato");
            System.out.println("3 - Canario");
            System.out.println("4 - Pez");
            
            eleccion = input.nextInt();
            input.nextLine();
            
            mensajesLog.logDebug("Finalización del bloque try");
            
        } catch (InputMismatchException iException) {
            
        	mensajesLog.logFatal("No se ingreso un número");
            
            input.close();
            return;
        }
        
        mensajesLog.logDebug("Inicio del bloque switch");
        
        switch (eleccion) {
        
		case 1:
			
			String pelajePerro;
			
			System.out.println("Ingrese el pelaje:");
			pelajePerro = input.nextLine();
			
			Perro perro = new Perro(raza, peso, peligro, pelajePerro);
			
			System.out.println(perro.toString());
			
			break;
		
		case 2:
			
			String pelajeGato;
			
			System.out.println("Ingrese el pelaje:");
			pelajeGato = input.nextLine();
			
			Gato gato = new Gato(raza, peso, peligro, pelajeGato);
			
			System.out.println(gato.toString());
			
			break;
		
		case 3:
			
			String plumas;
			
			System.out.println("Ingrese el tipo de plumas:");
			plumas = input.nextLine();
			
			Canario canario = new Canario(raza, peso, peligro, plumas);
			
			System.out.println(canario.toString());
			
			break;
		
		case 4:
			
			String escamas;
			
			System.out.println("Ingrese el tipo de escamas:");
			escamas = input.nextLine();
			
			Pez pez = new Pez(raza, peso, peligro, escamas);
			
			System.out.println(pez.toString());
			
			break;

		default:
			
			mensajesLog.logError("Elección inválida");
			break;
		}
        
        mensajesLog.logDebug("Finalización del bloque switch");
        
        input.close();
	}

}
