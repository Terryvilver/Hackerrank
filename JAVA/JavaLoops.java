//https://www.hackerrank.com/challenges/java-loops-i/problem
import java.util.Scanner;

public class JavaLoops{

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        int N;
        int resultat;
        boolean test;


        System.out.println("Choisissez un nombre entre 2 et 20. ");
        System.out.print("Votre réponse : ");

        do
        {
            N = scan.nextInt();
            if(N < 2 || N > 20)
            {
                test = false;
                System.out.println("\nErreur ! Choisissez un nombre entre 2 et 20. ");
                System.out.print("Votre réponse : ");
            }
            else
                test = true;
        }while(test == false);

        for(int i = 1; i <= 10; i++)
        {
            resultat=N*i;
            System.out.println(N +" x "+ i + " = " + resultat);
        }

    }
}