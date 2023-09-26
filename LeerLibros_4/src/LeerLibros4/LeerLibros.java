package LeerLibros4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class lector{
		
		public List<String> leerArchivo(String leerArchivo1){
			List<String> lineas = new ArrayList<>(); // Creamos un metodo que coge el archivo y lo convierte en una lista de cadenas que son las diferentes lineas del archivo
		
		try (BufferedReader br = new BufferedReader(new FileReader(leerArchivo1))){ //Usamos el BufferedReader para leer el archivo de forma eficiente
			
			String lineas1;// Declaramos la variable linea para almacenar cada una de las lineas del archivo
			
			while ((lineas1 = br.readLine()) != null) { //Hacemos un bucle while para lea todas las lineas y cuando se acaben deje de leer
				System.out.println(lineas1);//Imprimimos las lineas
			}
		}	catch (IOException e) {
			
				e.printStackTrace();
		}
		return lineas; //Hacemos un return para que nis devuelva la lista de las lineas del archivo
		}
		
}

public class LeerLibros {

	public static void main(String[] args) {
		
		lector lector=new lector();//Creamos un objeto 
		
		List<String> lineas1 = lector.leerArchivo("C:\\Users\\Campus FP\\Desktop\\AD\\libros.txt"); //LLamamos al metodo leerArchivo con la direccion del archivo para que lo tome como argumento
		
		for (String linea : lineas1) {//Hacemos un bucle for para que recorra toda la lista y más tarde nos imprima linea a linea el archvo
			System.out.println(linea);
		}
				
	}
}
