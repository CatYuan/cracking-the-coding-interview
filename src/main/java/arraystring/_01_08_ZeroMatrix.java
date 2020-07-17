package arraystring;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 *
 * Runtime: O(M2xN2)
 */
class _01_08_ZeroMatrix {
    int[][] zero(int[][] matrix) {
        boolean altered[][] = new boolean[matrix.length][matrix[0].length];

        for (int y = 0; y < matrix.length; ++y) {
            for (int x = 0; x < matrix[y].length; ++x) {
                if (matrix[y][x] == 0 && !altered[y][x]) {
                    for (int i = 0; i < matrix[y].length; ++i) {
                        altered[y][i] = true;
                        if (matrix[y][x] == 0) {
                            altered[y][i] = false;
                        }
                        matrix[y][i] = 0;
                    }
                    for (int i = 0; i < matrix.length; ++i) {
                        altered[i][x] = true;
                        if (matrix[i][x] == 0) {
                            altered[i][x] = false;
                        }
                        matrix[i][x] = 0;
                    }
                    break;
                }
            }
        }
        return matrix;
    }
}
