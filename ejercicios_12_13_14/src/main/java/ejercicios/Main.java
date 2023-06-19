package ejercicios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, -1};


        ArrayList resultado =  numerosPares(numeros);
        System.out.println("Los numeros pares son: " + resultado);

        int numerosNegativos = contarNegativos(numeros);
        System.out.println("La cantidad de numeros negativos son: " + numerosNegativos);

    }

    /**
     * Esta función devuelve un arrayList de numeros pares
     * @param numeros
     * @return ArrayList
     */
    public static ArrayList numerosPares(int[] numeros){
        ArrayList arrayResultado = new ArrayList();
        for(int numero : numeros){
            if(numero % 2 == 0){
                arrayResultado.add(numero);
            }
        }
        return arrayResultado;
    }

    /**
     * La función contabiliza los números negativos que tiene un array
     * @param numeros (ArrayList)
     * @return Integer
     */
    public static int contarNegativos(int[] numeros){
        int contador = 0;
        for (int numero: numeros) {
            if(numero < 0){
                contador++;
            }
        }
        return contador;
    }
}