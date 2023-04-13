

public class NodoP {

    private int prioridad;
    private String Paciente;
    private NodoP siguiente;

    public NodoP(int dato, String Paciente,NodoP siguiente) {
        this.prioridad = dato;
        this.Paciente = Paciente;
        this.siguiente = siguiente;
    }

    public NodoP getSiguiente() {return siguiente;}

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getPaciente() {return Paciente; }
}
