public class ColaPrioridades {
    private NodoP inicio;
    public ColaPrioridades(){

    }
    public boolean vacia() {
        return this.inicio == null;
    }
    public String desencolar() {
        String resultado = "null";
        if (this.inicio == null) {
            System.out.println("Error, la cola está vacía");
        } else {
            NodoP nodo = this.inicio;
            this.inicio = nodo.getSiguiente();
            resultado = nodo.getPaciente();
        }

        return resultado;
    }
    public void encolar(String paciente, int prioridad){
        NodoP act=inicio;
        NodoP aux;
        this.mostrar();
        if(inicio==null){
            inicio = new NodoP(prioridad,paciente,null);
        }else{
            act = inicio;
            while (act.getSiguiente()!=null && act.getSiguiente().getPrioridad()<prioridad){
                act = act.getSiguiente();
            }
            aux = new NodoP(prioridad,paciente,act.getSiguiente());
            if(act == inicio && inicio.getPrioridad() > prioridad){
                inicio = new NodoP(prioridad,paciente,act);
            }else {
                act.setSiguiente(aux);
            }


        }
    }






    public void mostrar() {
        System.out.println("Contenido de la cola: ");

        for(NodoP auxiliar = this.inicio; auxiliar != null; auxiliar = auxiliar.getSiguiente()) {
            System.out.println(auxiliar.getPaciente() + "  " + auxiliar.getPrioridad());
        }

        System.out.println("FIN");
    }

}
