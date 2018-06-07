package patrones_creacionales;

public class Persona {

	private String nombre;
	private String apellidos;
	private int anoNac;
	private String ciudad;
	private String telefono;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String _apellidos) {
		this.apellidos = _apellidos;
	}

	public int getAnoNac() {
		return this.anoNac;
	}

	public void setAnoNac(int _anoNac) {
		this.anoNac = _anoNac;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String _ciudad) {
		this.ciudad = _ciudad;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String _telefono) {
		this.telefono = _telefono;
	}

}
