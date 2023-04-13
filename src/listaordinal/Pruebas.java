package listaordinal;

public class Pruebas {
    
    public static void main(String[] args) {
        ListaOrdinal lista = new ListaOrdinal();
        if (lista.vacia()) {
            System.out.println("La lista está vacía");
        }

        lista.insertar(2);
        lista.insertar(5);
        lista.insertar(4);
        lista.insertar(0);
        lista.insertar(1);
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                lista.insertar(i);
            } else {
                lista.insertar(i * 10);
            }
        }
        System.out.println("Después de insertar " + lista.getNumElementos() + " elementos:");
        lista.mostrar();
        System.out.println("---------------------------");

        // EJERCICIO 1
        System.out.println("\nEJERCICIO 1");
        lista.duplicarParesQuitarImpares();
        System.out.println("Al duplicar pares y quitar impares:");
        lista.mostrar();
        System.out.println("---------------------------");

        // EJERCICIO 2
        System.out.println("\nEJERCICIO 2");
        lista.eliminarRepetidos(2);
        System.out.println("Después de eliminar los repetidos del 2");
        lista.mostrar();
        System.out.println("---------------------------");

        // EJERCICIO 3
        System.out.println("\nEJERCICIO 3");
        ListaOrdinal lista3 = new ListaOrdinal();
        lista3.insertar(3);
        lista3.insertar(1);
        lista3.mostrar();
        System.out.println("Después de triplicar los nodos:");
        lista3.triplicar();
        lista3.mostrar();
        System.out.println("---------------------------");

        // EJERCICIO 4
        System.out.println("\nEJERCICIO 4");
        ListaOrdinal lista4 = new ListaOrdinal();
        lista4.insertar(2);
        lista4.insertar(5);
        lista4.insertar(8);
        lista4.insertar(1);
        lista4.mostrar();
        Algoritmos algoritmos = new Algoritmos();
        System.out.println("Comprobar ultimo nodo: " + algoritmos.comprobarUltimo(lista4));
        lista4.insertar(5);
        lista4.mostrar();
        System.out.println("Comprobar ultimo nodo: " + algoritmos.comprobarUltimo(lista4));
        System.out.println("---------------------------");

        // EJERCICIO 5
        System.out.println("\nEJERCICIO 5");
        ListaOrdinal listaAux = new ListaOrdinal();
        listaAux.insertar(2);
        listaAux.insertar(30);
        listaAux.insertar(2);
        listaAux.insertar(5);
        listaAux.insertar(9);
        lista.mostrar();
        listaAux.mostrar();
        ListaOrdinal lista5 = algoritmos.interseccion(lista, listaAux);
        System.out.println("Intersección");
        lista5.mostrar();
        System.out.println("---------------------------");


        // EJERCICIO 9
        System.out.println("\nEJERCICIO 9");
        ListaOrdinal lista6 = new ListaOrdinal();
        lista6.insertar(1);
        lista6.insertar(2);
        lista6.insertar(3);
        lista6.insertar(2);
        lista6.insertar(5);
        lista6.insertar(6);
        int numero = 2;
        lista6.mostrar();
        System.out.println("Contiene el " + numero + " " + lista6.contiene2(numero));
        lista6.mostrar();
        System.out.println("---------------------------");


        // EJERCICIO 10
        System.out.println("\nEJERCICIO 10");
        ListaOrdinal lista10 = new ListaOrdinal();
        lista10.insertar(1);
        lista10.insertar(2);
        lista10.insertar(3);
        lista10.mostrar();
        lista10.imagenEspecular();
        System.out.println("Después de formar la imagen especular:");
        lista10.mostrar();
        System.out.println("---------------------------");

        // EJERCICIO 11
        System.out.println("\nEJERCICIO 11");
        ListaOrdinal lista11 = new ListaOrdinal();
        lista11.insertar(1);
        lista11.insertar(2);
        lista11.insertar(3);
        lista11.insertar(2);
        lista11.insertar(-6);
        lista11.mostrar();
        lista11.insertarCeros();
        System.out.println("Después de insertar ceros:");
        lista11.mostrar();
        System.out.println("---------------------------");

        //EJERCICIO 12
        System.out.println("\nEJERCICIO 12");
        int[] datos = new int[] {1,2,3,4,5,6};
        System.out.print("Array: ");
        for(int i=0; i<6; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println("\nAl utilizar el array en el constructor, se obiene la lista ordinal:");
        ListaOrdinal lista12 = new ListaOrdinal(datos);
        lista12.mostrar();
        System.out.println("---------------------------");

        //EJERCICIO 13
        System.out.println("\nEJERCICIO 13");
        datos = new int[] {1,2,4,2};
        ListaOrdinal lista13 = new ListaOrdinal(datos);
        lista13.mostrar();
        lista13.insertarAContinuacion(2,6);
        System.out.println("Después de los elementos 2 añadimos un 6:");
        lista13.mostrar();
        System.out.println("---------------------------");

        //EJERCICIO 20
        System.out.println("\nEJERCICIO 20");
        String palabra1 = "tommhasoye";
        String palabra2 = "mtomaesohy";
        System.out.println("Son anagramas " + palabra1 + " y " + palabra2 + ": "+
                algoritmos.sonAnagramas(palabra1, palabra2));

    }

}
