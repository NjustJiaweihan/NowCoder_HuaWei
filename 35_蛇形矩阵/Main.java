import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int N = scanner.nextInt();
            //矩阵行号增量
            int index = 0;
            //用于赋值
            int delta = 1;
            //初始值全为0
            int[][] result = new int[N][N];
            StringBuilder lineStr = new StringBuilder();
            while (index < N)
            {
                //index = 0 : (0,0)
                //index = 1 : (1,0)(0,1)
                //index = 2 : (2,0)(1,1)(0,2)
                //index = 3 : (3,0)(2,1)(1,2)(0,3)
                //对于每个index i都是从index递减到0 j同时递增
                for(int i=index, j=0; i>=0; i--,j++)
                {
                    result[i][j] = delta;
                    delta++;
                }
                index++;
            }

            for(int i=0; i<N; i++)
            {
                for (int j=0; j<N; j++)
                {
                    if(result[i][j] != 0)
                    {
                        lineStr.append(result[i][j]).append(" ");
                    }
                }
                System.out.println(lineStr.substring(0, lineStr.length()-1));
                lineStr.delete(0, lineStr.length());
            }
        }
    }
}
