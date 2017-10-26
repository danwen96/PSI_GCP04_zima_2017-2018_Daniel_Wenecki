import java.util.Random;

/**
 * Created by Daniel on 2017-10-19.
 */
public class Perceptron {
    double learningRate = 1;
    double bias = 1;
    int nrOfInstances = 200;
    double w1,w2,wb;
    public Perceptron (double x1[],double x2[],double y[])
    {
        Random r = new Random();
        w1 = 1;
        w2 = 1;
        wb = 1;
        learn(x1,x2,y);
    }
    public void learn(double x1[],double x2[],double y1[])
    {
        double global_error= 0;
        double local_error=0;
        double yloc =0;
        for(int i=0;i<nrOfInstances;i++)
        {
            global_error = 0;
            for(int j=0;j<4;j++) {
                yloc=treshhold(calculate(x1[j],x2[j]));
                local_error = (y1[j] - yloc);
                w1 = w1 + learningRate*local_error*x1[j];
                w2 = w2 + learningRate*local_error*x2[j];
                wb = wb + learningRate*local_error;
                global_error = global_error + local_error*local_error;
            }
            if(global_error < 0.001) break;
            System.out.println("Petla nr: " + (i + 1));
        }
    }
    public double treshhold(double sum)
    {
        if(sum>0) return 1;
        else return 0;
    }
    public double calculate(double x1,double x2)
    {
        return x1*w1 + x2*w2 + bias*wb;
    }
}
