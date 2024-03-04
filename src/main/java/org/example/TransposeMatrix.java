package org.example;

public class TransposeMatrix {
    public int[][] transposeMatrix(int[][] matrix) {
        int[][] matrixTransposed = initialiseTableau(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrixTransposed[1][j] = matrix[i][j];
                }
                matrixTransposed[0][j] = matrix[i][j];
            }
        }
        return matrixTransposed;
    }

    public int getNombreTotalDElements(int[][] matrix) {
        int nombreTotalDElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            nombreTotalDElements += matrix[i].length;
        }
        return nombreTotalDElements;
    }

    public int[][] initialiseTableau(int[][] matrix) {
        int nbColumn = getNombreTotalDElements(matrix) / 2;

        if (nbColumn == 1) {
            nbColumn++;
        }

        return new int[2][nbColumn];
    }
}
