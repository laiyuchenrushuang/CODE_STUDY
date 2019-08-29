package com.study;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class StackLoopTest {

    public static void main(String[] args) {
        // 测试入栈出栈循环
        // stackTest(5);
        // int[] arr = { 10, 20, 30, 22, 12, 34, 23, 0, 5, 4, 16, 88 };
        // int[] sort = sort(arr);
        // for (int i = 0; i < sort.length; i++) {
        // System.out.print(sort[i] + " ");
        // }
        reverse("how are you");
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        Integer poll = queue.poll();
        System.out.println(poll);
    }

    public static int stackTest(int a) {
        Stack<Integer> stack = new Stack<>();
        int result = 1;
        stack.push(a);
        while (!stack.isEmpty()) {
            a = stack.pop();
            result *= a;
            if (a > 1) {
                stack.push(a - 1);
            }
        }
        return result;
    }

    // 双重循环实现建树形结构

    public static int[] sort(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        return array;
    }

    public static void reverse(String message) {
        char[] charArray = message.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            stack.push(charArray[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

}
