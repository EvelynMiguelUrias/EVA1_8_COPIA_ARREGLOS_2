/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_copia_arreglos_2;

/**
 *
 * @author Evelyn
 */
public class EVA1_8_COPIA_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aiDatosOrigen[] = new int [5];//LLENADO POR SEPARADO 
        aiDatosOrigen[0] = 10;
        aiDatosOrigen[1] = 20;
        aiDatosOrigen[2] = 30;
        aiDatosOrigen[3] = 40;
        aiDatosOrigen[4] = 50;
        //MI "COPIA DEL ARREGLO
        int aiCopia[] = new int[aiDatosOrigen.length];
        //NO SIRVE
        //aiCopia =aiDatosOrigen;
        for (int i = 0; i < aiDatosOrigen.length; i++) {
            aiCopia[i] = aiDatosOrigen[i];
        }
        //IMPRIMIR LA COPIA
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiCopia[i]);
        }
         //MODIFICO aiDatosOrigen 
        aiDatosOrigen[3] = 99999;
         //IMPRIMIR LA COPIA
         System.out.println("Reimprimiendo la copia");
        for (int i = 0; i < aiCopia.length; i++) {
            System.out.println(aiCopia[i]);
        }
        //LA DIRECCION ES DIFERENTE PORQUE SON INDEPENDIENTES 
        System.out.println(aiDatosOrigen);
        System.out.println(aiCopia);
        // TODO code application logic here
    }
    
}
