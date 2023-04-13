

public class NodoAln {

    private Alumno dato;
    private NodoAln siguiente;

    public NodoAln(Alumno dato, NodoAln siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoAln getSiguiente() {return siguiente;}

    public void setSiguiente(NodoAln siguiente) {
        this.siguiente = siguiente;
    }

    public Alumno getDato() {
        return dato;
    }

    public void setDato(Alumno dato) {
        this.dato = dato;
    }
}
