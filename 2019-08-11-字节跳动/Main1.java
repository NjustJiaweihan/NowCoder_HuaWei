package cn.deepblog.ByteDance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        /**
         * 3
         * 5 0
         * 6 0
         * 7 0
         * 59
         * 6 59
         */
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<int[]> clocks = new ArrayList<>();

        for(int i=0; i<N; i++){

            int[] temp = new int[2];
            temp[0] = scanner.nextInt();
            temp[1] = scanner.nextInt();
            clocks.add(temp);
        }

        int walkTime = scanner.nextInt();

        int[] classTime = new int[2];

        classTime[0] = scanner.nextInt();
        classTime[1] = scanner.nextInt();

        for(int i=0; i<N; i++){

            if(isLate(clocks.get(i), walkTime, classTime) && i-1>=0){

                System.out.println(clocks.get(i-1)[0] + " " + clocks.get(i-1)[1]);
                return;
            } else {
                continue;
            }
        }
    }

    private static boolean isLate(int[] now, int walkTime, int[] classTime){

        int var1 = now[0] * 60 + now[1] +walkTime;
        int var2 = classTime[0] * 60 + classTime[1];

        return var1 > var2;
    }
}
