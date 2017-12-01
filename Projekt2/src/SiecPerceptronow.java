
public class SiecPerceptronow {
    double inputs[][];
    int y[];
    int nrOfNeurons = 6;
    Perceptron[] perceptrons;
    int calculatedOutputs[];
    int nrOfEpochs = 10000;
    double epochError = 0;

    SiecPerceptronow(double inputs[][], int y[])
    {
        this.inputs = inputs;
        this.y = y;
        this.perceptrons = new Perceptron[nrOfNeurons];
        for(int i=0;i<nrOfNeurons;i++)
            perceptrons[i] = new Perceptron(inputs,y);
        this.calculatedOutputs = new int[nrOfNeurons];
    }

    void train()
    {
        int majority;
        int idMin;
        double sumaWagxWejsc;
        double tmp;
        boolean czyJestUstalone = false;
        boolean wasModified = false;
        for(int k=0;k<nrOfEpochs;k++)
        {
            epochError = 0;
            wasModified = false;
            for(int j=0;j<20;j++) {
                majority = 0;
                for (int i = 0; i < nrOfNeurons; i++) {
                    calculatedOutputs[i] = perceptrons[i].treshhold(perceptrons[i].calculate(inputs[j]));
                    majority += calculatedOutputs[i];
                }
                if (majority >= 0) majority = 1;
                else majority = -1;
                epochError += (majority - y[j])*(majority - y[j]);

                if (majority == y[j])
                    continue;
                else {
                    wasModified = true;
                    idMin = 0;
                    czyJestUstalone = false;
                    sumaWagxWejsc = 0.;
                    for (int i = 0; i < nrOfNeurons; i++) {
                        if (czyJestUstalone == false) {
                            tmp = Math.abs(perceptrons[i].calculate(inputs[j]));
                            if (perceptrons[i].treshhold(perceptrons[i].calculate(inputs[j])) != y[j]) {
                                idMin = i;
                                sumaWagxWejsc = tmp;
                            }
                        } else {
                            tmp = Math.abs(perceptrons[i].calculate(inputs[j]));
                            if (tmp < sumaWagxWejsc) {
                                idMin = i;
                                sumaWagxWejsc = tmp;
                            }
                        }
                    }
                    perceptrons[idMin].learn(inputs[j], y[j]);
                    System.out.println("Dla epoki "+k+" dla danych " + j + " modyfikacja neuronu " + idMin);
                }
            }
            //System.out.println(epochError);
            if(wasModified == false) break;
        }
    }

    int oblicz(double inputs[])
    {
        int majority = 0;
        for (int i = 0; i < nrOfNeurons; i++) {
            calculatedOutputs[i] = perceptrons[i].treshhold(perceptrons[i].calculate(inputs));
            majority += calculatedOutputs[i];
        }
        if(majority >= 0) return 1;
        else  return -1;
    }


}
