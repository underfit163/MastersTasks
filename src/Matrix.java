import java.util.Random;

public class Matrix {
    private int[][] matr;
    private int rows;
    private int cols;

    public Matrix(int Rows, int Cols) {
        rows = Rows;
        cols = Cols;
        matr = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matr[i][j] = rand.nextInt(10);
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int getValue(int Row, int Col) {
        return matr[Row][Col];
    }

    public void setValue(int Row, int Col, int Value) {
        matr[Row][Col] = Value;
    }

    public void getMatr() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d\t", matr[i][j]);
            }
            System.out.println();
        }
    }

    public static double task1(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (i >= j && i >= mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task3(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (j >= i && i <= mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task8(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (j > i && i > mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task10(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (j > i && i < mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task13(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (i == mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task14(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (i == j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task17(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (j < i && i < mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task18(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (j <= i && i <= mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task20(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (j >= i && i >= mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task21(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    if (i > j && i > mat.getCols() - 1 - j) {
                        sum += mat.getValue(i, j);
                        k++;
                    }
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static double task23(Matrix mat) {
        int sum = 0;
        int k = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    sum += mat.getValue(i, j);
                    k++;
                }
            }
        }
        System.out.println(k);
        return (double) sum / k;
    }

    public static int task28(Matrix mat) {
        int sum = 0;
        if (mat.getCols() == mat.getRows()) {
            for (int i = 0; i < mat.getRows(); i++) {
                sum += mat.getValue(i, i);
            }
        }
        return sum;
    }

    public static void task29v1(Matrix mat) {
        Matrix newMatr = new Matrix(mat.getCols(),mat.getRows());
            for (int i = 0; i < mat.getRows(); i++) {
                for (int j = 0; j < mat.getCols(); j++) {
                    newMatr.setValue(j,i,mat.getValue(i,j));
                }
        }
        newMatr.getMatr();
    }

    public static void task29v2(Matrix mat) {
        for (int i = 0; i < mat.getRows(); i++) {
            for (int j = i + 1; j < mat.getCols(); j++) {
                int temp = mat.getValue(i, j);
                mat.setValue(i, j, mat.getValue(j, i));
                mat.setValue(j, i, temp);
            }
        }
        mat.getMatr();
    }
}
