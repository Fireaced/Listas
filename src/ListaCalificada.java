
public class ListaCalificada {

    private NodoAl cabecera, centinela;
    private int numElementos;

    public ListaCalificada() {
        centinela = new NodoAl(0, null, null);
        cabecera = new NodoAl(0, null, centinela);
        numElementos = 0;
    }

    public boolean vacia() {
        return cabecera.getSiguiente() == centinela;
    }

    /** Inserta el alumno en la posición que le corresponde según la clave
     */
    public boolean insertar(int clave, Alumno dato) {
        NodoAl anterior = cabecera;
        NodoAl actual = cabecera.getSiguiente();
        centinela.setClave(clave);  // Clave en el centinela
        while (actual.getClave() < clave) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if ((actual == centinela) || (actual.getClave() > clave)) {
            // Insertar antes de actual
            NodoAl nuevo = new NodoAl(clave, dato, actual);
            anterior.setSiguiente(nuevo);
            numElementos++;
            return true;
        } else {
            return false;
        }
    }

    /** Busca la clave en la lista. Si la encuentra devuelve el alumno asociado a dicha clave,
     * y si no la encuentra devuelve NULL.
     */
   /* public Alumno getElemento(int clave) {
        NodoAl actual = cabecera.getSiguiente();
        centinela.setClave(clave);  // Clave en el centinela
        while (actual.getClave() < clave) {
            actual = actual.getSiguiente();
        }
        if ((actual.getClave() == clave) && (actual != centinela)) {
            return actual.getDato();
        } else {
            return null;
        }
    }*/

    /** Determina si la clave recibida como parámetro existe en la lista.
     */
   /* public boolean contiene(int clave) {
        return this.getElemento(clave) != null;
    }*/

    /** Elimina de la lista el alumno con número de matrícula clave,
     * en caso de existir.
     */
    /*public boolean borrar(int clave) {
        NodoAl anterior = cabecera;
        NodoAl actual = cabecera.getSiguiente();
        centinela.setClave(clave);  // Clave en el centinela
        while (actual.getClave() < clave) {  // Buscar clave
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if ((actual == centinela) || (actual.getClave() > clave)) {  // Clave no existe
            return false;
        } else {  // Clave en nodo actual
            anterior.setSiguiente(actual.getSiguiente());
            numElementos--;
            return true;
        }
    }*/

    public int getNumElementos() {
         return numElementos;
    }
    public int eliminarEntre(int n1,int n2){
        int num=0;
    NodoAl act = cabecera;
    NodoAl aux =cabecera;
    while (act!=centinela  ){
        if(act.getClave()<=n2 && act.getClave()>=n1){
            aux.setSiguiente(act.getSiguiente());
            num++;
        }else {
            aux = act;
        }
        act= act.getSiguiente();
    }
    return num;
    }
    public void mostrar() {
        NodoAl aux = cabecera.getSiguiente();
        while (aux != centinela) {
            System.out.print(aux.getClave() + "  ");
            aux = aux.getSiguiente();
        }
    }
    public void insertarMediaMaxDif(){
        Alumno al = new Alumno("Intermedio","");
        NodoAl act=cabecera;
        int diffmax=0;
        int diff;
        while (act!=null && act.getSiguiente()!=null){
            diff = act.getClave() - act.getSiguiente().getClave();

            if(diff<0){
                diff = -diff;
            }
            if(diff>diffmax){
                diffmax=diff;

            }
            act=act.getSiguiente();
        }

        act=cabecera;
        while (act!=null && act.getSiguiente()!=null){
            diff = act.getClave() - act.getSiguiente().getClave();
            if(diff<0){
                diff = -diff;
            }
            if(diff==diffmax){
                NodoAl aux= new NodoAl((act.getClave()+act.getSiguiente().getClave())/2,al,act.getSiguiente());
                act.setSiguiente(aux);
                act=aux.getSiguiente();
            }else {
                act=act.getSiguiente();
            }

        }
    }

}
