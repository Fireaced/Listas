public class EjerciciosListas {
    public int comprobarUltimo(ListaOrdinal lista){
        Iterador it = lista.getIterador();
        int numele=0;
        int numfinal=0;
        while (it.hasNext()){
            numele++;
          numfinal=  it.next();

        }
        System.out.println(numele + "  "+ numfinal);
        if(numfinal<numele){
            return -1;
        } else if (numfinal>numele) {
            return 1;
        }else return 0;
    }
    public ListaOrdinal interseccion(ListaOrdinal l1, ListaOrdinal l2){
        Iterador it = l1.getIterador();
        ListaOrdinal lista = new ListaOrdinal();
        int act=0;
        while (it.hasNext()){
            act = it.next();
            if(l2.contiene(act) && !lista.contiene(act)){
            lista.insertar(act);
            }
        }
        return lista;
    }
    //ejercicio7


}
