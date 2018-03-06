import java.util.Scanner;

public class Menu {
    /**
     *
     * @param integral
     * @return
     */

    public Integral menu(Integral integral)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator całkowania");
        System.out.println("_____________________");

        System.out.println("1. Ustaw początek przedziału całkowania.");
        integral.setXp(scanner.nextDouble());
        System.out.println("2. Ustaw koniec przedziału całkowania.");
        integral.setXk(scanner.nextDouble());
        System.out.println("3. Ustaw ilość podziału.");
        integral.setN(scanner.nextInt());

        return integral;

    }



}
