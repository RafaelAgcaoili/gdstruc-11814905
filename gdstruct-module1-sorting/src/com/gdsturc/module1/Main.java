package com.gdsturc.module1;

//quiz 1
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int [10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 64;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;



        System.out.println("before selection sort:");
        printArrayElements(numbers);


        descSelectionSort(numbers);
        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers);


    }



    //bubble sort
    //ascending bubble sort
    private static void ascBubbleSort(int[] arr){
        for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--){
            for (int i = 0; i < lastSortedIndex; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    //descending bubble sort
    private static void descBubbleSort(int[] arr){
        for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--){
            for (int i = 0; i < lastSortedIndex; i++){
                if (arr[i] < arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void printArrayElements(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }



    // Selection Sort
    private static void selectionSort(int[] arr){
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largestIndex = 0;

            for(int i = 1; i <= lastSortedIndex; i++){
                if (arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }

            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }


    }

    //selection sort of 'looking for the largest and putting it in the beginning' cuz the one in the discussion is different
    private static void reverseSelectionSort(int[] arr){
        for (int lastSortedIndex = 0; lastSortedIndex < arr.length; lastSortedIndex++) {
            int largestIndex = arr.length - 1;

            for(int i = arr.length - 1; i >= lastSortedIndex; i--){
                if (arr[i] > arr[largestIndex]){
                    largestIndex = i;
                }

            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }


    }

    //smallest value first
    private static void descSelectionSort(int[] arr){
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largestIndex = 0;

            for(int i = 1; i <= lastSortedIndex; i++){
                if (arr[i] < arr[largestIndex]){
                    largestIndex = i;
                }

            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }


    }
}





