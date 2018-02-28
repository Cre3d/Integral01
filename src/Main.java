import java.io.*;
import java.util.Scanner;

public class Main {



    // Funkcja
    private static double func(double x){
        return x*x+3;
    }

    static double xp = 0, xk = 0, dx = 0, integral = 0;
    static int n = 0;
    static  boolean ok = false;


    public static boolean menu(boolean ok){

        if(xp>0 && xk>0 && n>0)
            return true;

        System.out.println("Kalkulator Całkowania");
        System.out.println("___________________________________");

        if(xp >0)
            System.out.println("1. Początek przedziału " + xp);
        else
            System.out.println("1. Podaj początek przedziału");
        if(xk>0)
            System.out.println("2. Koniec przedziału " + xk);
        else
            System.out.println("2. Podaj koniec przedziału całkowania");
        if(n>0)
            System.out.println("3. Dokładność całkowania "+n);
        else
            System.out.println("3. Podaj dokładność całkowania");

        System.out.println("Wybierz cyfrę i wpisz wartość...");


        return false;
    }
    public static void main(String[] args) {

        boolean k = true;
    do {


        while (ok == false) {

             menu(ok);
            Scanner scanner = new Scanner(System.in);
            int sw  = scanner.nextInt();
            System.out.println("Podaj wartość");
            if(sw == 1)
            {
                xp = scanner.nextDouble();
            }
            if(sw == 2)
            {
                xk = scanner.nextDouble();
            }
            if(sw == 3)
            {
                n = scanner.nextInt();
            }

        }

        dx = (xk - xp) / (double) n;

        for (int i = 1; i <= n; i++) {
            integral += func(xp + 1 * dx);
        }
        integral *= dx;

        System.out.println("Wartość całki wynosi w przybliżeniu " + integral);

         k = true;

    }while(k == false);

    }
}