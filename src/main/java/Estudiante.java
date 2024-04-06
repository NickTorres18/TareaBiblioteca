public class Estudiante extends Usuario {
	public Estudiante(String nombre, Biblioteca biblioteca) {
		super(nombre, biblioteca);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}