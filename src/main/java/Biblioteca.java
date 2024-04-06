import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<RecursosDigitales> recursos = new ArrayList<RecursosDigitales>();
	public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();


	public Biblioteca() {
		this.recursos =new ArrayList<RecursosDigitales>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public ArrayList<RecursosDigitales> getRecursos() {
		return recursos;
	}

	public void setRecursos(ArrayList<RecursosDigitales> recursos) {
		this.recursos = recursos;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario asignarUsuario(Usuario usuario){
		this.usuarios.add(usuario);
		return usuario;
	}

	public RecursosDigitales asignarRecurso(RecursosDigitales recursosDigitales) {
		this.recursos.add(recursosDigitales);
		return recursosDigitales;
	}





















	public RecursosDigitales buscarRecurso(String nombre) {
		for(RecursosDigitales recursosDigitales:this.recursos){
			if (recursosDigitales.getNombre().equals(nombre)){
				return  recursosDigitales;
			}
		}
		return null;
	}

	public void realizarPrestamo(String nombre, RecursosDigitales recursosDigitales, Usuario usuario,String fecha) {

			if(recursosDigitales.getNombre().equals(nombre)) {
				this.recursos.remove(recursosDigitales);
				System.out.println("Se a realizado el prestamo de"+" " + recursosDigitales.getNombre()+" "+"El usuario es:"+" "+
						usuario.getNombre()+" "+ "Fecha de devolución:"+" "+fecha
				);

			}







		}







	public void realizarDevolucion(String nombre,RecursosDigitales recursosDigitales) {

			if (recursosDigitales.getNombre().equals(nombre)) {
				this.recursos.add(recursosDigitales);
				System.out.println("Se a realizado la devolución de"+" " + recursosDigitales.getNombre());


			}
		}



}