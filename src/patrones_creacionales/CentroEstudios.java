package patrones_creacionales;
import java.util.ArrayList;

public class CentroEstudios {
	protected String nombre;
	protected String localidad;
	protected int anoFun;
	protected String ficheroAlumnos;
	protected ArrayList<Persona> alumnos = new ArrayList<Persona>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String _localidad) {
		this.localidad = _localidad;
	}

	public int getAnoFun() {
		return this.anoFun;
	}

	public void setAnoFun(int _anoFun) {
		this.anoFun = _anoFun;
	}

	public String getFicheroAlumnos() {
		return this.ficheroAlumnos;
	}

	public void setFicheroAlumnos(String _ficheroAlumnos) {
		this.ficheroAlumnos = _ficheroAlumnos;
	}

	public ArrayList<Persona> getAlumnos() {
		return this.alumnos;
	}

	public void setAlumnos(ArrayList<Persona> _alumnos) {
		this.alumnos = _alumnos;
	}

}
