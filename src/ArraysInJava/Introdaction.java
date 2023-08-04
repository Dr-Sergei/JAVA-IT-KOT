package ArraysInJava;

import java.util.Arrays;

public class Introdaction {
    public static void main(String[] args) {
        int[] arr = new int[10];
//
//        arr[0] = 6767;

//        System.out.println(Arrays.toString(arr));

// dwumernij array
//        int[][] array = new int[2][4];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("das ist " + (i + 1) + ". durchlauf: ");
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = j + 23;
//                System.out.print("Element " + (j + 1) + " ist: " + array[i][j] + "; ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - i;
        }

        System.out.println(Arrays.toString(arr));

        //sortirowka massivow

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
