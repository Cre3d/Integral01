import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integral integral = new Integral();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Całkowania");
        System.out.println("___________________________________");

        System.out.println("Podaj początek przedziału");
        integral.setXp(scanner.nextDouble());

        System.out.println("Podaj koniec przedziału całkowania");
        integral.setXk(scanner.nextDouble());

        System.out.println("Podaj dokładność całkowania");
        integral.setN(scanner.nextInt());

        System.out.println("Wynik całki to: " + integral.show());

    }


}
