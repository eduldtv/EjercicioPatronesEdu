package patrones_creacionales_estructurales.proxy;

public class Ejecutable {

	public static void main(String[] args) {
		ProxyMathRandom pmr = new ProxyMathRandom();
		pmr.numeroAleatorio(100, 1);
	}
}
