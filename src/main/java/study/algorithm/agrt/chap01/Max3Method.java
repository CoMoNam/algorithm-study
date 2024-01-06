package study.algorithm.agrt.chap01;
//세 정수의 최댓값 구하기 method
public class Max3Method {
    static int max3(int a, int b, int c) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    //네 정수의 최댓값 구하기 method
    static int max4_pr(int a, int b, int c, int d) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    // 세 값의 최솟값을 구하는 method
    static int min3_pr(int a, int b, int c) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    // 네 값의 최솟값을 구하는 method
    static int min4_pr(int a, int b, int c, int d) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(1,2,3) = " + max3(1,2,3));
    }
}
