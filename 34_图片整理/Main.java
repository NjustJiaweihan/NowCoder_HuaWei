import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            char[] pics = scanner.next().toCharArray();

            sort(pics, 0, pics.length-1);

            System.out.println(String.valueOf(pics));
        }

    }

    public static void sort(char[] pics, int lo, int hi)
    {
        if (hi <=  lo)
        {
            return;
        }
        int j = partion(pics, lo, hi);
        sort(pics, lo, j-1);
        sort(pics, j+1, hi);
    }

    public static int partion(char[] pics, int lo, int hi)
    {
        int i = lo;
        int j = hi+1;
        int v = pics[lo];

        while (true)
        {
            while (pics[++i] < v)
            {
                if(i == hi)
                {
                    break;
                }
            }
            while (pics[--j] > v)
            {
                if(j  == lo)
                {
                    break;
                }
            }
            if(i  >= j)
            {
                break;
            }
            exch(pics, i, j);
        }
        exch(pics, lo, j);
        return j;
    }

    public static void exch(char[] pics, int i, int j)
    {
        char temp = pics[i];
        pics[i] = pics[j];
        pics[j] = temp;
    }
}
