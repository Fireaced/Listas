package listaordinal;
class ListaOrdinal {
    private Nodo inicio, fin;
    private int numElementos;

    public ListaOrdinal() {
        inicio = null;
        fin = null;
        numElementos = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

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
     * en caso de existir.
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
        int posicion = 0;
        while (actual != null && actual.getDato() != dato) {
            actual = actual.getSiguiente();
            posicion++;
        }
        if (actual != null) {  // Dato encontrado
            return posicion;
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
            System.out.println ("Lista vacía");
        } else {
            System.out.print("[ " + inicio.getDato());
            Nodo actual = inicio.getSiguiente();
            while (actual != null) {
                System.out.print(", " + actual.getDato());
                actual = actual.getSiguiente();
            }
            System.out.println(" ]");
        }
    }


    // EJERCICIO 1
    public void duplicarParesQuitarImpares() {
        Nodo actual = inicio;
        Nodo anterior = null;
        while (actual != null) {   // Duplicar nodo actual
            if (actual.getDato() % 2 == 0) {
                Nodo nuevo = new Nodo(actual.getDato(), actual.getSiguiente());
                actual.setSiguiente(nuevo);
                actual = nuevo.getSiguiente();
                anterior = nuevo;
            } else {   // Borrar nodo actual
                if (actual != inicio) {
                    anterior.setSiguiente(actual.getSiguiente());
                } else {
                    inicio = actual.getSiguiente();
                }
                actual = actual.getSiguiente();
            }
        }
    }


    //EJERCICIO 2
    public void eliminarRepetidos(int dato) {
        Nodo actual = inicio;
        Nodo anterior;
        while (actual != null && actual.getDato() != dato) {
            actual = actual.getSiguiente();
        }
        if (actual != null) {  // Encontrada primera ocurrencia de dato
            anterior = actual;
            actual = actual.getSiguiente();
            while (actual != null) {
                if (actual.getDato() == dato) {  // Eliminar nodo actual
                    anterior.setSiguiente(actual.getSiguiente());
                    actual = actual.getSiguiente();
                } else {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
            }
        }
    }

    // EJERCICIO 3
    public void triplicar() {
        Nodo actual = inicio;
        while (actual != null) {
            Nodo nuevo1 = new Nodo(actual.getDato(), actual.getSiguiente());
            Nodo nuevo2 = new Nodo(actual.getDato(), nuevo1);
            actual.setSiguiente(nuevo2);
            actual = nuevo1.getSiguiente();
        }
    }


    //EJERCICIO 9
    public boolean contiene2(int valor) {
        Nodo anterior = null;
        Nodo actual = inicio;
        while (actual != null && actual.getDato() != valor) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if (actual != null) {   // Encontrado
            if (actual != inicio) {  // No es el primero de la lista
                anterior.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(inicio);
                inicio = actual;
            }
            return true;
        } else {
            return false;
        }
    }

    // EJERCICIO 10
    public void imagenEspecular() {
        Nodo actual = inicio;
        while (actual != null) {
            Nodo nuevo = new Nodo(actual.getDato(), inicio);
            inicio = nuevo;
            actual = actual.getSiguiente();
        }
    }

    // EJERCICIO 11
    public void insertarCeros() {
        int suma = 0;
        Nodo actual = inicio;
        while (actual != null) {
            suma = suma + actual.getDato();
            actual = actual.getSiguiente();
        }
        actual = inicio;
        while (actual != null) {
            if (actual.getDato() == suma) {
                Nodo nuevo = new Nodo(0, actual.getSiguiente());
                actual.setSiguiente(nuevo);
                actual = nuevo.getSiguiente();
            } else {
                actual = actual.getSiguiente();
            }
        }
    }

    //EJERCICIO 12

    public ListaOrdinal(int[] datos) {
        if (datos.length == 0) {
            inicio = null;
        } else {
            inicio = new Nodo (datos[0], null);
            Nodo actual = inicio;
            for (int i = 1; i < datos.length; i++) {
                Nodo nuevo = new Nodo(datos[i], null);
                actual.setSiguiente(nuevo);
                actual = nuevo;
            }
        }
        numElementos = datos.length;
    }

    //EJERCICIO 13

    public void insertarAContinuacion(int base, int nuevo) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.getDato() != base) {
                actual = actual.getSiguiente();
            } else {
                Nodo nodoNuevo = new Nodo(nuevo, actual.getSiguiente());
                actual.setSiguiente(nodoNuevo);
                actual = nodoNuevo.getSiguiente();
            }
        }
    }


}
