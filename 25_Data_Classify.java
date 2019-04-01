import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) 
        {
            int iNum = scan.nextInt();
            String[] iStr = new String[iNum];
            for(int i = 0 ; i < iNum ; i++){
                iStr[i] = Integer.toString(scan.nextInt());
            }

            int rNum = scan.nextInt();
            TreeSet<Integer> ts = new TreeSet<Integer>();
            for(int i = 0 ; i < rNum ; i++){
                ts.add(scan.nextInt());
            }

            dataClassific(iStr, ts);
        }	
        scan.close();
    }
    
    private static void dataClassific(String[] iStr , TreeSet<Integer> ts)
    {
        StringBuilder sb = new StringBuilder();
        int length = iStr.length;
        String temp_ts = "";
        Iterator<Integer> it = ts.iterator();
        int total_count = 0;
        while(it.hasNext())
        {
            int count = 0;
            temp_ts = it.next().toString();
            for(int i = 0 ; i < length ; i++)
            {
                if(iStr[i].contains(temp_ts))
                {
                    count++;
                }
            }
            if(count > 0)
            {
                sb.append(temp_ts + " " + count + " ");
                total_count = total_count + 2 + count * 2;
                for(int i = 0 ; i < length ; i++)
                {
                    if(iStr[i].contains(temp_ts))
                    {
                        sb.append(i + " " + iStr[i] + " ");
                    }
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(total_count + " " + sb);
    }
}
