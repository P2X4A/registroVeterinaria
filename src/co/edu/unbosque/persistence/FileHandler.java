package co.edu.unbosque.persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

	public static void escribirData(String informacionCitas) throws IOException {
		File archivoPlano = new File("archivoPlano.txt");
		FileWriter archivoEscritor = new FileWriter(archivoPlano);
		BufferedWriter archivoEnMemoria = new BufferedWriter(archivoEscritor);
		archivoEnMemoria.write(informacionCitas);
		archivoEnMemoria.newLine();
		archivoEnMemoria.close();
		archivoEscritor.close();
	}
}
