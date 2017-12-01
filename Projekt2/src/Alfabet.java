import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 2017-10-03.
 */
public class Alfabet {//tworzenie danych wejsciowych w postaci liter
    Litera lita = new Litera();
    Litera litb = new Litera();
    Litera litc = new Litera();
    Litera litd = new Litera();
    Litera lite = new Litera();
    Litera litf = new Litera();
    Litera lith = new Litera();
    Litera liti = new Litera();
    Litera litl = new Litera();
    Litera lito = new Litera();

    Litera litA = new Litera();
    Litera litB = new Litera();
    Litera litC = new Litera();
    Litera litD = new Litera();
    Litera litE = new Litera();
    Litera litF = new Litera();
    Litera litH = new Litera();
    Litera litI = new Litera();
    Litera litL = new Litera();
    Litera litO = new Litera();

    List<Litera> litery = new ArrayList<Litera>();

    Alfabet()
    {
        //a
        lita.tab[8][3] = 1;
        lita.tab[8][4] = 1;
        lita.tab[8][5] = 1;
        lita.tab[8][6] = 1;
        lita.tab[9][2] = 1;
        lita.tab[10][2] = 1;
        lita.tab[11][2] = 1;
        lita.tab[12][2] = 1;
        lita.tab[8][7] = 1;
        lita.tab[9][7] = 1;
        lita.tab[10][7] = 1;
        lita.tab[11][7] = 1;
        lita.tab[12][7] = 1;
        lita.tab[13][3] = 1;
        lita.tab[13][4] = 1;
        lita.tab[13][5] = 1;
        lita.tab[13][6] = 1;
        lita.tab[13][8] = 1;

        //b
        litb.tab[8][3] = 1;
        litb.tab[8][4] = 1;
        litb.tab[8][5] = 1;
        litb.tab[8][6] = 1;
        litb.tab[9][2] = 1;
        litb.tab[10][2] = 1;
        litb.tab[11][2] = 1;
        litb.tab[12][2] = 1;
        litb.tab[9][7] = 1;
        litb.tab[10][7] = 1;
        litb.tab[11][7] = 1;
        litb.tab[12][7] = 1;
        litb.tab[13][3] = 1;
        litb.tab[13][4] = 1;
        litb.tab[13][5] = 1;
        litb.tab[13][6] = 1;
        for(int i = 1;i<14;i++)
            litb.tab[i][2] = 1;

        //c
        litc.tab[8][3] = 1;
        litc.tab[8][4] = 1;
        litc.tab[8][5] = 1;
        litc.tab[8][6] = 1;
        litc.tab[9][2] = 1;
        litc.tab[10][2] = 1;
        litc.tab[11][2] = 1;
        litc.tab[12][2] = 1;
        litc.tab[13][3] = 1;
        litc.tab[13][4] = 1;
        litc.tab[13][5] = 1;
        litc.tab[13][6] = 1;

        //d
        litd.tab[8][3] = 1;
        litd.tab[8][4] = 1;
        litd.tab[8][5] = 1;
        litd.tab[8][6] = 1;
        litd.tab[9][2] = 1;
        litd.tab[10][2] = 1;
        litd.tab[11][2] = 1;
        litd.tab[12][2] = 1;
        litd.tab[9][7] = 1;
        litd.tab[10][7] = 1;
        litd.tab[11][7] = 1;
        litd.tab[12][7] = 1;
        litd.tab[13][3] = 1;
        litd.tab[13][4] = 1;
        litd.tab[13][5] = 1;
        litd.tab[13][6] = 1;
        for(int i = 1;i<14;i++)
            litd.tab[i][7] = 1;

        //e
        lite.tab[8][3] = 1;
        lite.tab[8][4] = 1;
        lite.tab[8][5] = 1;
        lite.tab[8][6] = 1;
        lite.tab[9][2] = 1;
        lite.tab[10][2] = 1;
        lite.tab[11][2] = 1;
        lite.tab[12][2] = 1;
        lite.tab[9][7] = 1;
        lite.tab[10][7] = 1;
        lite.tab[13][3] = 1;
        lite.tab[13][4] = 1;
        lite.tab[13][5] = 1;
        lite.tab[13][6] = 1;
        lite.tab[13][7] = 1;
        lite.tab[10][3] = 1;
        lite.tab[10][4] = 1;
        lite.tab[10][5] = 1;
        lite.tab[10][6] = 1;

        //f
        for(int i = 4;i<14;i++)
            litf.tab[i][2] = 1;
        litf.tab[3][3] = 1;
        litf.tab[2][4] = 1;
        litf.tab[2][5] = 1;
        litf.tab[6][1] = 1;
        litf.tab[6][3] = 1;
        litf.tab[6][4] =1;


        //h
        for(int i = 1;i<14;i++)
            lith.tab[i][2] = 1;
        lith.tab[8][3] = 1;
        lith.tab[8][4] = 1;
        lith.tab[8][5] = 1;
        lith.tab[8][6] = 1;
        lith.tab[9][2] = 1;
        lith.tab[9][7] = 1;
        lith.tab[10][7] = 1;
        lith.tab[11][7] = 1;
        lith.tab[12][7] = 1;
        lith.tab[13][7] = 1;

        //i
        for(int i = 8;i<14;i++)
            liti.tab[i][4] = 1;
        liti.tab[6][4] =1;

        //l
        for(int i = 1;i<13;i++)
            litl.tab[i][2] = 1;
        litl.tab[13][3] = 1;
        litl.tab[13][4] = 1;
        litl.tab[13][5] = 1;
        
        //o
        lito.tab[8][3] = 1;
        lito.tab[8][4] = 1;
        lito.tab[8][5] = 1;
        lito.tab[8][6] = 1;
        lito.tab[9][2] = 1;
        lito.tab[10][2] = 1;
        lito.tab[11][2] = 1;
        lito.tab[12][2] = 1;
        lito.tab[9][7] = 1;
        lito.tab[10][7] = 1;
        lito.tab[11][7] = 1;
        lito.tab[12][7] = 1;
        lito.tab[13][3] = 1;
        lito.tab[13][4] = 1;
        lito.tab[13][5] = 1;
        lito.tab[13][6] = 1;


        //A
        litA.czyDuza = 1;
        for(int i=1;i<14;i++)
            litA.tab[i][0] = 1;
        for(int i=1;i<14;i++)
            litA.tab[i][9] = 1;
        for(int i=1;i<9;i++)
            litA.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litA.tab[8][i] =1;

        //B
        litB.czyDuza = 1;
        for(int i=1;i<14;i++)
            litB.tab[i][0] = 1;
        for(int i=1;i<14;i++)
            litB.tab[i][9] = 1;
        for(int i=1;i<9;i++)
            litB.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litB.tab[7][i] =1;
        for(int i=1;i<9;i++)
            litB.tab[13][i] =1;
        litB.tab[7][9] =0;

        //C
        litC.czyDuza = 1;
        for(int i=1;i<13;i++)
            litC.tab[i][0] = 1;
        for(int i=1;i<9;i++)
            litC.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litC.tab[13][i] = 1;

        //D
        litD.czyDuza =1;
        for(int i=0;i<14;i++)
            litD.tab[i][0] = 1;
        for(int i=1;i<9;i++)
            litD.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litD.tab[13][i] = 1;
        for(int i=1;i<13;i++)
            litD.tab[i][9] = 1;

        //E
        litE.czyDuza = 1;
        for(int i=0;i<14;i++)
            litE.tab[i][0] = 1;
        for(int i=1;i<10;i++)
            litE.tab[0][i] = 1;
        for(int i=1;i<10;i++)
            litE.tab[13][i] = 1;
        for(int i=1;i<10;i++)
            litE.tab[7][i] = 1;

        //F
        litF.czyDuza =1;
        for(int i=0;i<14;i++)
            litF.tab[i][0] = 1;
        for(int i=1;i<10;i++)
            litF.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litF.tab[7][i] = 1;

        //H
        litH.czyDuza = 1;
        for(int i=0;i<14;i++)
            litH.tab[i][0] = 1;
        for(int i=0;i<14;i++)
            litH.tab[i][9] = 1;
        for(int i=1;i<10;i++)
            litH.tab[8][i] = 1;

        //I
        litI.czyDuza = 1;
        for(int i=0;i<14;i++)
            litI.tab[i][4] = 1;

        //L
        litL.czyDuza = 1;
        for(int i=0;i<14;i++)
            litL.tab[i][0] = 1;
        for(int i=1;i<10;i++)
            litL.tab[13][i] = 1;

        //O
        litO.czyDuza = 1;
        for(int i=1;i<13;i++)
            litO.tab[i][0] = 1;
        for(int i=1;i<13;i++)
            litO.tab[i][9] = 1;
        for(int i=1;i<9;i++)
            litO.tab[13][i] = 1;
        for(int i=1;i<9;i++)
            litO.tab[0][i] = 1;

        litery.add(lita);
        litery.add(litb);
        litery.add(litc);
        litery.add(litd);
        litery.add(lite);
        litery.add(litf);
        litery.add(lith);
        litery.add(liti);
        litery.add(litl);
        litery.add(lito);

        litery.add(litA);
        litery.add(litB);
        litery.add(litC);
        litery.add(litD);
        litery.add(litE);
        litery.add(litF);
        litery.add(litH);
        litery.add(litI);
        litery.add(litL);
        litery.add(litO);
    }
}
