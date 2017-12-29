public class Main {

    public static void main(String[] args) {
        ZestawUczacy zestawUczacy = new ZestawUczacy();

        int iloscSieci = 1000;
        Siec[] sieci = new Siec[iloscSieci];//tworzenie wiekszej ilosci sieci w celu sredniego pomiaru ich wlasciwosci
        double suma = 0.0;
        int wyjscie = 0;
        for(int i=0;i<iloscSieci;i++)
        {
            sieci[i] = new Siec();
            wyjscie = sieci[i].naucz();
            if(wyjscie != -1)
                suma += (double)wyjscie;
            else
                System.out.println("Siec "+i+" nie nauczyla sie");
        }
        suma = suma/(double)iloscSieci;
        System.out.println("Średnia ilość iteracji wyniosła: " + suma);

        double sredniUlamekNiepoprawnych = 0.;//sprawdzanie bledu dla zaszumionych danych
        for(int i=0;i<iloscSieci;i++)
        {
            sredniUlamekNiepoprawnych+= sieci[i].procentNiepoprawnychDlaPodanegoZestawu(zestawUczacy.zaszumionyZestaw);
        }
        sredniUlamekNiepoprawnych = sredniUlamekNiepoprawnych/(double)iloscSieci;
        System.out.println("Średni procent niepoprawnych odpowiedzi wyniosl: " + sredniUlamekNiepoprawnych);

        System.out.println("Test daych przy użyciu danych zaszumionych");
        sieci[0].wyswietlDlaPodanychDanych(zestawUczacy.zaszumionyZestaw);
    }
}
