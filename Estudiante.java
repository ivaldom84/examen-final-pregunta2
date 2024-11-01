class Estudiante extends Persona {
    private String carrera;
    private String matricula;

    public Estudiante(String nombre, int edad, String carrera, String matricula) {
        super(nombre, edad);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera + ", Matrícula: " + matricula);
    }
}

