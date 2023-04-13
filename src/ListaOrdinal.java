

public class ListaOrdinal {
    private Nodo inicio, fin;
    private int numElementos;

    public ListaOrdinal() {
        inicio = null;
        fin = null;
        numElementos = 0;
    }
    public ListaOrdinal(int[] elementos){
        inicio = new Nodo(elementos[0],null);
        Nodo actual= inicio;
        for (int i=1;i<elementos.length;i++){
            Nodo aux= new Nodo(elementos[i],null);
            actual.setSiguiente(aux);
            actual = actual.getSiguiente();
        }
    }
    public boolean vacia() {return inicio == null;    }

    /**
     * Inserta el dato en la última posición de la lista
     */
    public void insertar(int dato) {
        // Crear un nodo nuevo
        Nodo nuevo = new Nodo(dato, null);
        // Insertar el nodo al final de la lista enlazada
        if (this.vacia()) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        numElementos++;
    }


    /**
     * Busca el dato que ocupa la posición recibida como parámetro,
     * Si no existe esa posición, el resultado es impredecible.
     */
    public int getElemento(int posicion) {
        // Avanzar en la lista tantos elementos como el parámetro posicion
        Nodo actual = inicio;   // referencia auxiliar para recorrer la lista
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    /**
     * Borra el primer elemento de la lista cuyo dato coincide con el
     * parámetro recibido, si existe.
     */
    public boolean borrar(int dato) {
        Nodo actual = inicio;
        Nodo anterior = null;
        while (actual != null && actual.getDato() != dato) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if (actual != null) {  // dato encontrado. Borrar nodo actual
            if (actual == inicio) {   // Borrar el primero de la lista
                inicio = actual.getSiguiente();
            } else {  // Borrar nodo que no es el primero
                anterior.setSiguiente(actual.getSiguiente());
            }
            if (actual == fin) {  // Se ha borrado el último de la lista
                fin = anterior;
            }
            numElementos--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devuelve la primera posición en la que se encuentra el dato,
     * en caso de existir. En caso contrario, devuelve -1
     */
    public int posicion(int dato) {
        Nodo actual = inicio;
        int pos = 0;
        while (actual != null && actual.getDato()!=dato) {
            actual = actual.getSiguiente();
            pos++;
        }
        if (actual != null) {  // Dato encontrado
            return pos;
        } else {
            return -1;
        }
    }

    /**
     * Determina si el dato recibido como parámetro existe en la lista.
     */
    public boolean contiene(int dato) {
        return this.posicion(dato) >= 0;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public Iterador getIterador() {
        return new Iterador(inicio);
    }

    public void mostrar() {
        if (this.vacia()) {
            System.out.println("Lista vacía");
        } else {
            Nodo actual = inicio;
            while (actual != null) {
                System.out.println(actual.getDato());
                actual = actual.getSiguiente();
            }
            System.out.println();
        }
    }
    public void Ejercicio1(){
        Nodo act = inicio;
        Nodo aux = inicio;
        while (act!=null){
            if(act.getDato()%2!=0){
                aux.setSiguiente(act.getSiguiente());
                if(act == inicio){
                    inicio=inicio.getSiguiente();
                }
            }else {
                aux = new Nodo(act.getDato(),act.getSiguiente());
                act.setSiguiente(aux);
                act = act.getSiguiente();

            }
            act= act.getSiguiente();
        }

    }
    public void eliminarrepetidos(int dato){
        boolean encontrado = false;
        Nodo act= inicio;
        Nodo aux = inicio;
        while (act!=null){
             if (act.getDato()==dato && encontrado) {
                aux.setSiguiente(act.getSiguiente());

            }else if(act.getDato()==dato){
                encontrado= true;

            }else{
                 aux= act;

             }
            act = act.getSiguiente();
        }
    }
    public void triplicar(){
        Nodo aux=null;
        Nodo aux2=null;
        Nodo act = inicio;
       while (act!=null){
            aux2 = new Nodo(act.getDato(), act.getSiguiente());
            aux = new Nodo(act.getDato(), aux2);

            act.setSiguiente(aux);
            act = aux2.getSiguiente();
        }
    }
    public void Ejercicio11(){
        Nodo act=inicio;
        int sum=0;
        while (act!=null){
            sum+=  act.getDato();
            act=act.getSiguiente();
        }
        act = inicio;
        while ((act!=null)){
            if(act.getDato()==sum){
                Nodo aux= new Nodo(0,act.getSiguiente());
                act.setSiguiente(aux);
            }
            act=act.getSiguiente();
        }
    }
    public void insertaracontinuacion(int dato,int nuevo){
        Nodo act= inicio;
        while (act!=null){
            if(act.getDato()==dato){
                Nodo aux = new Nodo(nuevo,act.getSiguiente());
                act.setSiguiente(aux);
                act = aux.getSiguiente();
            }else
            act=act.getSiguiente();
        }
    }
    public ListaOrdinal crearlistasumaparejas(){
        ListaOrdinal listaOrdinal = new ListaOrdinal();
        Nodo act= inicio;
        while (act!= null && act.getSiguiente()!=null){
            listaOrdinal.insertar(act.getDato()+act.getSiguiente().getDato());
            act = act.getSiguiente().getSiguiente();
        }
        return listaOrdinal;
    }
    public void borrarduplicar(int dato){
        Nodo aux=inicio;
        Nodo act = inicio;
        boolean encontrado=false;
        while (act!=null){
            if(act.getDato()==dato && !encontrado){
                aux.setSiguiente(act.getSiguiente());
                act = aux.getSiguiente();
                encontrado=true;

            } else if (act.getDato()==dato && encontrado) {
                aux = new Nodo(act.getDato(),act.getSiguiente());
                act.setSiguiente(aux);
                act = aux.getSiguiente();
            } else {
                aux=act;
                act=act.getSiguiente();
            }
        }
    }
}
