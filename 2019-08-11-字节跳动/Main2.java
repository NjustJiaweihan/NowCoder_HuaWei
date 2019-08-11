package cn.deepblog.ByteDance;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        scanner.nextLine();
        
        int len = n + k - 1;
        int[] nums = new int[len];
        
        char[] cs = scanner.nextLine().toCharArray();
        
        for(int i=0; i<len; i++){
            nums[i] = cs[i] - '0';
        }
        
        int[] result = new int[n];
        result[0] = nums[0];
        for(int i=1; i<n; i++){
            
            result[i] = nums[i];
            for(int j=i-1; j>=0&&i-j<k; j--){
                result[i] ^= result[j];
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int r : result){

            sb.append(r);
        }

        System.out.println(sb.toString());
    }
}
