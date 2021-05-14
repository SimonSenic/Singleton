package sk.kosickaacademic.simon.examples;

public class Matrices2 { //Diagonals
    public static void main(String[] args) {
        int[][] matrix = new int[][]{ {2,5,9,8,1}, {8,9,-5,2,7}, {1,8,7,9,2}, {-2,4,0,7,2} };
        int prim=1, seco=1, j=0, k=matrix[0].length-1;

        for(int i=0; i<matrix.length; i++){
            prim*=matrix[i][j];
            seco*=matrix[i][k];
            j++; k--;
        }

        System.out.println(prim +" " +seco);
    }
}
