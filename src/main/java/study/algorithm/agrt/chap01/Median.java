package study.algorithm.agrt.chap01;

import java.util.Arrays;
import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구하여 출력
public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    static int med3_new(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1]; // 정렬된 배열에서 중간에 위치한 원소가 중앙값입니다.
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();

//        System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");
        System.out.println("중앙값은 " + med3_new(a,b,c) + "입니다.");

    }
}
