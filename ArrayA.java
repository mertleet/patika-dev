package Arrays;

public class ArrayA {
    public static void main(String[] args) {
        String[][] matrix = new String[9][9];
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (i == 0 || i == 4 || i == 8 ){
                    matrix[i][j] = " * ";
                }
                else if (j == 0 || j == 8) {
                    matrix[i][j] = " * ";
                }
                else {
                    matrix[i][j] = "   ";
                }
            }
        }
        for (String[] row : matrix) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
