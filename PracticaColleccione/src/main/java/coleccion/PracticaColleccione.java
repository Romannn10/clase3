/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coleccion;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alumno
 */
public class PracticaColleccione {
    static int[][] m ={{2,5,-10,220},
            {14,12,31,25},
            {1,12,30,-2},
            {0,44,30,4}};
    
    static int[] arr ={2,5,-10,220,14,12,31,25,1,12,30,-2,0,44,30,4};
    
    static ArrayList<Integer> numeros=new ArrayList<Integer>();
    
    public static void main(String[] args) {   
        /*
        recorrerMatriz();
        recorrerMatrizEnForma();
        minimoValor();
        maximoValor();
        System.out.println("La sumatoria de la Diagonal es: "+valorDiagonal('S'));
        System.out.println("El producto de la Diagonal es: "+valorDiagonal('M'));
        System.out.println("La sumatoria de la Diagonal es: "+valorDiagonalInversa('S'));
        System.out.println("El producto de la Diagonal es: "+valorDiagonalInversa('M'));
       
        recorrerArreglo();
        System.out.println("Aplicar Ordenaciòn Burbuja");
        ordenarBurbujaVector();
        recorrerArreglo();
       */
       ejemploArraList();
       
    }
    private static void recorrerMatriz(){
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                System.out.println("El numero contenido en la matriz es: "+m[f][c]);
            }
        }
    }
    
    private static void recorrerMatrizEnForma(){
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                System.out.print(" "+m[f][c]);
            }
            System.out.println("");
        }
    }
   
    private static void minimoValor(){
        int min=Integer.MAX_VALUE;
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                if(min>m[f][c])
                    min=m[f][c];
            }
        }
        System.out.println("El valor Mìnimo es: "+min);
    }
    private static void maximoValor(){
        int max=Integer.MIN_VALUE;
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                if(max<m[f][c])
                    max=m[f][c];
            }
        }
        System.out.println("El valor Mìnimo es: "+max);
    }
    
    private static int valorDiagonal(char in){
        int resultSum=0;
        int resultProd=1;
        for (int i = 0; i < m.length; i++) {
            if(in=='S')
                resultSum+=m[i][i];
            else
                resultProd*=m[i][i];
        }
        return (in=='S')?resultSum:resultProd;
    }
    
    private static int valorDiagonalInversa(char in){
        int resultSum=0;
        int resultProd=1;
        for (int i = m.length-1; i >= 0; i--) {
            if(in=='S')
                resultSum+=m[i][i];
            else
                resultProd*=m[i][i];
        }
        return (in=='S')?resultSum:resultProd;
    }
    
    private static void ordenarBurbujaVector(){
        int aux;
        for(int f=0;f<arr.length;f++){
            for(int j=0;j<arr.length;j++){
                if(arr[f]<arr[j]){
                    aux=arr[j];
                    arr[j]=arr[f];
                    arr[f]=aux;
                }
            }
        }
    }
    
    private static void recorrerArreglo(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    
    private static void ejemploArraList(){
        numeros.add(45);
        numeros.add(10);
        numeros.add(0);
        numeros.add(30);
        
        System.err.println("Recorrido con un for");
        for (int i = 0; i < numeros.size(); i++) {
            System.err.println("El nùmero en la posicion "+i+" es: "+numeros.get(i));
        }
        System.err.println("Recorrido con un foreach");
        for (Integer numero : numeros) {
            //numero.parseInt("12");
            System.out.println("El elemento es: "+numero.toString());
        }
        
        System.err.println("Recorrido con Iterator");
        Iterator<Integer> iterador=numeros.iterator();
        while(iterador.hasNext()){
            System.out.println("El nùmero es: "+iterador.next().toString());
        }
        
        int nroEliminado=numeros.remove(1);
        System.err.println(numeros.remove((Integer)45));
        
        System.out.println("El elemento existe: "+numeros.contains(0));
        System.out.println("El elemento existe: "+numeros.contains(110));
        System.out.println("El primer elemento es: "+numeros.getFirst());
        System.out.println("El Ultimo elemento es: "+numeros.getLast());
        ArrayList<Integer> nuevoArr= new ArrayList<Integer>();
        nuevoArr.add(110);
        nuevoArr.add(-14);
        nuevoArr.add(1520);
        
        numeros.addAll(nuevoArr);
        numeros.set(2, 520);
        System.err.println("Recorrido con Iterator");
        Iterator<Integer> iterador2=numeros.iterator();
        while(iterador2.hasNext()){
            System.out.println("El nùmero es: "+iterador2.next().toString());
        }
        
    }
}
