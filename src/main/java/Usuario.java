public abstract class Usuario {
	private String nombre;
	public Biblioteca biblioteca;

	public Usuario(String nombre, Biblioteca biblioteca) {
		this.nombre = nombre;
		this.biblioteca = biblioteca;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String getTipo();
}