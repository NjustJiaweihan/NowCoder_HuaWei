import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            int N = scanner.nextInt();
            String[] words = new String[N];
            for(int i=0; i<N; i++)
            {
                words[i] = scanner.next();
            }
            String word = scanner.next();
            int index = scanner.nextInt();

            findBrotherWord(word, words, N, index);
        }
    }

    public static void findBrotherWord(String word,String s[],int n,int index)
    {
        int count=0;
        ArrayList<String> list=new ArrayList<String>();
        for(int i = 0; i< n; i++)
        {
            if(isBrother(word,s[i]))
            {
                count++;
                list.add(s[i]);
            }
        }
        Collections.sort(list);
        if(list.size() == 0)
        {
            System.out.println(0);
            return;
        }
        if(index > count)
        {
            System.out.println(count);
            return;
        }
        if(1<=index)
        {
            System.out.println(count+" ");
            System.out.println(list.get(index-1));
        }

    }

    public static boolean isBrother(String s1, String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        if(s1.equals(s2))
        {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i=0; i<s1.length(); i++)
        {
            if(c1[i] != c2[i])
            {
                return false;
            }
        }
        return true;
    }
}
