//https://www.hackerrank.com/challenges/java-if-else/problem

//Ce programme a pour but de voir si un nombre est étrange.

import java.util.Scanner;

public class IfElse{

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if( (n >= 1) && (n <= 100) )
            if(n%2==0) 
                if( (n >= 6) && (n <= 20) )
                    System.out.print("Weird");
                else
                    System.out.print("Not Weird");
            else
                System.out.print("Weird");
        else
            System.out.print("Weird");

    }

}