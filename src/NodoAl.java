public class NodoAl {

    private int clave;
    private Alumno dato;
    private NodoAl siguiente;

    public NodoAl(int clave, Alumno dato, NodoAl siguiente) {
        this.clave = clave;
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoAl getSiguiente() {
        return siguiente;
    }
    public Alumno getDato() {
        return dato;
    }
    public int getClave() {
        return clave;
    }
    public void setSiguiente(NodoAl siguiente) {
        this.siguiente = siguiente;
    }
    public void setDato(Alumno dato) {
        this.dato = dato;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }



}
