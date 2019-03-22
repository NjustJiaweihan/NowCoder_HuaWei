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
            int i = 1;
            int count = 0;
            while(i <= number)
            {
                i = i * 2;
            }
            i = i / 2;
            while (number > 0)
            {
                if (number >= i )
                {
                    number = number - i;
                    count++;
                    i = i / 2;
                }
                else
                {
                    i = i / 2;
                }
            }
            System.out.println(count);

        }
        scanner.close();
    }
}
