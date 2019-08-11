package cn.deepblog.ByteDance;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] years = new int[N];

        for(int i=0; i<N; i++){

            years[i] = scanner.nextInt();
        }

        long[] money = new long[N];

        for(int i=0; i<N; i++){

            money[i] = 100;
        }

        for(int i=1; i<N; i++){

            while (years[i] > years[i-1] && money[i] <= money[i-1]){
                money[i] += 100;
            }
        }

        for(int i=N-2; i>=0; i--){

            while (years[i] > years[i+1] && money[i] <= money[i+1]){
                money[i] += 100;
            }
        }

        long sum = 0;

        for(long m : money){

            sum += m;
        }

        System.out.println(sum);
    }
}
