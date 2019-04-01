import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String code = scanner.next();
            if(isLength(code) && isKinds(code) && isRepeat(code))
            {
                System.out.println("OK");
            }
            else
            {
                System.out.println("NG");
            }
        }
    }

    public static boolean isLength(String code)
    {
        return code.length() > 8;
    }

    public static boolean isKinds(String code)
    {
        boolean number = false;
        boolean lowCase = false;
        boolean upCase = false;
        boolean elseLetter = false;

        for(int i=0; i<code.length(); i++)
        {
            if(code.charAt(i)>='0' && code.charAt(i)<='9')
            {
                number = true;
                continue;
            }
            if(code.charAt(i)>='a' && code.charAt(i)<='z')
            {
                lowCase = true;
                continue;
            }
            if(code.charAt(i)>='A' && code.charAt(i)<='Z')
            {
                upCase = true;
                continue;
            }
            elseLetter = true;
        }

        if(!number)
        {
            if(!lowCase || !upCase || !elseLetter)
            {
                return false;
            }
        }
        if (!lowCase)
        {
            if(!upCase || !elseLetter)
            {
                return false;
            }
        }
        if (!upCase)
        {
            return elseLetter;
        }

        return true;
    }

    //TODO
    public static boolean isRepeat(String code)
    {
        int num = 0;
        for ( int i = 3 ; i <= code.length()/2 ; i++ ) {
            for ( int j = 0 ; j < code.length() - i ; j++ ) {
                String s = code.substring(j, j + i );
                if ( code.indexOf(s) != code.lastIndexOf(s) ) {
                    num++;
                }
            }
        }
        return num == 0;
    }
}
