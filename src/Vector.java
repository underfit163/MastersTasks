import java.util.Random;

public class Vector {
    private double[] mas;
    private int n;

    public Vector(int n) {
        this.n = n;
        mas = new double[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = rand.nextInt(5);
        }
    }

    public int getN() {
        return n;
    }

    public double getValue(int i) {
        return mas[i];
    }

    public void setValue(int i, double Val) {
        mas[i] = Val;
    }

    public void getMas() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%2f\t", mas[i]);
        }
        System.out.println();
    }

    public double[] getVect() {
        return mas;
    }

    public static double task2(Vector vect) {
        double max = vect.getValue(0);
        for (int i = 1; i < vect.getN(); i++) {
            if (max < vect.getValue(i)) {
                max = vect.getValue(i);
            }
        }
        return max;
    }

    public static double task4(Vector vect) {
        double mult = 1;
        for (int i = 0; i < vect.getN(); i++) {
            if (vect.getValue(i) > 0) {
                mult *= vect.getValue(i);
            }
        }
        return mult;
    }

    public static int task5(Vector vect, double val) {
        int k = -1;
        for (int i = vect.getN()-1; i >= 0; i--) {
            if (vect.getValue(i) == val) {
                k = i;
                return k;
            }
        }
        return k;
    }

    public static int task6(Vector vect) {
        int mult = 1;
        for (int i = 0; i < vect.getN(); i++) {
            if (vect.getValue(i) % 2 == 1 || vect.getValue(i) % 2 == -1) {
                mult *= vect.getValue(i);
            }
        }
        return mult;
    }

    public static int task7(Vector vect, double val) {
        int k = 0;
        for (int i = 0; i < vect.getN(); i++) {
            if (vect.getValue(i) == val) {
                k++;
            }
        }
        return k;
    }

    public static int task9(Vector vect) {
        int k = 0;
        double min = vect.getValue(0);
        for (int i = 1; i < vect.getN(); i++) {
            if (vect.getValue(i) < min) {
                min = vect.getValue(i);
                k = i;
            }
        }
        return k;
    }

    public static int task11(Vector vect, double val) {
        int k = -1;
        for (int i = 0; i < vect.getN(); i++) {
            if (vect.getValue(i) == val) {
                k = i;
                return k;
            }
        }
        return k;
    }

    public static int task12(Vector vect) {
        int mult = 1;
        for (int i = 0; i < vect.getN(); i++) {
            if (vect.getValue(i) % 2 == 0) {
                mult *= vect.getValue(i);
            }
        }
        return mult;
    }

    public static int task15(Vector vect) {
        int k = 0;
        double max = vect.getValue(0);
        for (int i = 1; i < vect.getN(); i++) {
            if (vect.getValue(i) > max) {
                max = vect.getValue(i);
                k = i;
            }
        }
        return k;
    }

    public static int task16(Vector vect) {
        int mult = 1;
        for (int i = 0; i < vect.getN(); i++) {
            if (vect.getValue(i) < 0) {
                mult *= vect.getValue(i);
            }
        }
        return mult;
    }

    public static double task19(Vector vect) {
        double sumMean = 0;
        int k = 0;
        for (int i = 0; i < vect.getN(); i++) {
            sumMean += vect.getValue(i);
            k++;
        }
        return sumMean / k;
    }

    public static double task22(Vector vect) {
        double min = vect.getValue(0);
        for (int i = 1; i < vect.getN(); i++) {
            if (min > vect.getValue(i)) {
                min = vect.getValue(i);
            }
        }
        return min;
    }

    public static int task24v1(Vector vect) {
        int index = 0;
        int indexStart = 0;
        int k = 1;
        int kMax = 1;
        double num = vect.getValue(0);
        for (int i = 1; i < vect.getN(); i++) {
            if (vect.getValue(i) == num) {
                k++;
            }
            if ((vect.getValue(i) != num) || (i == vect.getN() - 1)) {
                if (kMax < k) {
                    kMax = k;
                    indexStart = index;
                }
                num = vect.getValue(i);
                index = i;
                k = 1;
            }
        }
        return indexStart;
    }

    public static int task24v2(Vector vect) {
        int k = 1;
        int kMax = 1;
        int indexStart = 0;
        double num = vect.getValue(0);
        for (int i = 1; i < vect.getN(); i++) {
            if (vect.getValue(i) == num) {
                k++;
            } else {
                num = vect.getValue(i);
                k = 1;
            }
            if (k > kMax) {
                kMax = k;
                indexStart = i + 1 - k;
            }
        }
        return indexStart;
    }

    public static int task25(Vector vect) {
        int index = 0;
        int indexStart = 0;
        int k = 1;
        int kMin = Integer.MAX_VALUE;
        double num = vect.getValue(0);
        for (int i = 1; i < vect.getN(); i++) {
            if (vect.getValue(i) == num) {
                k++;
            }
            if ((vect.getValue(i) != num) || (i == vect.getN() - 1)) {
                if (k >= 2 && kMin > k) {
                    kMin = k;
                    indexStart = index;
                }
                num = vect.getValue(i);
                index = i;
                k = 1;
            }
        }
        return indexStart;
    }

    /**
     * Сортировка пузырьком по возрастанию
     *
     * @param vect передаваемый массив
     */
    public static void task26v1(Vector vect) {
        for (int i = 0; i < vect.getN(); i++) {
            for (int j = i + 1; j < vect.getN(); j++) {
                if (vect.getValue(i) > vect.getValue(j)) {
                    double temp = vect.getValue(i);
                    vect.setValue(i, vect.getValue(j));
                    vect.setValue(j, temp);
                }
            }
        }
        vect.getMas();
    }

    /**
     * Сортировка пузырьком по убыванию
     *
     * @param vect передаваемый массив
     */
    public static void task26v2(Vector vect) {
        for (int i = 0; i < vect.getN(); i++) {
            for (int j = i + 1; j < vect.getN(); j++) {
                if (vect.getValue(i) < vect.getValue(j)) {
                    double temp = vect.getValue(i);
                    vect.setValue(i, vect.getValue(j));
                    vect.setValue(j, temp);
                }
            }
        }
        vect.getMas();
    }

    /**
     * Сортировка пузырьком по возрастанию
     *
     * @param vect передаваемый массив
     */
    public static double task27(Vector vect) {
        double sumMean;
        for (int i = 0; i < vect.getN(); i++) {
            for (int j = i + 1; j < vect.getN(); j++) {
                if (vect.getValue(i) > vect.getValue(j)) {
                    double temp = vect.getValue(i);
                    vect.setValue(i, vect.getValue(j));
                    vect.setValue(j, temp);
                }
            }
        }
        vect.getMas();
        if (vect.getN() % 2 == 1) {
            sumMean = vect.getValue(vect.n / 2);
        } else {
            sumMean = (vect.getValue(vect.n / 2 - 1) + vect.getValue(vect.n / 2))/2;
        }
        return sumMean;
    }
}
