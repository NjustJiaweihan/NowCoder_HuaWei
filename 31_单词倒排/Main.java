import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String[] s = scanner.nextLine().split(" ");
            Stack<String> words  = new Stack<>();
            StringBuilder result = new StringBuilder();
            for(int i=0; i<s.length; i++)
            {
                words.push(s[i]);
            }
            for(int i=0; i<s.length; i++)
            {
                result.append(words.pop() + " ");
            }
                System.out.println(result.substring(0, result.length()-1));
        }
    }
}
