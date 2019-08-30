//https://www.hackerrank.com/challenges/java-output-formatting/problem
import java.util.Scanner;

public class OutputFormatting{

    static char[] resolve(char mot[], String s1) //récupération du mot
    {
        for(int i = 0; i < mot.length; i++)
        {
            mot[i] = ' ';
        }

        for(int i = 0; i < mot.length; i++)
        {
            if(i < s1.length())
                mot[i] = s1.charAt(i);
        }
        return mot;
    }

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int nb;
        char mot[] = new char[15];
        String saisi;

        for(int i = 0; i < 3; i++)
        {
            nb = Integer.parseInt(String.format("%03d", scan.nextInt()));
            scan.nextLine();
            saisi = scan.nextLine();
            mot = resolve(mot,saisi);
            System.out.println(String.valueOf(mot)+nb);
        }
    }
}

