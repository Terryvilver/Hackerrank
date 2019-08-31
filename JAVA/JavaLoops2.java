//https://www.hackerrank.com/challenges/java-loops/problem

import java.util.Scanner;
import java.math.*;

public class JavaLoops2{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        int queries = scan.nextInt();

        for(int i = 0; i < queries; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int resultat = 0;
            int k=0;
            while(k < n)
            {
                if(k == 0)
                {
                    resultat = a + ((int)(Math.pow(2,k))*b);
                    System.out.print(resultat + " ");
                    k++;
                }
                else
                {
                    resultat =  resultat + ((int)(Math.pow(2,k))*b);
                    System.out.print(resultat + " ");
                    k++;
                } 
            }
            System.out.print("\n");
        }

    }
}