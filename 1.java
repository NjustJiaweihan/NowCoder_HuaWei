import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = "";
        int count = 0;
        if(scan.hasNextLine())
        {
            s = scan.nextLine().toLowerCase();
        }
        for(int i=s.length()-1; i>=0; --i)
        {
            if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
            {
                count++;
            }
            else if(count != 0)
            {
                System.out.print(count);
                return;
            }
            else
            {
                while (s.charAt(i) != ' ')
                {
                    i--;
                }
            }
        }
        System.out.println(count);
    }
}
