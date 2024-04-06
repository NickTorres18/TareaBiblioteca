public class APP {
    public static void inicializar() {
        Biblioteca biblioteca = new Biblioteca();
        RecursosDigitales recurso1=new Libro("Libro1","","","",biblioteca);

        RecursosDigitales recurso2=new TesisGrado("Tesis","","","",biblioteca);
        Usuario usuario1=new Estudiante("Luis",biblioteca);
        Usuario usuario2= new Profesor("",biblioteca);


        biblioteca.asignarRecurso(recurso1);
        biblioteca.asignarRecurso(recurso2);




        System.out.println(biblioteca.buscarRecurso("Libro1"));
        biblioteca.realizarPrestamo("Libro1",recurso1,usuario1,"03/07/2024");
        biblioteca.realizarDevolucion("Tesis1",recurso2);
        System.out.println( recurso1.toString());

















    }


    public static void main(String[] args) {
        inicializar();
    }


}








