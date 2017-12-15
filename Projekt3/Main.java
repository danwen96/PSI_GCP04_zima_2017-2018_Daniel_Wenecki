import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static double calculateRastrigin3D( double x1, double x2 ) //obliczanie funkcji rastrigin
    {
        return 20.0
                + x1 * x1 - 10.0 * Math.cos(2.0 * Math.PI * x1)
                + x2 * x2 - 10.0 * Math.cos(2.0 * Math.PI * x2);
    }

    public static void main( String[] args ) throws FileNotFoundException, UnsupportedEncodingException {
        Random randomizer = new Random();

        List<double[]> trainingData = new ArrayList<>( 3500 ); // 7/10 * 5000 - uczące
        List<double[]> testingData = new ArrayList<>( 1500 ); // 3/10 * 5000 - testujące

        for( int i = 0; i < 3500; ++i ) // 7/10 * 5000
        {
            double x1 = 4.0 * randomizer.nextDouble() - 2.0;
            double x2 = 4.0 * randomizer.nextDouble() - 2.0;
            double y = calculateRastrigin3D( x1, x2 );
            x1 = (x1+2.0)/4.0;//normalizacja
            x2 = (x2+2.0)/4.0;
            y = y/44.5;
            double[] row = new double[] { x1, x2, y };

            trainingData.add( row );
        }

        for( int i = 0; i < 1500; ++i ) // 3/10 * 5000
        {
            double x1 = 4.0 * randomizer.nextDouble() - 2.0;
            double x2 = 4.0 * randomizer.nextDouble() - 2.0;
            double y = calculateRastrigin3D( x1, x2 );
            x1 = (x1+2.0)/4.0;//normalizacja
            x2 = (x2+2.0)/4.0;
            y = y/44.5;
            double[] row = new double[] { x1, x2, y };

            testingData.add( row );
        }

        //zapisywanie do plików w celu późniejszego odczytania przez program
        PrintWriter zapis = new PrintWriter("trainingData.txt");
        for( int i = 0; i < 3500; ++i ) // 7/10 * 5000
        {
            zapis.println(trainingData.get(i)[0]+ " " + trainingData.get(i)[1] +" "+ trainingData.get(i)[2]);
        }
        zapis.close();

        PrintWriter zapis2 = new PrintWriter("testingData.txt");
        for( int i = 0; i < 1500; ++i ) // 3/10 * 5000
        {
            zapis2.println(testingData.get(i)[0]+ " " + testingData.get(i)[1] +" "+ testingData.get(i)[2]);
        }
        zapis2.close();
    }

}
