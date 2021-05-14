package sk.kosickaacademic.simon.examples;

public class Matrices { //Multiplying
    public static void main(String[] args) {
        int[][] a = new int[][]{ {3,7,5}, {2,4,9} };
        int[][] b = new int[][]{ {7,2,9}, {1,8,5}, {0,2,4} };
        int[][] c = new int[2][3];

        int countA, countB1, countB2=0;
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                int res=0;
                countA = 0;
                countB1 = 0;
                for(int k=0; k<c[0].length; k++){
                    res+=a[i][countA] * b[countB1][countB2];
                    countA++;
                    countB1++;
                }
                c[i][j] = res;
                countB2++;
            }
            countB2=0;
        }

        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                System.out.println(c[i][j] +" ");
            }
        }

    }
}
