public class Alumno {
    private String nombre;
    private String direccion;

    public Alumno(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void mostrar() {
        System.out.println ("Nombre: " + nombre + "   Direccion: " + direccion);
    }
}
