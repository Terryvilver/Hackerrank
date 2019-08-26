//https://www.hackerrank.com/challenges/30-operators/problem

/*Ce programme a pour but de déterminer le prix total d'un repas,
en calculant le prix du repas, du pourboire et des taxes. Ce qui nous 
donnera notre prix total.
Je me suis permi de rendre le programme un peu plus fonctionnel, 
en demandant le prix du repas, puis en utilisant cette valeur pour
faire mes calculs avec les infos données par l'énoncé.
*/

import java.math.*;
import java.util.Scanner;


public class Operators{

     static void calcul(double mealCost, int tipPercent, int taxPercent){

        double tip = mealCost * ( (double)(tipPercent)/100 );
        double tax = mealCost * ( (double)(taxPercent)/100 );
        int total = (int)Math.round( mealCost + tip + tax ); /*Ici je veux que 
        ma valeur sois arrondi en entier, je n'ai pas 
        besoin de la précision d'un réel.
         */

         System.out.print("Le prix total du repas est de " + total );

    }
    public static void main(String []args){

        System.out.println("Quel est le prix du repas ? ");

        Scanner scan = new Scanner(System.in);

        double mealCost = scan.nextDouble();
        int tipPercent = 20;
        int taxPercent = 8;

        calcul( mealCost, tipPercent, taxPercent);

    }

}