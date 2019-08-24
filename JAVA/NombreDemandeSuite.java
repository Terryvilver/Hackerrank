//https://www.hackerrank.com/challenges/java-stdin-stdout/problem


/*Ce programme a pour but d'afficher les nombres et le texte de l'utilisateur */
import java.util.Scanner;

public class NombreDemandeSuite{

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        double b = scan.nextDouble();

        scan.nextLine();

        String texte = scan.nextLine();

        System.out.println("String: " + texte);
        System.out.println("Double: " + b);
        System.out.print("Int: " + a);


    }

}