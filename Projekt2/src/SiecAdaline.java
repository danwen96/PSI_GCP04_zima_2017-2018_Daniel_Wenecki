
public class SiecAdaline {
    double inputs[][];
    int y[];
    int nrOfNeurons = 6;
    Adaline[] adalines;
    int calculatedOutputs[];
    int nrOfEpochs = 10000;
    double epochError = 0;

    SiecAdaline(double inputs[][], int y[])//inicializacji odpowiednich tablic i neuronow
    {
        this.inputs = inputs;
        this.y = y;
        this.adalines = new Adaline[nrOfNeurons];
        for(int i=0;i<nrOfNeurons;i++)
            adalines[i] = new Adaline();
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
            for (int i = 0; i < nrOfNeurons; i++) {//obliczenie aktualnego wyjscia przez neuron
                calculatedOutputs[i] = adalines[i].treshhold(adalines[i].calculate(inputs[j]));
                majority += calculatedOutputs[i];
            }
            if (majority >= 0) majority = 1;
            else majority = -1;

            epochError += (majority - y[j])*(majority - y[j]);

            if (majority == y[j])//sprawdzenie czy obecne wyjsie jest poprawne
                continue;
            else {//modyfikowanie wag odpowiedniego neuronu dla obecnego wyjscia
                wasModified = true;
                idMin = 0;
                czyJestUstalone = false;
                sumaWagxWejsc = 0.;
                for (int i = 0; i < nrOfNeurons; i++) {//poszukiwanie neuronu do edycji
                    if (czyJestUstalone == false) {
                        tmp = Math.abs(adalines[i].calculate(inputs[j]));
                        if (adalines[i].treshhold(adalines[i].calculate(inputs[j])) != y[j]) {
                            idMin = i;
                            sumaWagxWejsc = tmp;
                        }
                    } else {
                        tmp = Math.abs(adalines[i].calculate(inputs[j]));
                        if (tmp < sumaWagxWejsc) {
                            idMin = i;
                            sumaWagxWejsc = tmp;
                        }
                    }
                }
                adalines[idMin].learn(inputs[j], y[j]);//wywolanie funkcji aktualizujacej wagi
                System.out.println("Dla epoki "+k+" dla danych " + j + " modyfikacja neuronu " + idMin);
            }
        }
        //System.out.println(epochError);
        if(wasModified == false) break;//gdy wszystko zostalo nauczone konczymy dzialanie metody

        }
    }

    int oblicz(double inputs[])//wylicznie wyjscia dla danego wektora wejsciowego
    {
        int majority = 0;
        for (int i = 0; i < nrOfNeurons; i++) {
            calculatedOutputs[i] = adalines[i].treshhold(adalines[i].calculate(inputs));
            majority += calculatedOutputs[i];
        }
        if(majority >= 0) return 1;
        else  return -1;
    }


}
