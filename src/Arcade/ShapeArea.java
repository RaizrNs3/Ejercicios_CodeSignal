package Arcade;
/**
 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
 *
 * A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the
 * n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3-
 * and 4-interesting polygons in the picture below.
 */
public class ShapeArea {
    /**
     * Método que obtiene el número de cuadros que forman un polígono a partir de una entrada n.
     *@author Daniel Alejandro López Hernández
     *@param n {int} entrada del polígono.
     *@return {int} número de elementos que forman un polígono.*/
    public static int shapeArea(int n){
        return (int) (Math.pow(n, 2) + Math.pow( n - 1, 2));
    }
    public static void main(String[] args) {
        System.out.println(shapeArea(4));
    }
}
