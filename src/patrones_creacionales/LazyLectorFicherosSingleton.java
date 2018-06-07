package patrones_creacionales;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LazyLectorFicherosSingleton {

	private static LazyLectorFicherosSingleton instance;

	private LazyLectorFicherosSingleton() {

	}

	// patron singleton
	public static LazyLectorFicherosSingleton getInstance() {
		if (instance == null) {
			instance = new LazyLectorFicherosSingleton();
		}
		return instance;
	}

	public ArrayList<String> leerFichero(String ruta) {
		ArrayList<String> Texto = new ArrayList<String>();
		String linea = null;
		File archivo = new File("archivo.txt");

		try (FileReader fr = new FileReader(archivo); BufferedReader br = new BufferedReader(fr)) {
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Texto;
	}

}
