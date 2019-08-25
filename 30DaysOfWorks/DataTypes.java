//https://www.hackerrank.com/challenges/30-data-types/problem


import java.util.Scanner;

public class DataTypes{

    public static void main(String []args){
        int i = 12;
        double d = 4.0;
        String s = "HackerRank ";
    
        Scanner sc = new Scanner(System.in);
        int entier = sc.nextInt();
        double flottant = sc.nextDouble(); 

        sc.nextLine();

        String texte = sc.nextLine();

        System.out.print("\n");

        System.out.println( i + entier);
        System.out.println( d + flottant);
        System.out.print( s + texte);

    }

}