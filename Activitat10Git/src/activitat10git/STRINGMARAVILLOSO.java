/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat10git;

public class STRINGMARAVILLOSO {

    public static void versionActualizada() {
        System.out.println("Aquest print esta creat desde el github");
        System.out.println("Aquest programa mostra la paraula 'MARAVILLOSO' en un format que recordda a un moli de vent");
        System.out.println("La versió que tenim a github ha estat actualitzada i és mes actual que la que tinc en local");
    }

    public static void parteSuperior(String M) {
        //Imprime los primeros dos triangulos de izq a derecha de la primera parte (parte superios)
        for (int i = 0; i < M.length(); i++) {
            //Imprime espacios de la primera parte para el primer triangulo 
            for (int j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            //Imprime el primer triangulo de la primer parte 
            for (int j = i; j < M.length(); ++j) {
                System.out.print(M.charAt(j));
            }
            //Imprime espacios entre el primero y segundo triangulo de la primera parte
            for (int j = i; j < M.length(); ++j) {
                System.out.print(" ");
            }
            //Imprime el segundo triangulo de la primera parte
            for (int j = M.length() - i - 1; j < M.length(); ++j) {
                System.out.print(M.charAt(j));
            }
            System.out.println();
        }
    }

    public static void parteInferior(String M) {
        //Imprime los segundos dos triangulos de izq a derecha de la segunda parte (parte inferior)
        for (int i = 0; i < M.length(); i++) {
            //Imprime primer triangulo de la segunda parte
            for (int j = i; j < M.length(); ++j) {
                System.out.print(M.charAt(j));
            }
            //Imprime espacios entre primer y segundo triangulo
            for (int j = 0; j <= i; ++j) {
                System.out.print(" ");
            }
            //Imprime segundo triangulo de la segunda parte  
            for (int j = 0; j < i + 1; ++j) {
                System.out.print(M.charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String M = "MARAVILLOSO";

        versionActualizada();

        parteSuperior(M);

        parteInferior(M);
    }
}
