import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //对于多个测试用例写个while循环
        while (scanner.hasNext())
        {
            int n = scanner.nextInt();
            int[] keys = new int[n];
            int i = 0;
            HashMap<Integer, Integer> hashMap = new HashMap<>(n);
            for(int k=0; k<n; k++)
            {
                int key = scanner.nextInt();
                int value = scanner.nextInt();
                if(hashMap.get(key) == null)
                {
                    keys[i] = key;
                    i++;
                    hashMap.put(key, value);
                }
                else
                {
                    hashMap.put(key, hashMap.get(key)+value);
                }
            }
            int[] keys2 = new int[i];
            for(int k=0; k<i; k++)
            {
                keys2[k] = keys[k];
            }
            Arrays.sort(keys2);
            for(int j=0; j<i; j++)
            {
                System.out.println(keys2[j] + " " + hashMap.get(keys2[j]));
            }
        }
        scanner.close();
    }
}
