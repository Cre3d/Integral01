public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Integral integral = new Integral();


        menu.menu(integral);

        System.out.println("Wynik całki to: " + integral.show());

    }


}
