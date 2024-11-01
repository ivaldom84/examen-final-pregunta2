class Administrativo extends Persona {
    private String puesto;
    private String departamento;

    public Administrativo(String nombre, int edad, String puesto, String departamento) {
        super(nombre, edad);
        this.puesto = puesto;
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Administrativo: " + nombre + ", Edad: " + edad + ", Puesto: " + puesto + ", Departamento: " + departamento);
    }
}
