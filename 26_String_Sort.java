import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
            String string=in.nextLine();
            LinkedList<String> list=new LinkedList<>();
            char[] cs=string.toCharArray();

            for(int i=0;i<cs.length;i++)
            {
                if((cs[i]>='a'&&cs[i]<='z')||(cs[i]>='A'&&cs[i]<='Z'))
                {
                    list.add(String.valueOf(cs[i]));
                }

            }
            //字符串忽略大小写排序
            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

            for(int i=0,j=0;i<cs.length;i++)
            {
                if((cs[i]>='a'&&cs[i]<='z')||(cs[i]>='A'&&cs[i]<='Z'))
                {
                    System.out.print(list.get(j));
                    j++;
                }
                else
                {
                    System.out.print(cs[i]);
                }
            }
            System.out.println();
        }
    }
}
