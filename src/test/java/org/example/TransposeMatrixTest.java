package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TransposeMatrixTest {


    @Test
    public void fake() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Doit retourner 2")
    void shouldReturn2() {
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}};
        int nbElementsTableau = matrix.length;
        Assertions.assertEquals(2, nbElementsTableau);
    }

    @Test
    @DisplayName("Doit retourner 6")
    void shouldReturn6() {
        int[][] matrix = {{1, 2, 3}, {1, 2, 3}};

        int nombreTotalDElements = new TransposeMatrix().getNombreTotalDElements(matrix);
        ;

        Assertions.assertEquals(6, nombreTotalDElements);
    }

    @Test
    @DisplayName("Doit retourner un tableau avec 2 lignes")
    void shouldReturnATabWith2Column() {

        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {5, 6, 7},
                {5, 6, 7}
        };


//        int[][] transposeMatrix = {
//                {1, 2, 3, 4, 5, 6},
//                {7, 8, 9, 10, 11, 12},
//        };

        int[][] initialisedTableau = new TransposeMatrix().initialiseTableau(matrix);
        int result = initialisedTableau.length;
        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("Doit retourner un tableau avec 6 colonnes")
    void shouldReturnATabWith2RowsAnd6Columns() {

        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {5, 6, 7},
                {5, 6, 7}
        };


//        int[][] transposeMatrix = {
//                {1, 2, 3, 4, 5, 6},
//                {7, 8, 9, 10, 11, 12},
//        };

        int[][] initialisedTableau = new TransposeMatrix().initialiseTableau(matrix);
        Assertions.assertEquals(6, initialisedTableau[0].length);
    }

    @Test
    @DisplayName("Doit retourner une matrice avec 1 pour row 0 colonne 0")
    void shouldReturn1() {
        int[][] matrix = {{1,2}};
        Assertions.assertEquals(1, new TransposeMatrix().transposeMatrix(matrix)[0][0]);
    }

    @Test
    @DisplayName("Doit retourner une matrice avec 2 pour row 0 colonne 1")
    void shouldReturn2ForRow0AndColumn1() {
        int[][] matrix = {{1,2}};
        Assertions.assertEquals(2, new TransposeMatrix().transposeMatrix(matrix)[0][1]);
    }

    @Test
    @DisplayName("Doit retourner une matrice avec 3 pour row 0 colonne 0")
    void shouldReturn3() {
        int[][] matrix = {{3,4}};
        Assertions.assertEquals(3, new TransposeMatrix().transposeMatrix(matrix)[0][0]);
    }

    @Test
    @DisplayName("Doit retourner une matrice avec 4 pour row 0 colonne 1")
    void shouldReturn4ForRow0AndColumn1() {
        int[][] matrix = {{3,4}};
        Assertions.assertEquals(4, new TransposeMatrix().transposeMatrix(matrix)[0][1]);
    }

    @Test
    @DisplayName("Doit retourner une matrice avec 2 pour row 0 colonne 1")
    void shouldReturn2ForRow0Column1() {
        int[][] matrix = {{1,2},{3,4}};
        Assertions.assertEquals(2, new TransposeMatrix().transposeMatrix(matrix)[0][1]);
    }

    @Test
    @DisplayName("Doit retourner une matrice avec 3 pour row 1 colonne 0")
    void shouldReturn3ForRow1Column0() {
        int[][] matrix = {{1,2},{3,4}};
        Assertions.assertEquals(3, new TransposeMatrix().transposeMatrix(matrix)[1][0]);
    }

    @Test
    @DisplayName("Doit retourner une matrice avec 2 pour row 1 colonne 1")
    void shouldReturn4ForRow1Column1() {
        int[][] matrix = {{1,2},{3,4}};
        Assertions.assertEquals(4, new TransposeMatrix().transposeMatrix(matrix)[1][1]);
    }

    @Test
    @DisplayName("Doit retourner une matrice avec 2 pour row 1 colonne 1")
    void shouldReturn4ForRow1Column1When3rows() {
        int[][] matrix = {{1,2},{3,4},{5,6}};
        Assertions.assertEquals(4, new TransposeMatrix().transposeMatrix(matrix)[1][1]);
    }
}