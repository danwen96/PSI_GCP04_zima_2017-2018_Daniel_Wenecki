import java.util.Random;
public class Hebb {
    double krokNauczania = 0.0001;
    double krokZapominania = 0.01;
    int iloscWejsc;
    double[] wagi;
    Siec siec;

    public Hebb(int iloscWejsc,Siec siec)//wprowadzam ilosc wejsc i losuje wagi poczatkowe
    {
        this.siec = siec;
        this.iloscWejsc = iloscWejsc;
        wagi = new double[iloscWejsc];

        Random r = new Random();
        for(int i = 0; i< iloscWejsc; i++)
            wagi[i] = r.nextDouble();

    }

    public void learn(double inputs[],double yo)// w tej metodzie modyfikuje wagi neuronu, a pozniej je normalizuje
    {
        for (int j = 0; j < iloscWejsc; j++) {
            wagi[j] = (1 - krokZapominania)*wagi[j] + krokNauczania * yo * inputs[j];
        }

        normalizujWagi();
    }

    public double funkcjaAktywacji(double sum) // sigmoidalna funkcja aktywacji
    {
       return (1.0/(1.0 + Math.pow(Math.E, - sum)));
        //return sum;
    }

    public double oblicz(double inputs[]) // zwraca sume wag razy podane wejscie
    {
        double sum = 0;
        for(int i = 0; i< iloscWejsc; i++)
            sum += inputs[i]* wagi[i];
        return sum ;
    }

    public void normalizujWagi() // normalizacja w celu unikniecia zbyt duzych wartosci wag
    {
        double mianownik = 0.;
        for(int i=0;i<iloscWejsc;i++)
            mianownik += wagi[i]*wagi[i];
        mianownik = Math.sqrt(mianownik);
        for(int i=0;i<iloscWejsc;i++)
            wagi[i] = wagi[i]/mianownik;
    }
}
