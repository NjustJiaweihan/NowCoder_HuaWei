import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String s1 = scanner.next();
            String s2 = scanner.next();
            String s = sort(s1 + s2);
            System.out.println(transform(s));

        }
    }

    public static String sort(String s)
    {
        List<Character> l1 = new LinkedList<>();
        List<Character> l2 = new LinkedList<>();

        for(int i=0; i<s.length(); i++)
        {
            if(i % 2 == 0)
            {
                l1.add(s.charAt(i));
            }
            else {
                l2.add(s.charAt(i));
            }
        }
        Collections.sort(l1);
        Collections.sort(l2);

        StringBuilder result = new StringBuilder();
        int m=0;
        int n=0;
        for(int i=0; i<s.length(); i++)
        {
            if(i % 2 == 0)
            {
                result.append(l1.get(m++));
            }
            else {
                result.append(l2.get(n++));
            }
        }
        return String.valueOf(result);
    }

    public static String transform(String s)
    {
        StringBuilder binaryString = new StringBuilder();
        String reverseString;
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9'
            || s.charAt(i)>='a' && s.charAt(i)<='f'
            || s.charAt(i)>='A' && s.charAt(i)<='F')
            {
                binaryString = new StringBuilder(Integer.toBinaryString(Integer.parseInt(Integer.valueOf(s.charAt(i) + "", 16).toString())));
                while (binaryString.length() < 4)
                {
                    binaryString.insert(0, "0");
                }
                reverseString = Integer.toHexString(Integer.valueOf(reverse(binaryString.toString()),2));
                if((reverseString).toUpperCase().equals(reverseString))
                {
                    result.append(reverseString);
                }
                else {
                    result.append((reverseString).toUpperCase());
                }
            }
            else {
                result.append(s.charAt(i));
            }
        }
        return String.valueOf(result);
    }

    public static String reverse(String s)
    {
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--)
        {
            result.append(s.charAt(i));
        }
        return String.valueOf(result);
    }
}
