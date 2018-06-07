package patrones_creacionales;

public class Instituto extends CentroEstudios {

	private boolean tieneCicloSuperior;
	private boolean tieneCicloMedio;

	public boolean isTieneCicloSuperior() {
		return this.tieneCicloSuperior;
	}

	public void setTieneCicloSuperior(boolean _tieneCicloSuperior) {
		this.tieneCicloSuperior = _tieneCicloSuperior;
	}

	public boolean isTieneCicloMedio() {
		return this.tieneCicloMedio;
	}

	public void setTieneCicloMedio(boolean _tieneCicloMedio) {
		this.tieneCicloMedio = _tieneCicloMedio;
	}

}
