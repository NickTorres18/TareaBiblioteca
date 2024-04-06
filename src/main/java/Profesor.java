public class Profesor extends Usuario {
	public Profesor(String nombre, Biblioteca biblioteca) {
		super(nombre, biblioteca);
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}