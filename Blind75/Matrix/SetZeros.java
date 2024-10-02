package Blind75.Matrix;

public class SetZeros {

  static void setZeros(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    boolean firstRowHasZero = false;
    boolean firstColHasZero = false;

    for (int j = 0; j < n; j++) {
      if (matrix[0][j] == 0) {
        firstRowHasZero = true;
        break;
      }
    }

    for (int i = 0; i < m; i++) {
      if (matrix[i][0] == 0) {
        firstColHasZero = true;
        break;
      }
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }

    if (firstRowHasZero) {
      for (int j = 0; j < n; j++) {
        matrix[0][j] = 0;
      }
    }

    if (firstColHasZero) {
      for (int i = 0; i < m; i++) {
        matrix[i][0] = 0;
      }
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 1, 1 },
        { 1, 0, 1 },
        { 1, 1, 1 }
    };

    setZeros(matrix);

    // Print the modified matrix
    for (int[] row : matrix) {
      for (int value : row) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }
}
