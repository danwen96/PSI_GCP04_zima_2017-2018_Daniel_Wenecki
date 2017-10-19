import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dzialanie perceptonu: ");
        double x1[] = {0,0,1,1};
        double x2[] = {0,1,0,1};
        double y1[] = {0,0,0,1};
        double y2[] = {0,1,1,1};
        double y3[] = {0,1,1,0};
        //double bias[] = {1,1,1,1};
        //doPerceptonThnings(x1,x2,y2);
        Perceptron p1 = new Perceptron(x1,x2,y1);

        System.out.println("Wynik z 0 i 0  " + p1.treshhold(p1.calculate(0,0)));
        System.out.println("Wynik z 0 i 1  " + p1.treshhold(p1.calculate(0,1)));
        System.out.println("Wynik z 1 i 0  " + p1.treshhold(p1.calculate(1,0)));
        System.out.println("Wynik z 1 i 1  " + p1.treshhold(p1.calculate(1,1)));
    }

}
