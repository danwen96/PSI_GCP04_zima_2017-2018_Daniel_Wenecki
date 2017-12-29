public class Siec {
    int iloscWejsc = 65;
    int iloscZestawow = 4;
    int iloscNeuronow = 4;
    int[] wygrani = new int[iloscNeuronow];
    Hebb[] neuronyHebba = new Hebb[iloscNeuronow];
    ZestawUczacy zestawUczacy = new ZestawUczacy();

    Siec()// tworzenie sieci
    {
        int wygrany;
        for(int i=0;i<iloscNeuronow;i++)
            neuronyHebba[i] = new Hebb(iloscWejsc,this);

        for( int i=0;i<iloscNeuronow;i++)
        wygrani[i] = -1;
    }

    int naucz()// algorytm uczacy siec i zwracajacy ilosc iteracji potrzebnych do jej nauczenia, zwraca -1 jesli nie nauczy sie w podanym limicie
    {
        double yo[] = new double[iloscZestawow];

        int licznik = 1;
        int limit = 1000;
        //while(true)
        while(!wygraniSaRozni())
        {

            for(int i=0;i<iloscZestawow;i++)
            {
                double y1 = getNeuralNetOutput(i);

                for(int j=0;j<iloscNeuronow;j++)
                    neuronyHebba[j].learn(zestawUczacy.emotikony[j],y1);

                    wygrani[i] = -1;
            }

            for(int i=0;i<iloscZestawow;i++)
                wygrani[i] = znajdzZwyciezce(i);

            //System.out.println("Licznik w metodzie naucz: " + licznik);
            licznik++;
            if(licznik>limit)
            {
                //System.out.println("Licznik przekroczył maksymalną wartość sieć nie jest nauczona");
                licznik = -1;
                break;
            }
        }
        return licznik;
    }

    boolean wygraniSaRozni()// sprawdza czy nie ma aktywowanego tego samego neuronow dla roznych danych
    {
        for(int i=0;i<iloscNeuronow;i++)
            for(int j=i;j<iloscNeuronow;j++)
                if(i!=j)
                    if(wygrani[i] == wygrani[j])
                        return false;
        return true;
    }

    int znajdzZwyciezce(int nrZestawu)// szuka najbardziej aktywnego neuronu
    {
        double max = neuronyHebba[0].funkcjaAktywacji(neuronyHebba[0].oblicz(zestawUczacy.emotikony[nrZestawu]));
        int zwyciezca = 0;

        for(int i=1;i<iloscNeuronow;i++)
            if(neuronyHebba[i].funkcjaAktywacji(neuronyHebba[i].oblicz(zestawUczacy.emotikony[nrZestawu])) > max)
            {
                max = neuronyHebba[i].funkcjaAktywacji(neuronyHebba[i].oblicz(zestawUczacy.emotikony[nrZestawu]));
                zwyciezca = i;
            }
        return zwyciezca;
    }

    int znajdzZwyciezceDlaTestu(double[] zestaw)
    {
        double max = neuronyHebba[0].funkcjaAktywacji(neuronyHebba[0].oblicz(zestaw));
        int zwyciezca = 0;

        for(int i=1;i<iloscNeuronow;i++)
            if(neuronyHebba[i].funkcjaAktywacji(neuronyHebba[i].oblicz(zestaw)) > max)
            {
                max = neuronyHebba[i].funkcjaAktywacji(neuronyHebba[i].oblicz(zestaw));
                zwyciezca = i;
            }
        return zwyciezca;
    }

    void wyswietlAktualnyStan()
    {
        int wygrany;
        for(int i=0;i<iloscNeuronow;i++)
        {
            wygrany = znajdzZwyciezce(i);
            System.out.println("Dla zestawu " + i + " zwyciezca jest neuron nr: " + wygrany);
        }

    }

    void wyswietlDlaPodanychDanych(double[][] zestawTestujacy)
    {
        int wygrany;
        for(int i=0;i<iloscNeuronow;i++)
        {
            wygrany = znajdzZwyciezceDlaTestu(zestawTestujacy[i]);
            System.out.println("Dla zestawu " + i + " zwyciezca jest neuron nr: " + wygrany);
        }
    }

    double procentNiepoprawnychDlaPodanegoZestawu(double[][] zestawTestujacych)
    {
        int[] tab = new int[iloscZestawow];

        for(int i=0;i<iloscZestawow;i++)
            tab[i] = znajdzZwyciezceDlaTestu(zestawTestujacych[i]);

        int licznik = 0;
        for(int i=0;i<iloscNeuronow;i++)
            for(int j=i;j<iloscNeuronow;j++)
                if(i!=j)
                    if(tab[i] == tab[j])
                        licznik++;

        double ulamekUdzialu = (double)licznik/iloscZestawow;
        return ulamekUdzialu;
    }

    double getNeuralNetOutput(int nrZestawu)
    {
        double output = 0;
        for(int i=0;i<iloscNeuronow;i++){
            output+=neuronyHebba[i].funkcjaAktywacji(neuronyHebba[i].oblicz(zestawUczacy.emotikony[nrZestawu]));
        }
        return output;
    }
}
