import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //对于多个测试用例写个while循环
        while (scanner.hasNext())
        {
            char[] chars = scanner.nextLine().toCharArray();
            StringBuilder s = new StringBuilder();
            for(int i=chars.length-1; i>=0; i--)
            {
                s.append(chars[i]);
            }
            System.out.println(s);
        }
        scanner.close();
    }
}
