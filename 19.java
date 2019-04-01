
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new LinkedHashMap<>();
        while (scanner.hasNext())
        {
            //文件路径
            String filePath = scanner.next();
            String fileName = getFileName(filePath);
            //错误行号
            int lineNum = scanner.nextInt();
            if(fileName.length() > 16)
            {
                fileName = fileName.substring(fileName.length() - 16);
            }
            //错误记录key
            String errorKey = fileName + " " + lineNum;
            if (!hashMap.containsKey(errorKey))
            {
                hashMap.put(errorKey, 1);
            }
            else
                {
                hashMap.put(errorKey, hashMap.get(errorKey) + 1);
            }
        }
        Out(hashMap);
        scanner.close();
    }

    public static String getFileName(String filePath)
    {
        String[] str_total = filePath.split("\\\\");
        return str_total[str_total.length-1];
    }

    public static void Out(HashMap<String, Integer> hashMap)
    {
        int cnt = 0;
        for(String s : hashMap.keySet())
        {
            cnt++;
            if(cnt > hashMap.keySet().size()-8)
            {
                System.out.println(s + " " + hashMap.get(s));
            }
        }
    }
}
