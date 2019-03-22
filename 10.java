import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //对于多个测试用例写个while循环
        while (scanner.hasNext())
        {
            String s = scanner.next();
            char[] chars = s.toCharArray();
            HashSet<Character> hashSet = new HashSet<>();
            for(int i=0; i<chars.length; i++)
            {
                if(!hashSet.contains(chars[i]))
                {
                    hashSet.add(chars[i]);
                }
            }
            System.out.println(hashSet.size());
        }
        scanner.close();
    }
}
