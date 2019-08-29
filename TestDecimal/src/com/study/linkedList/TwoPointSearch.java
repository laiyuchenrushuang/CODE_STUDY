package com.study.linkedList;

public class TwoPointSearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char A = 'A', B = 'B', C = 'C';

        hanni(10, A, B, C);

    }

    public static int findTwoPoint(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (end - start) / 2 + start;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] > value) {
                // Ç°°ë²¿·Ö
                end = mid - 1;
            }
            if (arr[mid] < value) {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static void hanni(int desk, char A, char B, char C) {
        if (desk == 1) {
            System.out.println(desk + " desk " + A + " -> " + C);
        } else {
            hanni(desk - 1, A, C, B);
            System.out.println(desk + " desk " + A + " -> "+ C);
            hanni(desk - 1, B, A, C);
        }

    }

}
