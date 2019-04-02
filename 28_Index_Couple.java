import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int N = scanner.nextInt();
            int[] data = new int[N];
            for(int i=0; i<N; i++)
            {
                data[i] = scanner.nextInt();
            }
            int count = 0;
            int[] result = new int[N+1];
            for(int i=N-2; i>=0; i--)
            {
                for(int j=N-1; j>i; j--)
                {
                    count =  isPrime(data[i]+data[j]) ? result[i+1]-result[j]+result[j+1]+1 : result[i+1];
                    result[i] = Math.max(count, result[i]);
                }
            }
            System.out.println(result[0]);
        }
    }

    public static boolean isPrime(int t)
    {
        if(t < 2)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(t); i++)
        {
            if(t % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
