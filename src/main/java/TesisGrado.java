public class TesisGrado extends RecursosDigitales {
	public TesisGrado(String nombre, String autor, String fechapublicacion, String clasificacion, Biblioteca biblioteca) {
		super(nombre, autor, fechapublicacion, clasificacion, biblioteca);
	}

	public String mostrarInformacion() {
		String informacion=super.getNombre()+super.getAutor()+super.getFechapublicacion()+super.getClasificacion();

		return informacion;
	}
}