import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //对于多个测试用例写个while循环
        while (scanner.hasNext())
        {
            //预算
            int N = scanner.nextInt()/10;
            //商品数
            int m = scanner.nextInt();
            //价格数组
            int[] price = new int[m];
            //重要度*价格
            int[] value = new int[m];
            //主件还是附件 附件的isMain记录的是主件号
            int[] isMain = new int[m];
            for(int i=0; i<m; i++)
            {
                price[i] = scanner.nextInt()/10;
                value[i] = scanner.nextInt() * price[i];
                isMain[i] = scanner.nextInt();
            }

            int[][] dp = new int[m+1][N+1];
            //dp[i][j]表示用j钱购买i件物品的总价值 背包中总价值
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=N;j++)
                {
                    if(isMain[i-1]==0)
                    {  //表示为主件
                        if(j >= price[i-1])
                        {
                            //买-->dp[i][j]=dp[i-1][j-price[i-1]]+value[i-1]
                            //不买-->dp[i][j]=dp[i-1][j]
                            dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-price[i-1]]+value[i-1]);
                            //分别表示不买第i件和买第i件物品之后的最大价值
                        }else {
                            dp[i][j]=dp[i-1][j];
                        }
                    }
                    else
                    {   //表示为附件，附件需要购买主件
                        if(j >= price[i-1]+price[isMain[i-1]-1])
                        {
                            dp[i][j]=Math.max(dp[i-1][j]
                                    ,dp[i-1][j-price[i-1]-price[isMain[i-1]-1]]+value[i-1]+value[isMain[i-1]-1]);
                        }
                        else{
                            dp[i][j]=dp[i-1][j];
                        }
                    }
                }
            }
            System.out.println(dp[m][N] * 10);
        }
        scanner.close();
    }
}
