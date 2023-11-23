public class Main {
    public static void main(String[] args) {
        float[][] data1 = {
                {1.0f, 2.0f, 3.0f},
                {4.0f, 5.0f, 6.0f},
                {7.0f, 8.0f, 9.0f}
        };

        float[][] data2 = {
                {9.0f, 8.0f, 7.0f},
                {6.0f, 5.0f, 4.0f},
                {3.0f, 2.0f, 1.0f}
        };

        MatrixOperations matrixOperations = new MatrixOperations(data1, data2);
        matrixOperations.processMatrices();
    }
}