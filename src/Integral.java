
public class Integral {
    double xp;
    double xk;
    int n;
/**
 *  Setters and Getters
 */
    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public double getXk() {
        return xk;
    }

    public void setXk(double xk) {
        this.xk = xk;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    /**
     * @integral - Prywatna metoda obliczeń całki
     *
     * @param xp - początek przedziału  całki
     * @param xk - koniec przedziału całki
     * @param n - Dokładność obliczeń; N ilość 'dzieleń' przedziału
     * @return - zwraca wynik całki
     */


    private double integral(double xp, double xk, int n) // Metoda prostokątów
    {
        double integral = 0;
        double dx = (xk - xp) / (double)n;

        for (int i=1; i<=n; i++) {
            integral += Func.func(xp + i * dx);
        }
        integral *= dx;

        return integral;
    }

    /**
     * @show  - Publiczna metoda wyświetlająca wynik całki
     *
     * @return zwraca wynik całki
     */
    public double show()
    {
        return integral(getXp(),getXk(),getN());
    }


}

