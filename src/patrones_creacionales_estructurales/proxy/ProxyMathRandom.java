package patrones_creacionales_estructurales.proxy;

public class ProxyMathRandom {

	public double numeroAleatorio(double max, double min) {
		double aleatorio = 0;
		aleatorio = Math.floor(Math.random() * (max - min)) + min;
		return aleatorio;
	}
}
