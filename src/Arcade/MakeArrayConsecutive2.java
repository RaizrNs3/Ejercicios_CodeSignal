package Arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an
 * non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest
 * so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able
 * to accomplish that. Help him figure out the minimum number of additional statues needed.*/
public class MakeArrayConsecutive2 {

    /**
     * Método que determina si un número se encuentra en un array de enteros.
     * @author Daniel Alejandor López Hernández.
     * @param numero {int} número que será buscado en el array.
     * @param array {int[]} array donde se buscará el núemro.
     * @return {boolean} existe o no existe el número en el array.*/
    public static boolean estaEnArray(int numero, int[] array){
        for(int i : array){
            if(i == numero) return true;
        }
        return false;
    }

    /**
     * Método que determina cuantas "estatuas" faltan para tener una fila consecutiva con base en los tamaños.
     * @author Daniel Alejandro López Hernández.
     * @param statues {int[]} array con los valores de los tamaños de las estatuas.
     * @return {int} número de estatuas faltantes.*/
    public static int makeArrayConsecutive2(int [] statues){
        if(statues.length == 1) return 0;
        Arrays.sort(statues);
        int cont = 0;
        int piv = statues[0] + 1;

        while(piv != statues[statues.length - 1]){
            if (!estaEnArray(piv, statues)){
                cont++;
            }
            piv += 1;
        }
        return cont;
    }
    public static void main(String[] args) {
        int []statues = {6,2,3,8};
        System.out.println(makeArrayConsecutive2(statues));
    }
}
