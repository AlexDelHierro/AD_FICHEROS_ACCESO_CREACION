package Tareas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



class Escritor{
	
	public void escritura(){
		
	Scanner scanner = new Scanner (System.in); //Creamos el scanner para que el usuario pueda insertar sus datos
	
	File escribir = new File("C:\\Users\\Campus FP\\Desktop\\AD\\ListaTareas2.txt"); //Creamos el nuevo archivo con su direccion, nombre y extension
	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(escribir))){ //Con el BufferedWriter y el FileWriter conseguios que se cree un archivo en el que va a escribir el usuario
		
		
		
		System.out.println("Escribe las tareas\n");
		
		while (true) { // Hacemos un while en el que mientras se cumpla lo aterior ira añadiendo lineas de texto al archivo y cuando se escriba fin se cerrara el archivo 
			
			String escribir1 = scanner.nextLine();
			
			if (escribir1.equalsIgnoreCase("fin")) { //Si el usuario inroduce fi se cierra el bucle y el archivo
				break;
			}
			bw.write(escribir1);
			bw.newLine();
		}
		System.out.println("Tareas guardadas en ListaTareas2.txt");
		
	}	catch (IOException e) {
		e.printStackTrace();
	}
	}

}


public class Tareas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escritor escritor = new Escritor();//Creamos objeto
		
		escritor.escritura();//LLamamos al metodo
		
	}

}


