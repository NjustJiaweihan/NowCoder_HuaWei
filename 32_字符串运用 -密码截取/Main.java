import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String str = scanner.next();

            //构造奇数回文串
            StringBuilder newStr = new StringBuilder();
            newStr.append("#");
            for(int  i=0; i<str.length(); i++)
            {
                newStr.append(str.charAt(i));
                newStr.append("#");
            }

            int[] rad = new int[newStr.length()];
            int right = -1;
            int id = -1;

            for(int i=0; i<newStr.length(); i++)
            {
                int r = 1;
                // . . .  .  . . . .
                //   j   id    i
                //j=id*2-i   j到id的距离=id-j=i-id
                if(i <= right)
                {
                    r = Math.min(rad[id]-id+i, rad[2*id-i]);
                }
                //i-r不出左边界 i+r不出右边界 再拓展r
                while (i-r>=0 && i+r<newStr.length() && newStr.charAt(i-r)==newStr.charAt(i+r))
                {
                    r++;
                }
                //TODO 为何是i的右边界超了id右边界 更新right和id
                if(i+r-1 > right)
                {
                    right = i+r-1;
                    id = i;
                }
                rad[i] = r;
            }

            int max = -1;
            for(int i=0; i<newStr.length(); i++)
            {
                if(rad[i] > max)
                {
                    max = rad[i];
                }
            }

            System.out.println(max - 1);
        }
    }
}
