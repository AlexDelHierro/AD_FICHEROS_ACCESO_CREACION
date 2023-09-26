package LeerLibros4;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerLibros3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File leerArchivo = new File("C:\\Users\\Campus FP\\Desktop\\AD\\libros.txt"); //Ponemos la ruta del archivo para que nos pueda leer su contenido
		
		try (BufferedReader br = new BufferedReader(new FileReader(leerArchivo))){//Usamos el BufferedReader para leer el archivo de forma eficiente
			
			String lineas;//Declaramos la variable con valor string para poder almacenar texto en ella
			
			while ((lineas = br.readLine()) != null) {//Hacemos un bucle para que mientras la variable lineas no sea nula se muestre por pantalla su contenido
				System.out.println(lineas);
			}
		}	catch (IOException e) {
			
				e.printStackTrace();
		}
		
	}

}
