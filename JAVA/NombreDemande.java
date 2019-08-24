//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

//ce programme a pour but de afficher 3 nombres que l'utilisateur aura écrit.
import java.util.Scanner;

public class NombreDemande{

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.print(c);

    }

}