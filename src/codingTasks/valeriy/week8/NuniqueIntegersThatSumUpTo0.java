package codingTasks.valeriy.week8;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/




    public static int[] sumZero(int N) {
        int[] result = new int[N];


        for (int i = 0; i < N / 2; i++) {
            result[i] = i + 1;
            result[N - 1 - i] = -(i + 1);
        }


        if (N % 2 != 0) {
            result[N / 2] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] result = sumZero(N);

        int M = 11;
        int[] result1 = sumZero(M);


        System.out.println(java.util.Arrays.toString(result));
        System.out.println(java.util.Arrays.toString(result1));

    }









}
