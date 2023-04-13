package listaordinal;
public class Algoritmos {

    // EJERCICIO 4
    public int comprobarUltimo(ListaOrdinal lista) {
        int resultado;
        if (lista.vacia()) {
            resultado = 0;
        } else {
            Iterador iterador = lista.getIterador();
            int ultimo = iterador.next();
            int numElementos = 1;
            while (iterador.hasNext()) {
                ultimo = iterador.next();
                numElementos++;
            }
            if (ultimo == numElementos) {
                resultado = 0;
            } else if (ultimo > numElementos) {
                resultado = 1;
            } else {
                resultado = -1;
            }
        }
        return resultado;
    }

    // EJERCICIO 5
    public ListaOrdinal interseccion(ListaOrdinal lista1, ListaOrdinal lista2) {
        ListaOrdinal listaResultado = new ListaOrdinal();
        Iterador it = lista1.getIterador();
        while (it.hasNext()) {
            int elemento = it.next();
            if (lista2.contiene(elemento) && !listaResultado.contiene(elemento)) {
                listaResultado.insertar(elemento);
            }
        }
        return listaResultado;
    }

    // EJERCICIO 20
    public boolean sonAnagramas(String cadena1, String cadena2) {
        ListaOrdinal lista = new ListaOrdinal();
        for (int i = 0; i < cadena1.length(); i++) {
            char car = cadena1.charAt(i);
            lista.insertar((int)car);
        }
        boolean anagrama = true;
        int i = 0;
        while (i < cadena2.length() && anagrama == true) {
            char car = cadena2.charAt(i);
            anagrama = lista.borrar((int)car);
            i++;
        }
        if (!lista.vacia()) {
            anagrama = false;
        }
        return anagrama;
    }
}
