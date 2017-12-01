public class Main {

    public static void main(String[] args) {
        System.out.println("Alfabet: ");

        Alfabet alfabet = new Alfabet();

        for(int i=0;i<alfabet.litery.size();i++)//przetworzenie liter na 6 danych wejsciowych
            alfabet.litery.get(i).update();

        double[][] xinputs = new double[20][6];
        int[] yexpected = new int[20];

        for(int i=0;i<20;i++)//spisywanie odpowiednio przetworzonych danych do tablicy wejsc
        {
            for(int j=0;j<6;j++)
                xinputs[i][j] = alfabet.litery.get(i).input[j];
        }
        for(int i=0;i<20;i++)
            yexpected[i] = alfabet.litery.get(i).czyDuza;

        for(int i=0;i<20;i++) {
            alfabet.litery.get(i).wyswietl();
            System.out.println();
//            System.out.println(" - ");
//            for (int j = 0; j < 6; j++)
//                System.out.println(xinputs[i][j]);
//            System.out.println("\n"+alfabet.litery.get(i).czyDuza + "\n");
        }

        //tworzenie odpowiedniej sieci i uczenie jej
        //SiecAdaline siec = new SiecAdaline(xinputs,yexpected);
        //SiecPerceptronow siec = new SiecPerceptronow(xinputs,yexpected);
       // siec.train();
       // System.out.println();
    }

}