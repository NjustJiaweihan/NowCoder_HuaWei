import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String str = scanner.next();
            String strNew = "";
            int[] wordNum = new int[26];
            for(int i=0; i<str.length(); i++)
            {
                wordNum[str.charAt(i) - 'a']++;
            }
            int min = wordNum[str.charAt(0) - 'a'];
            for(int i=0; i<str.length(); i++)
            {
                if(wordNum[str.charAt(i) - 'a'] < min)
                {
                    min = wordNum[str.charAt(i) - 'a'];
                }
            }
            for(int i=0; i<str.length(); i++)
            {
                if(wordNum[str.charAt(i) - 'a'] > min)
                {
                    strNew += str.charAt(i) + "";
                }
            }
            System.out.println(strNew);
        }

    }
}
