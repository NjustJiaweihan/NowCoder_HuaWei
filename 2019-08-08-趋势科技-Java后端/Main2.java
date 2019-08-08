package cn.deepblog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    private static int res = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] money = {1,5,10,20,50,100};

        int[] nums = new int[6];

        for(int i=0; i<6; i++){
            nums[i] = in.nextInt();
        }

        int sum = in.nextInt();

        dfs(money, nums, 0, sum, new ArrayList<>());

        if(res > 0){

            System.out.println(res);
        } else {

            System.out.println(-1);
        }
    }

    public static void dfs(int[] money, int[] nums, int index, int sum, ArrayList<Integer> list){

        boolean flag = true;

        for(int i=0; i<nums.length; i++){

            if(nums[i] < 0){
                flag = false;
            }
        }

        if(sum ==0 && flag){

            res += list.size();

        } else if(sum < 0 || !flag){

            return;
        }

        for(int i=index; i<money.length; i++){

            nums[i]--;
            sum -= money[i];
            list.add(money[i]);

            dfs(money, nums, i, sum, new ArrayList<Integer>(list));

            nums[i]++;

            sum += money[i];

            list.remove(list.size() - 1);
        }
    }
}
