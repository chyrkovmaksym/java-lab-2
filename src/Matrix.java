public record Matrix(float[][] data) {

    public static Matrix add(Matrix matrixA, Matrix matrixB) throws Exception {
        float[][] dataA = matrixA.data();
        float[][] dataB = matrixB.data();

        int rows = dataA.length;
        int cols = dataA[0].length;

        if (rows != dataB.length || cols != dataB[0].length) {
            throw new Exception("Incorrect matrix dimensions for addition.");
        }

        float[][] result = new float[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = dataA[i][j] + dataB[i][j];
            }
        }

        return new Matrix(result);
    }

    public void print() {
        float[][] data = this.data;
        for (float[] datum : data) {
            for (float v : datum) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
