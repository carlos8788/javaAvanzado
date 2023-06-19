package Ejercicio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //aritException(5, 0);
        //arrayExeption(5, 0);
        //arrayExeption(10, 0);

        readFile("texto");


    }

    public static void aritException(double numerador, double denominador){
        try{
            double numero = numerador / denominador;
            System.out.println("División: " + numero);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Final de ejecución aritException");
        }
    }

    public static void arrayExeption(int position, int value){
        int[] array = new int[10];

        try{
            array[position] = value;
            System.out.println("Elemento agregado");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finalizó la ejecución de Array");
        }
    }

    public static void readFile(String filename){
        try {
            FileReader reader = new FileReader( filename +".txt");
            System.out.println(reader);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
