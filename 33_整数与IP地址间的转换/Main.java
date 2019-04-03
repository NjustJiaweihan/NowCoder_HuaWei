import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            String binaryIP = scanner.next();
            String integerIP = scanner.next();

            System.out.println(binary2integer(binaryIP));
            System.out.println(integer2binary(integerIP));
        }
    }

    public static String binary2integer(String binaryIP)
    {
        String[] str = binaryIP.split("\\.");
        String temp ="";
        StringBuilder temps = new StringBuilder();
        for(int i=0; i<str.length; i++)
        {
            temp = Integer.toBinaryString(Integer.parseInt(str[i]));
            while (temp.length() < 8)
            {
                temp = "0" + temp;
            }
            temps.append(temp);
        }
        return Integer.valueOf(String.valueOf(temps), 2).toString();
    }
    
    public static String integer2binary(String integerIP)
    {
        String str = Integer.toBinaryString(Integer.parseInt(integerIP));
        while (str.length() < 32)
        {
            str = "0" + str;
        }
        String strings ="";
        StringBuilder binaryIP = new StringBuilder();
        for(int i=0; i<str.length(); i += 8)
        {
            strings = Integer.valueOf(str.substring(i, i+8), 2).toString();
            binaryIP.append(strings);
            binaryIP.append(".");
        }
        //String.subString(beginIndex, endIndex) 包括beginIndex,不包括endIndex
        return String.valueOf(binaryIP.substring(0, binaryIP.length()-1));
    }
}
