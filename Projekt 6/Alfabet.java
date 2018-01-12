import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 2017-10-03.
 */
public class Alfabet {//tworzenie danych wejsciowych w postaci liter

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

    Litera litG = new Litera();
    Litera litJ = new Litera();
    Litera litK = new Litera();
    Litera litM = new Litera();
    Litera litN = new Litera();
    Litera litP = new Litera();
    Litera litQ = new Litera();
    Litera litR = new Litera();
    Litera litT = new Litera();
    Litera litU = new Litera();


    List<Litera> litery = new ArrayList<Litera>();

    Alfabet()
    {

        //A
        for(int i=1;i<14;i++)
            litA.tab[i][0] = 1;
        for(int i=1;i<14;i++)
            litA.tab[i][9] = 1;
        for(int i=1;i<9;i++)
            litA.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litA.tab[8][i] =1;

        //B
        for(int i=1;i<14;i++)
            litB.tab[i][0] = 1;
        for(int i=1;i<14;i++)
            litB.tab[i][9] = 1;
        for(int i=0;i<9;i++)
            litB.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litB.tab[7][i] =1;
        for(int i=1;i<9;i++)
            litB.tab[13][i] =1;
        litB.tab[7][9] =0;
        litB.tab[13][9] = 0;

        //C
        for(int i=1;i<13;i++)
            litC.tab[i][0] = 1;
        for(int i=1;i<9;i++)
            litC.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litC.tab[13][i] = 1;

        //D
        for(int i=0;i<14;i++)
            litD.tab[i][0] = 1;
        for(int i=1;i<9;i++)
            litD.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litD.tab[13][i] = 1;
        for(int i=1;i<13;i++)
            litD.tab[i][9] = 1;

        //E
        for(int i=0;i<14;i++)
            litE.tab[i][0] = 1;
        for(int i=1;i<10;i++)
            litE.tab[0][i] = 1;
        for(int i=1;i<10;i++)
            litE.tab[13][i] = 1;
        for(int i=1;i<10;i++)
            litE.tab[7][i] = 1;

        //F
        for(int i=0;i<14;i++)
            litF.tab[i][0] = 1;
        for(int i=1;i<10;i++)
            litF.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litF.tab[7][i] = 1;

        //G
        for(int i=1;i<13;i++)
            litG.tab[i][0] = 1;
        for(int i=7;i<13;i++)
            litG.tab[i][9] = 1;
        for(int i=1;i<9;i++)
            litG.tab[13][i] = 1;
        for(int i=1;i<9;i++)
            litG.tab[0][i] = 1;
        litG.tab[7][8] =1;
        litG.tab[7][7] =1;
        litG.tab[7][6] =1;


        //H
        for(int i=0;i<14;i++)
            litH.tab[i][0] = 1;
        for(int i=0;i<14;i++)
            litH.tab[i][9] = 1;
        for(int i=1;i<10;i++)
            litH.tab[8][i] = 1;

        //I
        for(int i=0;i<14;i++)
            litI.tab[i][4] = 1;

        //J
        for(int i=0;i<13;i++)
            litJ.tab[i][9] =1;
        for(int i=4;i<9;i++)
            litJ.tab[13][i] =1;
        litJ.tab[11][3] =1;
        litJ.tab[12][3] =1;

        //K
        for(int i=0;i<14;i++)
            litK.tab[i][0] =1;
        for(int i=0;i<7;i++)
        {
            litK.tab[6-i][i+1] = 1;
            litK.tab[7+i][i+1] = 1;
        }
        //L
        for(int i=0;i<14;i++)
            litL.tab[i][0] = 1;
        for(int i=1;i<10;i++)
            litL.tab[13][i] = 1;

        //M
        for(int i=0;i<14;i++) {
            litM.tab[i][0] = 1;
            litM.tab[i][9] = 1;
        }
        for(int i=0;i<4;i++)
        {
            litM.tab[i][i+1] = 1;
            litM.tab[i][8-i] = 1;
        }

        //N
        for(int i=0;i<14;i++) {
            litN.tab[i][0] = 1;
            litN.tab[i][9] = 1;
        }
        litN.tab[0][1] = 1;
        litN.tab[13][8] = 1;
        for(int i=0;i<6;i++){
            litN.tab[2*i+1][i+2] =1;
            litN.tab[2*i+2][i+2] =1;
        }


        //O
        for(int i=1;i<13;i++)
            litO.tab[i][0] = 1;
        for(int i=1;i<13;i++)
            litO.tab[i][9] = 1;
        for(int i=1;i<9;i++)
            litO.tab[13][i] = 1;
        for(int i=1;i<9;i++)
            litO.tab[0][i] = 1;

        //P
        for(int i=0;i<14;i++)
            litP.tab[i][0] = 1;
        for(int i=0;i<9;i++)
            litP.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litP.tab[7][i] =1;
        for(int i=1;i<7;i++)
            litP.tab[i][9] =1;

        //Q
        for(int i=1;i<13;i++)
            litQ.tab[i][0] = 1;
        for(int i=1;i<12;i++)
            litQ.tab[i][9] = 1;
        for(int i=1;i<8;i++)
            litQ.tab[13][i] = 1;
        for(int i=1;i<9;i++)
            litQ.tab[0][i] = 1;
        litQ.tab[12][8] =1;
        litQ.tab[13][9] =1;
        litQ.tab[11][7] =1;

        //R
        for(int i=0;i<14;i++)
            litR.tab[i][0] = 1;
        for(int i=0;i<9;i++)
            litR.tab[0][i] = 1;
        for(int i=1;i<9;i++)
            litR.tab[7][i] =1;
        for(int i=1;i<7;i++)
            litR.tab[i][9] =1;
        for(int i=2;i<9;i++)
            litR.tab[i+5][i] = 1;

        //T
        for(int i=0;i<14;i++)
            litT.tab[i][5] = 1;
        for(int i=0;i<14;i++)
            litT.tab[i][4] = 1;
        for(int i=0;i<10;i++)
            litT.tab[0][i] = 1;

        //U
        for(int i=0;i<13;i++)
            litU.tab[i][0] = 1;
        for(int i=0;i<13;i++)
            litU.tab[i][9] = 1;
        for(int i=1;i<9;i++)
            litU.tab[13][i] = 1;



        litery.add(litA);
        litery.add(litB);
        litery.add(litC);
        litery.add(litD);
        litery.add(litE);
        litery.add(litF);
        litery.add(litG);
        litery.add(litH);
        litery.add(litI);
        litery.add(litJ);
        litery.add(litK);
        litery.add(litL);
        litery.add(litM);
        litery.add(litN);
        litery.add(litO);
        litery.add(litP);
        litery.add(litQ);
        litery.add(litR);
        litery.add(litT);
        litery.add(litU);
    }

    void wyswietlAlfabet() {
        for (int i = 0; i < litery.size(); i++) {
            litery.get(i).wyswietl();
            System.out.println();
        }
    }
}