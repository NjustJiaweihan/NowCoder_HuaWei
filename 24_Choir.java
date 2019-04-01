import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int N = scanner.nextInt();
            int[] stu = new int[N];
            for(int i=0; i<N; i++)
            {
                stu[i] = scanner.nextInt();
            }
            int[] forward = LongestIncreaseSubseq(stu);
            int[] reverse = reverseArray(LongestIncreaseSubseq(reverseArray(stu)));
            int[] sum = new int[N];
            for(int i=0; i<N; i++)
            {
                sum[i] = forward[i] + reverse[i];
            }
            int max = -1;
            for(int i=0; i<N; i++)
            {
                if(sum[i] > max)
                {
                    max = sum[i];
                }
            }
            System.out.println(N - max + 1);
        }
    }

    public static int[] LongestIncreaseSubseq(int[] stu)
    {
        int[] dp = new int[stu.length];
        for(int i=0; i<stu.length; i++)
        {
            dp[i] = 1;
        }
        for(int i=0; i<stu.length; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(stu[j] < stu[i] && dp[j] >= dp[i])
                {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        return dp;
    }

    public static int[] reverseArray(int[] stu)
    {
        int N = stu.length - 1;
        for(int i=0; i<stu.length/2; i++)
        {
            int temp = stu[i];
            stu[i] = stu[N - i];
            stu[N - i] = temp;
        }
        return stu;
    }
}
