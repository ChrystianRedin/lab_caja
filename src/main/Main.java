package main;

import clases.Caja;

public class Main {
    public static void main(String[] args){
        /* Creación Objeto Caja parámetros */
        Caja caja1 = new Caja(3,2,6);
        /* Ejecución del método */
        int resVolumen = caja1.calculaVolumen();
        /* Impresión del resultado del volumen */
        System.out.println("Volumen Caja: " + resVolumen);
    }
}
