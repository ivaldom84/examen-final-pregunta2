public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", 20, "Ingeniería", "20230123");
        Administrativo administrativo = new Administrativo("Juan", 35, "Secretario", "Administración");
        Docente docente = new Docente("Carlos", 40, "Matemáticas", 15);

        estudiante.mostrarInfo();
        administrativo.mostrarInfo();
        docente.mostrarInfo();
    }
}
