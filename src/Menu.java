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


        // Test na sztywno
        integral.setXp(2);
        integral.setXk(5);
        integral.setN(3);

        return integral;

    }

}
