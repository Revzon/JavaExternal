package entities;

/**
 * Created by olga on 15.03.18.
 */
public class Figure {

    int n;


    public Figure() {
        super();
        this.n = 1;
    }

    public Figure(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "n = " + n +
                '}';
    }
}
