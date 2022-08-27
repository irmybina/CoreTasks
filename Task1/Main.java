package Task1;

import static java.lang.Math.sqrt;

public class Main {
    public static int[][] generateRandomArray(int entryPoint, int size){
        double omega = (sqrt(5) - 1) / 2;
        double[] omegas = new double[10000];
        for (int i = 0; i<10000; i++){
            omegas[i] = omega * (i+1+entryPoint);
        }

        int[][] a = new int[size][size];
        int count = 0;

        for (int i=0; i < size; i++){
            for (int j=0; j<size; j++){
                a[i][j] = (int)(omegas[count]%0.01*100000);
                count++;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int size = 20;
        int[][] array = generateRandomArray((int)(Math.random()*100), size);
        int arrayMax = array[0][0];
        int arrayMin = array[0][0];
        int arraySum = 0;

        System.out.println("Task 1:\n");
        System.out.println("Array:");

        for (int i=0; i<size; i++){
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");}

        System.out.println("");

        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++) {
                if (array[i][j] > arrayMax) arrayMax = array[i][j];
                if (array[i][j] < arrayMin) arrayMin = array[i][j];
                arraySum += array[i][j];
            }
        }

        System.out.println("max: " + arrayMax + ";\nmin: " + arrayMin + "\naverage: " + arraySum/900);

    }
}