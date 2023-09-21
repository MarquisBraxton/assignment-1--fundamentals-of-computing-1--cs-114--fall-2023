// Import libraries here

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int min = 32;
        int max = 16384;
       double Fahrenheit, Celcius;
       String message;


                System.out.println("MMMM        MMMM  BBBBBBBBB");
                System.out.println("MMMMM      MMMMM  BBB     BB");
                System.out.println("MM  MM    MM  MM  BBBBBBBBBBB");
                System.out.println("MM   MM  MM   MM  BBB      BBBB");
                System.out.println("MM    MMMM    MM  BBBBBBBBBBB");

       Scanner scan = new Scanner(System.in);

       System.out.print("Please enter a 5-character string:");
       message = scan.nextLine();
       String str = message;

        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();

       System.out.print("Please enter a number in Fahrenheit:");
       Fahrenheit = scan.nextDouble();
        //Celcius= 13;
        Celcius=((Fahrenheit-32))*5/9;
        //System.out.println("Temperature in Celcius is: "+Celcius);

        int rando = (int)Math.floor(Math.random() * (max - min + 1) + min);
        //System.out.println(rando);

        //System.out.println(Celcius sbr rando);
        System.out.print(Celcius);
        System.out.print(sbr);
        System.out.print(rando);

    }
        }
