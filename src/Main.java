public class Main {
    public static void main(String[] args) {
        EjerciciosListas ejerciciosListas = new EjerciciosListas();
        ListaOrdinal listaOrdinal = new ListaOrdinal();
        listaOrdinal.insertar(1);
        listaOrdinal.insertar(2);
        listaOrdinal.insertar(2);
        listaOrdinal.insertar(3);
        listaOrdinal.insertar(2);
        ListaOrdinal listaOrdinal2 = new ListaOrdinal();
        listaOrdinal2.insertar(5);
        listaOrdinal2.insertar(5);
        listaOrdinal2.insertar(6);
        listaOrdinal2.mostrar();
       // listaOrdinal.eliminarrepetidos(3);
       //  listaOrdinal.triplicar();
       //  System.out.println(ejerciciosListas.comprobarUltimo(listaOrdinal));
       // ejerciciosListas.interseccion(listaOrdinal,listaOrdinal2).mostrar();
        //listaOrdinal.mostrar();
       /* ColaPrioridades colaPrioridades = new ColaPrioridades();
        colaPrioridades.encolar("Felipe",3);
        colaPrioridades.encolar("Jorge",2);
        colaPrioridades.encolar("Juan",6);
        colaPrioridades.encolar("Ruben",7);
        colaPrioridades.encolar("Paula",1);
        colaPrioridades.encolar("Diego",8);
        colaPrioridades.mostrar();*/
        ListaCalificada listaCalificada = new ListaCalificada();
        Alumno alumno1 = new Alumno("1","1");
        Alumno alumno2 = new Alumno("2","1");
        Alumno alumno3 = new Alumno("3","1");
        Alumno alumno4 = new Alumno("4","1");
        Alumno alumno5 = new Alumno("5","1");

        listaCalificada.insertar(10,alumno1);
        listaCalificada.insertar(20,alumno2);
        listaCalificada.insertar(30,alumno3);
        listaCalificada.insertar(40,alumno4);
        listaCalificada.insertar(50,alumno5);

        // listaCalificada.mostrar();
        //System.out.println(listaCalificada.eliminarEntre(1,2));
      //  listaOrdinal.Ejercicio11();
     /*   int[] elementos = new int[6];
        elementos[0]=0;
        elementos[1]=1;
        elementos[2]=2;
        elementos[3]=3;
        elementos[4]=4;
        elementos[5]=5;*/

        //ListaOrdinal lo = new ListaOrdinal(elementos);
        //lo.mostrar();
        //listaOrdinal.mostrar();
        //listaOrdinal.insertaracontinuacion(2,8);
        //listaOrdinal.mostrar();
       // listaOrdinal.crearlistasumaparejas().mostrar();
       // listaOrdinal.borrarduplicar(2);
        //listaOrdinal.mostrar();
        listaCalificada.mostrar();
       // listaCalificada.insertarMediaMaxDif();
        listaCalificada.ej14();
        System.out.println();
        listaCalificada.mostrar();
    }
}