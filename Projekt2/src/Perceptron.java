import java.util.Random;

/**
 * Created by Daniel on 2017-10-19.
 */
public class Perceptron {
    double learningRate = 0.0001;
    double bias = 1;
    int nrOfData = 20;
    int nrOfBranches = 6;
    double[] weights = new double[6];
    double wb;

    public Perceptron(double inputs[][], int y[])
    {
        Random r = new Random();
        for(int i=0;i<nrOfBranches;i++)
            weights[i] = r.nextDouble();
        wb = 1;
    }
    public void learn(double inputs[],int y1)
    {
        double yo = treshhold(calculate(inputs));
        for (int j = 0; j < nrOfBranches; j++) {
            weights[j] += learningRate * ((double)y1 - yo) * inputs[j];
        }
        wb = wb + learningRate * ((double)y1 - yo);
    }
    public int treshhold(double sum)
    {
        if(sum>0) return 1;
        else return -1;
    }
    public double calculate(double inputs[])
    {
        double sum = 0;
        for(int i=0;i<nrOfBranches;i++)
            sum += inputs[i]*weights[i];
        return sum + bias*wb;
    }
}
