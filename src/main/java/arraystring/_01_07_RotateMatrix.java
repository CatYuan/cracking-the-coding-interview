package arraystring;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 *
 * Runtime: O(n2)
 */
class _01_07_RotateMatrix {
    int[][] rotate(int[][] m) {
        if (m == null) return null;
        int heightM = m.length;
        int widthM = m[0].length;
        int output[][] = new int [widthM][heightM];
        for (int y = 0; y < heightM; ++y) {
            for (int x = 0; x < widthM; ++x) {
                output[x][output.length - 1 - y] = m[y][x];
            }
        }
        return output;
    }


}
