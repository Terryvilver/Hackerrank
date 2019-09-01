//https://www.hackerrank.com/challenges/java-datatypes/problem

import java.util.Scanner;

public class DataTypes{

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt(); //nombre de test a effectuer.
        long n; //nombre que l'on va tester.

        for(int i = 0; i < t; i ++)
        {
             try
            {
                n = scan.nextLong();

                while( ( n >= Math.pow(-2,63) ) && ( n <= Math.pow(2,63)-1 ) )
                {
                    System.out.println(n + " can be fitted in:");
                    if( (n >= -128) && (n <= 127) ) //pour un byte.
                        System.out.println("* byte");
                    if( (n >= -32768) && (n <= 32767) )//pour un short.
                        System.out.println("* short");
                    if( (n >= Math.pow(-2,31)) && (n <= Math.pow(2,31)-1) )//pour un int.
                        System.out.println("* int");
                    if( (n >= Math.pow(-2,63)) && (n <= Math.pow(2,63)-1) )//pour un long.
                        System.out.println("* long");
                    break;
                }
            }
            catch(Exception e) 
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");/* dans le cas
                                                                              ou si le nombre n'est pas dans le Long*/
            }
        }
        
    }
}