import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String code = scanner.next();
            StringBuilder newCode = new StringBuilder();
            for(int i=0; i<code.length(); i++)
            {
                char c = code.charAt(i);
                if(c >= 'A' && c <= 'Y')
                {
                    char cc = (char) (c + 1);
                    String ccc = String.valueOf(cc).toLowerCase();
                    newCode.append(ccc);
                }
                else if(c == 'Z')
                {
                    newCode.append('a' + "");
                }
                else if(c >= '0' && c <= '9')
                {
                    newCode.append(c);
                }
                else if(c >= 'a' && c <= 'c')
                {
                    newCode.append('2' + "");
                }
                else if(c >= 'd' && c <= 'f')
                {
                    newCode.append('3' + "");
                }
                else if(c >= 'g' && c <= 'i')
                {
                    newCode.append('4' + "");
                }
                else if(c >= 'j' && c <= 'l')
                {
                    newCode.append('5' + "");
                }
                else if(c >= 'm' && c <= 'o')
                {
                    newCode.append('6' + "");
                }
                else if(c >= 'p' && c <= 's')
                {
                    newCode.append('7' + "");
                }
                else if(c >= 't' && c <= 'v')
                {
                    newCode.append('8' + "");
                }
                else if(c >= 'w' && c <= 'z')
                {
                    newCode.append('9' + "");
                }
            }
            System.out.println(newCode);
        }
    }
}
