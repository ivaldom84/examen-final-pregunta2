class Docente extends Persona {
    private String asignatura;
    private int añosExperiencia;

    public Docente(String nombre, int edad, String asignatura, int añosExperiencia) {
        super(nombre, edad);
        this.asignatura = asignatura;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Docente: " + nombre + ", Edad: " + edad + ", Asignatura: " + asignatura + ", Años de experiencia: " + añosExperiencia);
    }
}

