public abstract class RecursosDigitales {
	private String nombre;
	private String autor;
	private String fechapublicacion;
	private String clasificacion;
	private Biblioteca biblioteca;

	public RecursosDigitales(String nombre, String autor, String fechapublicacion, String clasificacion, Biblioteca biblioteca) {
		this.nombre = nombre;
		this.autor = autor;
		this.fechapublicacion = fechapublicacion;
		this.clasificacion = clasificacion;

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFechapublicacion() {
		return this.fechapublicacion;
	}

	public void setFechapublicacion(String fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}

	public String getClasificacion() {
		return this.clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public abstract String mostrarInformacion();


	@Override
	public String toString() {
		return "RecursosDigitales{" +
				"nombre='" + nombre + '\'' +
				", autor='" + autor + '\'' +
				", fechapublicacion='" + fechapublicacion + '\'' +
				", clasificacion='" + clasificacion + '\'' +
				", biblioteca=" + biblioteca +
				'}';
	}
}