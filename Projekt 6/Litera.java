public class Litera {//litera z odpowiednimi metodami
    public int[][] tab = new int[14][10];
    int[] input = new int[6];

    Litera()
    {
        for(int i=0; i<6;i++)
            input[i] = 0;
        for(int i=0; i<14;i++)
            for(int j=0;j<10;j++)
                tab[i][j] = 0;
    }


//    public void wyswietl()
//    {
//        for(int i =0;i<14;i++) {
//            for (int j = 0; j < 10; j++)
//                System.out.print(tab[i][j]+ "\t");
//            //System.out.println();
//        }
//    }

    public void wyswietl()
    {
        for(int i =0;i<14;i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(tab[i][j]);
            System.out.println();
        }
    }

    public void update()
    {
        for(int i = 0;i<2;i++)
            for(int j=0;j<7;j++)
                input[0] += tab[j][i];
        for(int i = 2;i<8;i++)
            for(int j=0;j<7;j++)
                input[1] += tab[j][i];
        for(int i = 8;i<10;i++)
            for(int j=0;j<7;j++)
                input[2] += tab[j][i];
        for(int i = 0;i<2;i++)
            for(int j=7;j<14;j++)
                input[3] += tab[j][i];
        for(int i = 2;i<8;i++)
            for(int j=7;j<14;j++)
                input[4] += tab[j][i];
        for(int i = 8;i<10;i++)
            for(int j=7;j<14;j++)
                input[5] += tab[j][i];
    }
}