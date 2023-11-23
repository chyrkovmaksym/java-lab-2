public class MatrixOperations {
    private final Matrix matrix1;
    private final Matrix matrix2;

    public MatrixOperations(float[][] data1, float[][] data2) {
        this.matrix1 = new Matrix(data1);
        this.matrix2 = new Matrix(data2);
    }

    public void processMatrices() {
        try {
            Matrix sumMatrix = Matrix.add(matrix1, matrix2);
            System.out.println("Sum of two matrices:");
            sumMatrix.print();

            processMatrix(sumMatrix);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void processMatrix(Matrix matrix) throws Exception {
        float[][] data = matrix.data();

        if (data == null || data.length == 0 || data[0].length == 0) {
            throw new Exception("Invalid matrix size.");
        }

        float sumMaxOdd = sumMaxElements(data);
        float sumMinEven = sumMinElements(data);

        System.out.println("Sum of the largest elements in odd-numbered rows: " + sumMaxOdd);
        System.out.println("Sum of the smallest elements in even-numbered rows: " + sumMinEven);
    }

    private static float sumMaxElements(float[][] data) {
        float sum = 0;

        for (int i = 1; i < data.length; i += 2) {
            float max = data[i][0];
            for (int j = 1; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
            sum += max;
        }

        return sum;
    }

    private static float sumMinElements(float[][] data) {
        float sum = 0;

        for (int i = 0; i < data.length; i += 2) {
            float min = data[i][0];
            for (int j = 1; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    min = data[i][j];
                }
            }
            sum += min;
        }

        return sum;
    }
}
