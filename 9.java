import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //对于多个测试用例写个while循环
        while (scanner.hasNext())
        {
            int number = scanner.nextInt();
            char[] chars = (number + "").toCharArray();
            HashSet<Character> hashSet = new HashSet<>();
            for(int i=chars.length-1; i>=0; --i)
            {
                if(hashSet.contains(chars[i]))
                {
                    chars[i] = 'a';
                }
                else
                {
                    hashSet.add(chars[i]);
                }
            }
            for(int i=chars.length-1; i>=0; --i)
            {
                if(chars[i] != 'a')
                {
                    System.out.print(chars[i]);
                }
            }
        }
        scanner.close();
    }
}
