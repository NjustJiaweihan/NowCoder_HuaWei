import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //对于多个测试用例写个while循环
        while (scanner.hasNext())
        {
           String[] s = scanner.nextLine().split(" ");
           for(int i=s.length-1; i>=0; i--)
           {
               System.out.print(s[i] + " ");
           }
        }
        scanner.close();
    }
}
