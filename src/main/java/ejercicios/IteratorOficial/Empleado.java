package ejercicios.IteratorOficial;

public class Empleado {
    private String nombre;
    private String cargo;
    private String ci;
    public Empleado(){
    }

    public Empleado(String nombre, String cargo, String ci) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void showEmpleado(){
        System.out.println("-------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cargo: "+cargo);
        System.out.println("CI: "+ci);

    }
}
